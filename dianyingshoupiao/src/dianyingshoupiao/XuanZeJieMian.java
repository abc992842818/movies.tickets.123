package dianyingshoupiao;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class XuanZeJieMian {

	public void xuanzejm(String s,String n){   //s为标题  n为选择的内容
	final JFrame frm = new JFrame(s);
	frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	JPanel xianshi=new JPanel();
	frm.getContentPane().add(xianshi,BorderLayout.CENTER);
	JTextField xinxi = new JTextField();
	JButton ok = new JButton("确定 ");   
	xinxi.setText(n);
	xianshi.add(xinxi);
	frm.getContentPane().add(ok,BorderLayout.SOUTH);
	ok.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		//	dianyingjiemian();
			frm.dispose();
		}
	});
	}
	
//	ok.addActionListener(btnHandler);
//	MouseListener mouse = new MouseListener(xinxi);
	}


/*class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
	}
}
*/
