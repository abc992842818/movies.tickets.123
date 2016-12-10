package dianyingshoupiao;


import java.io.*;


//import javax.swing.*;
//import javax.swing.ImageIcon;


public class DianYingMuLu {
	int n=7;
   void dianyingmulu() throws IOException{
	   ChuangKou a =new ChuangKou();
	   a.chuangkou1("«Î—°‘ÒµÁ”∞£°");
	//   JLabel[] dianying=new JLabel[n];
	//   JLabel[] dianyinghaibao=new JLabel[n];
	 //  ImageIcon []t = new ImageIcon[n]; 
	   FileReader mulu = new FileReader(".\\dianyingmulu.txt");
	   
	 //  FileReader dianyingtupian = new FileReader(".\\dianyingtupian\\1.jpg");
	   KeHuDuan.jmcz.duquwenjian2(mulu,a.zhong);
//	   KeHuDuan.jmcz.duquwenjian2(dianyingtupian,dianyinghaibao,n);
	 //  KeHuDuan.jmcz.tupianduqu(dianyingtupian, );
	//   a.tianjiabiaoqian(dianying, n); 
	//   Icon tu;
	//   try(BufferedReader bufferedReader=new BufferedReader(dianyingtupian)){
   //		while((value=bufferedReader.readLine())!=null){
   	//		ImageIcon t = new ImageIcon(value);
   			
   	//	}
   	}
   }

