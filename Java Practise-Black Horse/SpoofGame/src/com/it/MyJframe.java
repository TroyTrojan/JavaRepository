package com.it;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {

	JButton yesBut = new JButton("帅爆了");
	JButton midBut = new JButton("一般般吧");
	JButton noBut = new JButton("不帅，有点磕碜");
	JButton dadButton = new JButton("求求你饶了我吧");
	boolean flag = false;


	public MyJframe() {
		initJFrame();


		initView();


		//显示
		this.setVisible(true);
	}

	private void initView() {

		this.getContentPane().removeAll();

		if (flag) {
			dadButton.setBounds(50, 20, 140, 30);
			dadButton.addActionListener(this);
			this.getContentPane().add(dadButton);
		}


		JLabel text = new JLabel("你觉得自己帅吗？");
		text.setFont(new Font("微软雅黑", 0, 30));
		text.setBounds(120, 150, 300, 50);


		yesBut.setBounds(200, 250, 100, 30);
		midBut.setBounds(200, 325, 100, 30);
		noBut.setBounds(160, 400, 180, 30);

		yesBut.addActionListener(this);
		midBut.addActionListener(this);
		noBut.addActionListener(this);

		this.getContentPane().add(text);
		this.getContentPane().add(yesBut);
		this.getContentPane().add(midBut);
		this.getContentPane().add(noBut);

		this.getContentPane().repaint();
	}

	private void initJFrame() {
		//设置宽高
		this.setSize(500, 600);
		//设置标题
		this.setTitle("恶搞好基友");
		//设置关闭模式
		this.setDefaultCloseOperation(3);
		//置顶
		this.setAlwaysOnTop(true);
		//居中
		this.setLocationRelativeTo(null);
		//取消内部默认布局
		this.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == yesBut) {
			showJDialog("臭狗,你太自信了,我要狠狠的惩罚你");
			try {
				Runtime.getRuntime().exec("shutdown -s -t 360");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
			flag = true;
			initView();
		} else if (source == midBut) {
			showJDialog("臭狗,你还是太自信了,还是要惩罚你");
			try {
				Runtime.getRuntime().exec("shutdown -s -t 3600");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
			flag = true;
			initView();
		} else if (source == noBut) {
			showJDialog("虽然你有自知之明,但我还是要狠狠的惩罚你");
			try {
				Runtime.getRuntime().exec("shutdown -s -t 360");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
			flag = true;
			initView();
		} else if (source == dadButton) {
			showJDialog("这次就放过你");
			try {
				Runtime.getRuntime().exec("shutdown -a");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}

	}


	public void showJDialog(String content) {
		//创建一个弹框对象
		JDialog jDialog = new JDialog();
		//给弹框设置大小
		jDialog.setSize(260, 200);
		//让弹框置顶
		jDialog.setAlwaysOnTop(true);
		//让弹框居中
		jDialog.setLocationRelativeTo(null);
		//弹框不关闭永远无法操作下面的界面
		jDialog.setModal(true);

		//创建Jlabel对象管理文字并添加到弹框当中
		JLabel warning = new JLabel(content);
		warning.setBounds(0, 0, 200, 150);
		jDialog.getContentPane().add(warning);

		//让弹框展示出来
		jDialog.setVisible(true);
	}
}
