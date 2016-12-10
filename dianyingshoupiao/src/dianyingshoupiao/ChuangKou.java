package dianyingshoupiao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public  class ChuangKou {
	   JFrame frm ;
	   JPanel zhong=new JPanel();
	  
   void chuangkou1(String s){
	    frm = new JFrame(s);
	    frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frm.getContentPane().add(zhong,BorderLayout.CENTER);
		
		JButton ok = new JButton("È·¶¨ ");  
		//zhong.add(xinxi);
		frm.getContentPane().add(ok,BorderLayout.SOUTH);
		ok.addActionListener(new ActionListener(){

			@Override
			public  void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
			//	dianyingjiemian();
				
				frm.dispose();
			}
		});
	//	JPanel xianshi=new JPanel();
	//	frm.getContentPane().add(xianshi,BorderLayout.CENTER);
		
		KeHuDuan.jmcz.kejian(frm);
   }
   void tianjiabiaoqian(JLabel[] a,int i){
	   while(i!=0){
	   zhong.add(a[i]);
	   i--;
   }
}
}
