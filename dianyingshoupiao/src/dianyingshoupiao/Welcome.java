package dianyingshoupiao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Welcome {
	 XuanZeJieMian a=new XuanZeJieMian();
	 JieMianCaoZuo b= new JieMianCaoZuo();
		 public void welcome(){   //s为标题  n为选择的内容
				final JFrame frm = new JFrame("上海影城！");
				frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			//	JPanel xianshi=new JPanel();
			//	frm.getContentPane().add(xianshi,BorderLayout.CENTER);
			//	JTextField xinxi = new JTextField();
				JButton ok = new JButton("欢迎光临！");   
			//	xinxi.setText(n);
			//	xianshi.add(xinxi);
				frm.getContentPane().add(ok,BorderLayout.CENTER);
				ok.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						a.xuanzejm("请选择电影", "124");
						frm.dispose();
					}
				});
				b.kejian(frm);
				
	 }

}

 