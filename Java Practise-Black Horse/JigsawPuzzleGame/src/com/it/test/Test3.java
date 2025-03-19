package com.it.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(438, 466);
		jFrame.setTitle("事件演示");
		jFrame.setAlwaysOnTop(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(null);

		JButton jtb = new JButton("点我啊");
		jtb.setBounds(0, 0, 100, 50);
//		jtb.addActionListener(new MyActionListener() {
//		});
		jtb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("不要点我噢");
			}
		});
		jFrame.getContentPane().add(jtb);


		jFrame.setVisible(true);
	}
}
