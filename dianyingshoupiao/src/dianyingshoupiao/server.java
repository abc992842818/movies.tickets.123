import java.io.*;

import java.net.ServerSocket; 
import java.net.Socket; 

public class server {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	static int num1=1;
	public void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		try{
			serverSocket = new ServerSocket(4444);
		}catch(Exception e){
			System.out.println("Error:"+e);
			System.exit(-1);
		}
		Socket client  = null;
		try{
			client = serverSocket.accept();
		}catch(Exception e){
			System.out.println("��������ʧ��!");
			System.exit(-1);
		}
		System.out.println("Client["+server.num1+"]��¼........");
		ServerThread st = new ServerThread(client);
	    Thread t = new Thread(st);
	    t.start();
	    try{
	    	serverSocket.close();
	    }catch(Exception e){
	    	System.out.println("�ر�ʧ��!");
	    }
	    num1++;
	}
}
class ServerThread implements Runnable{
	    int i=0;
	    int j=0;
		private Socket client;
		public ServerThread(Socket client){
			this.client=client;
		}
	    public void run(){
	    	try{
	    FileInputStream fis = new FileInputStream(".//dianyingpiao.dat");
		ObjectInputStream in = new ObjectInputStream(fis);
		Information ifm ;
		BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
		int dyh  = is.read();
		PrintWriter os = new PrintWriter(client.getOutputStream());
		while(true){
			ifm= (Information)in.readObject();
		if(dyh==(ifm.number)){
			os.println(dyh+"�ŵ�Ӱ��Ӧ�ĵ�Ӱ��ϢΪ:"+ifm.information);
		os.flush();
		break;
		}
		
		}
		fis.close();
		int sj=is.read();
		FileInputStream fis2 = new FileInputStream(".\\zuowei.dat");
		ObjectInputStream in2 = new ObjectInputStream(fis2);
		changci[][] cc1=new changci[6][3];
			for(i=0;i<6;i++){
				for(j=0;j<3;j++){
					changci cc=(changci)in.readObject();
					//cc1[i][j].dianying=cc.dianying;
					//cc1[i][j].shijian=cc.shijian;
					cc1[i][j].seat=cc.seat;
					}
			}
			fis2.close();
			for(i=0;i<5;i++)
				for(j=0;j<5;j++){
					os.println(cc1[dyh-1][sj-1].seat[i][j]);
					cc1[dyh-1][sj-1].seat[i][j]=1;
				}//��Ʊʱ���ÿյ���λ��Ϊ��ռ�У�����0��Ϊ1
		@SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream(".\\zuowei.dat");
		for(i=0;i<5;i++)
			for(j=0;j<5;j++){
			fos.write(cc1[dyh-1][sj-1].seat[i][j]);
		}
		String tp[]= new String[2];
		String s=is.readLine();
		int m[] = new int [2];
		tp=s.split("/");
		for(i=0;i<2;i++)
			m[i]=Integer.parseInt(tp[i]);
		cc1[dyh-1][sj-1].seat[m[0]][m[1]]=0;
		for(i=0;i<5;i++)
			for(j=0;j<5;j++){
				fos.write(cc1[dyh-1][sj-1].seat[i][j]);
			}//��Ʊ����������λ����ռ�б�Ϊ��
		@SuppressWarnings("unused")
		String str1 = is.readLine();//�ѹ��ڵ����۶�������
		FileWriter fw= new FileWriter(".\\pinglun.txt");
		while(true){
			if(str1.isEmpty()){//����ǿվ�ֹͣ
				break;
			}else
				fw.write(str1);//������д���ļ�
		}
		fw.close();
		FileReader fr = new FileReader(".\\pinglun");
		BufferedReader br = new BufferedReader(fr);
		while((str1=br.readLine())!=null){
			os.println(str1);//�����е����۶��ÿͻ��˴�ӡ����
		}
	    	}catch (IOException e){
	    		e.printStackTrace();
	    	} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
@SuppressWarnings("serial")
class Information implements Serializable{
	int number ;
	String information;
	Information(int num,String s){
		number=num;
		information=s;
	}
}
@SuppressWarnings("serial")
class changci implements Serializable{
	//int dianying;
	//int shijian;
	int seat[][] = new int [5][5];
	changci(){
	
	}
}

