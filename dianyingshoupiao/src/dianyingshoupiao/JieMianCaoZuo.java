package dianyingshoupiao;

import java.awt.*;
import java.io.*;

import javax.swing.*;


public class JieMianCaoZuo {
    void kejian(JFrame f){
    //	GridLayout buju = new GridLayout(0,1);
    	f.setSize(700,500);
		f.setLocation(300,100);
		f.setVisible(true);
		//flowlayout.setAlignment(FlowLayout.CENTER);
	//	flowlayout.setVgap(10);
		//flowlayout.setHgap(20);
	//	f.setLayout(buju);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void ziti(JLabel x,int zihao){
    	Font mf = new Font(Font.DIALOG,Font.CENTER_BASELINE,zihao);
        x.setFont(mf);
    }
    void duquwenjian(FileReader wenjian,JTextArea xianshi) throws FileNotFoundException, IOException{
    	String value;
    	xianshi.setLineWrap(true);
    	try(BufferedReader bufferedReader=new BufferedReader(wenjian)){
    		while((value=bufferedReader.readLine())!=null){
    			String a2=value;
    	  		// System.out.println(a2+"\n");
    			xianshi.append("\n"+a2+"\n");
    		}
    		
    	}
    	
    }
    void duquwenjian2(FileReader wenjian,JPanel p) throws IOException{
    	String value;
    	//xianshi.setLineWrap(true);
    	//String[] xinxi=new String[m];
    //	int i=0;
    	
    	//ImageIcon[] array = new ImageIcon[10];
    	/*String[] array = new String[10];
    	BufferedImage image;
    	File tupian = new File(".//dianyingtupian");//根据你实际情况改文件路径吧
    	//array[0] = image;
    	int i=0;
    	while((image=ImageIO.read(tupian))!=null){
    		String s=image.toString();
    		array[i]=s;
    		i++;
    	}
    	image.
    	int j=0;*/
    	try(BufferedReader bufferedReader=new BufferedReader(wenjian)){
    		while((value=bufferedReader.readLine())!=null){
    			//xinxi[i]=value;
    			JLabel a = new JLabel();
    	  		// System.out.println(a2+"\n");
    			//xianshi.append("\n"+a2+"\n");
    			// a[i].setText(value);
    			
    			a.setText(value+"\n");
    			//a.setIcon(array[j]);
    		//	j++;
    			ziti(a,20);
    			p.add(a);
    		}
    		
    	}
    	wenjian.close();
    };
    void tupianduqu(JPanel tu) throws IOException{
    	int i;
    	//Rectangle r = new Rectangle();
    	//r.setBounds(10, 10, 10, 10);
    	for(i=1;i<3;i++){
    		String s=toString(i);
    	ImageIcon t = new ImageIcon(s);
    		JLabel tt=new JLabel();
    	 	//tt.
    		//tt.setBounds(r);
    		tt.setIcon(t);
    		//tt.setText(s);
    		tu.add(tt);
 
    	}
    };
    public String toString(int i){
    	return  ".//"+i+".jpg";
    }
    
}
