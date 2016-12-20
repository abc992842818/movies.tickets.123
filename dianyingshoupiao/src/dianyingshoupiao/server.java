import java.io.*;

import java.net.ServerSocket; 
import java.net.Socket; 

public class server {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	static int i,j;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		try{
			server = new ServerSocket(4444);
		}catch(Exception e){
			System.out.println("Error:"+e);
			System.exit(-1);
		}
		Socket client  = null;
		try{
			client = server.accept();
		}catch(Exception e){
			System.out.println("接受请求失败!");
			System.exit(-1);
		}
		/*FileReader dypxx = new FileReader(".\\dianyingpiao.txt");
		BufferedReader a = new BufferedReader(dypxx);
		BufferedReader reader = new BufferedReader(dypxx);
		String str;
		while((str=a.readLine())!=null){
			information[i]=str;
			i++;
		}*/
		FileInputStream fis = new FileInputStream(".//dianyingpiao.dat");
		ObjectInputStream in = new ObjectInputStream(fis);
		Information ifm ;
		BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
		int dyh  = is.read();
		PrintWriter os = new PrintWriter(client.getOutputStream());
		while(true){
			ifm= (Information)in.readObject();
		if(dyh==(ifm.number)){
			os.println(dyh+"号电影对应的电影信息为:"+ifm.information);
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
				}
		String tp[]= new String[2];
		String s=is.readLine();
		int m[] = new int [2];
		tp=s.split("/");
		for(i=0;i<2;i++)
			m[i]=Integer.parseInt(tp[i]);
		cc1[dyh-1][sj-1].seat[m[0]][m[1]]=1;
		
			
			
			
		
		
		
	
	
	

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
