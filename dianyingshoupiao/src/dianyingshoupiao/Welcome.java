package dianyingshoupiao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;


public class Welcome {
	 XuanZeJieMian b=new XuanZeJieMian();
//	DianYingMuLu a = new DianYingMuLu();
	// JieMianCaoZuo b= new JieMianCaoZuo();
		 public void welcome(){   //sΪ����  nΪѡ�������
				final JFrame frm = new JFrame("�Ϻ�Ӱ�ǣ�");
				frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				JPanel xianshi=new JPanel();
				frm.getContentPane().add(xianshi,BorderLayout.CENTER);
				JLabel xinxi = new JLabel();
				JButton ok = new JButton("ȷ��");   
				xinxi.setText(" ��ӭ�����Ϻ�Ӱ�ǣ�");
				ImageIcon t = new ImageIcon(".//yingyuan.jpg");
				xinxi.setIcon(t);
				xinxi.setVerticalTextPosition(JLabel.BOTTOM);
				xinxi.setHorizontalTextPosition(JLabel.CENTER);
				KeHuDuan.jmcz.ziti(xinxi,35);
				//xinxi.setFont(font);;
				//xinxi.setL
			//	xinxi.setHorizontalAlignment(JTextField.CENTER);
				xianshi.add(xinxi);
				frm.getContentPane().add(ok,BorderLayout.SOUTH);
				KeHuDuan.jmcz.kejian(frm);
				ok.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
						//	a.dianyingmulu();
							b.xuanzejm();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						frm.dispose();
					}
				});
				
				
	 }

}

 