package dianyingshoupiao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Welcome {
	 XuanZeJieMian a=new XuanZeJieMian();
	 JieMianCaoZuo b= new JieMianCaoZuo();
		 public void welcome(){   //sΪ����  nΪѡ�������
				final JFrame frm = new JFrame("�Ϻ�Ӱ�ǣ�");
				frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			//	JPanel xianshi=new JPanel();
			//	frm.getContentPane().add(xianshi,BorderLayout.CENTER);
			//	JTextField xinxi = new JTextField();
				JButton ok = new JButton("��ӭ���٣�");   
			//	xinxi.setText(n);
			//	xianshi.add(xinxi);
				frm.getContentPane().add(ok,BorderLayout.CENTER);
				ok.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						a.xuanzejm("��ѡ���Ӱ", "124");
						frm.dispose();
					}
				});
				b.kejian(frm);
				
	 }

}

 