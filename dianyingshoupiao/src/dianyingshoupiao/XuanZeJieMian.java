package dianyingshoupiao;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import java.io.IOException;

import javax.swing.*;

public class XuanZeJieMian {

	@SuppressWarnings("unchecked")
	public void xuanzejm() throws FileNotFoundException, IOException{   //sΪ����  nΪѡ�������
	final JFrame frm = new JFrame("��ѡ���Ӱ��");
	frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	//frm.setLayout(new );
    JPanel xianshi=new JPanel();
	JPanel xia = new JPanel();
	frm.getContentPane().add(xianshi,BorderLayout.CENTER);
	frm.getContentPane().add(xia,BorderLayout.SOUTH);
	//frm.getContentPane().add(xianshi,BorderLayout.CENTER);
	KeHuDuan.jmcz.tupianduqu(xianshi);
	@SuppressWarnings("rawtypes")
	final
	JComboBox xuanze = new JComboBox();
//	JTextArea xinxi = new JTextArea();
	FileReader dianying = new FileReader(".\\dianyingmulu.txt");
//	KeHuDuan.jmcz.duquwenjian(dianying,xinxi);
	String value;
	try(BufferedReader bufferedReader=new BufferedReader(dianying)){
		while((value=bufferedReader.readLine())!=null){
			xuanze.addItem(value);
		}
	JButton ok = new JButton("ȷ�� ");   
//	xinxi.setText(n);
	xia.add(xuanze);
	xia.add(ok);
	//frm.getContentPane().add(ok,BorderLayout.SOUTH);
	ok.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		//	dianyingjiemian();
			String s=(String) xuanze.getSelectedItem();
			String []dy=s.split("\0");
			KeHuDuan.lj.lianjie(dy[0]);
			frm.dispose();
		}
	});
	KeHuDuan.jmcz.kejian(frm);
	}
	}
}
	
//	ok.addActionListener(btnHandler);
//	MouseListener mouse = new MouseListener(xinxi);
	


/*class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
	}
}
*/
