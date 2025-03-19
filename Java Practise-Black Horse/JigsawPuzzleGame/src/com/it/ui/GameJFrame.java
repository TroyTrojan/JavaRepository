package com.it.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
	//		创建二维数组
	int[][] data = new int[4][4];
	//	记录空白方块在二维数组中的位置
	int x = 0;
	int y = 0;

	//定义一个变量,记录当前展示图片路径
	String path = "JigsawPuzzleGame\\image\\animal\\animal3\\";
	//	定义一个二维数组,存储正确的数据
	int[][] win = new int[][]{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 0}
	};
	//	定义变量用来统计步数
	int step = 0;
	JMenuItem replayItem = new JMenuItem("重新游戏");
	JMenuItem reLoginItem = new JMenuItem("重新登录");
	JMenuItem closeItem = new JMenuItem("关闭游戏");

	JMenuItem accountItem = new JMenuItem("公众号");

	public GameJFrame() {
//		初始化界面
		initJFrame();
//初始化菜单
		initJMenuBar();
//		初始化数据(打乱数据)
		initData();
//初始化图片
		initImage();


		this.setVisible(true);
	}

	private void initData() {
		//        1.定义一个一维数组
		int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//			2.打乱数组中数据的顺序
		Random r = new Random();
		for (int i = 0; i < tempArr.length; i++) {
//			获取到随机索引
			int index = r.nextInt(tempArr.length);
//			拿着遍历到的每一个数据,跟随机索引上的数据进行交换
			int temp = tempArr[i];
			tempArr[i] = tempArr[index];
			tempArr[index] = temp;
		}
//		5.给二维数组添加数据
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == 0) {
				x = i / 4;
				y = i % 4;
			}
			data[i / 4][i % 4] = tempArr[i];

		}

	}

	//初始化图片
	private void initImage() {
//清空原本已经出现的所有图片
		this.getContentPane().removeAll();
		if (victory()) {
//			显示胜利的图标
			JLabel winJLabel = new JLabel(new ImageIcon("D:\\IntelliJ IDEA\\IDEA Project\\Java Practise-Black Horse\\JigsawPuzzleGame\\image\\win.png"));
			winJLabel.setBounds(203, 283, 197, 73);
			this.getContentPane().add(winJLabel);
		}
		JLabel stepCount = new JLabel("步数:" + step);
		stepCount.setBounds(50, 30, 100, 20);
		this.getContentPane().add(stepCount);

		for (int i = 0; i < 4; i++) {
			//		第j排图片加载
			for (int j = 0; j < 4; j++) {
//				获取当前要加载的图片的序号
				int num = data[i][j];
//      创建一个JLable对象(管理容器)
				JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
//		指定图片位置
				jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
//				给图片添加边框
				jLabel.setBorder(new BevelBorder(1));
//		把管理容器添加到界面当中
				this.getContentPane().add(jLabel);
			}
		}
//      创建一个图片ImageIcon对象
		ImageIcon bg = new ImageIcon("JigsawPuzzleGame\\image\\background.png");
		JLabel background = new JLabel(bg);
		background.setBounds(40, 40, 508, 560);
//		把背景图片添加到界面
		this.getContentPane().add(background);
//		刷新界面
		this.getContentPane().repaint();
	}


	private void initJMenuBar() {
		//创建整个的菜单对象
		JMenuBar jMenuBar = new JMenuBar();
//		创建菜单上的两个选项
		JMenu functionJMenu = new JMenu("功能");
		JMenu aboutJMenu = new JMenu("关于我们");
//创建选项下的条目对象
//		JMenuItem replayItem = new JMenuItem("重新游戏");
//		JMenuItem reLoginItem = new JMenuItem("重新登录");
//		JMenuItem closeItem = new JMenuItem("关闭游戏");
//
//		JMenuItem accountItem = new JMenuItem("公众号");
//将每一个选项下面的条目添加到选项当中
		functionJMenu.add(replayItem);
		functionJMenu.add(reLoginItem);
		functionJMenu.add(closeItem);

		aboutJMenu.add(accountItem);
//		给条目绑定事件
		replayItem.addActionListener(this);
		reLoginItem.addActionListener(this);
		closeItem.addActionListener(this);
		accountItem.addActionListener(this);

//将菜单里面的两个选项添加到菜单当中
		jMenuBar.add(functionJMenu);
		jMenuBar.add(aboutJMenu);
//		给整个界面设置界面
		this.setJMenuBar(jMenuBar);
	}

	private void initJFrame() {
		//		设置宽高
		this.setSize(603, 680);
//		设置标题
		this.setTitle("拼图单机版 v1.0");
//		设置置顶
		this.setAlwaysOnTop(true);
//		设置居中
		this.setLocationRelativeTo(null);
//		设置关闭方式
		this.setDefaultCloseOperation(3);
//		取消默认的居中放置,使其按规定的XY轴放置
		this.setLayout(null);
//		给整个界面添加键盘监听事件
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	//按下不松时会调用此方法
	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == 65) {
//			把界面中所有的图片删除
			this.getContentPane().removeAll();
//			加载第一张完整的图片
			JLabel all = new JLabel(new ImageIcon(path + "" +
					"all.jpg"));
			all.setBounds(83, 134, 420, 420);
			this.getContentPane().add(all);
			//加载背景图片
			//      创建一个图片ImageIcon对象
			ImageIcon bg = new ImageIcon("JigsawPuzzleGame\\image\\background.png");
			JLabel background = new JLabel(bg);
			background.setBounds(40, 40, 508, 560);
//		把背景图片添加到界面
			this.getContentPane().add(background);
//		刷新界面
			this.getContentPane().repaint();
		}
	}

	//按键释放时调用此方法
	@Override
	public void keyReleased(KeyEvent e) {
//		判断游戏是否胜利,如果胜利直接结束此方法,不再执行以下代码
		if (victory()) {
//			return两个作用:返回结果,结束方法
			return;
		}

		int code = e.getKeyCode();
//		向左移动
		if (code == 37) {
			if (y == 3) {
				return;
			}
//			把空白方块右方的数字往左移动
			data[x][y] = data[x][y + 1];
			data[x][y + 1] = 0;
			y++;
//			每移动一次,步数加一
			step++;
			//调用方法按照最新的数字加载图片
			initImage();
//		向上移动
		} else if (code == 38) {
			if (x == 3) {
				return;
			}
//			把空白方块下方的数字往上移动
			data[x][y] = data[x + 1][y];
			data[x + 1][y] = 0;
			x++;
			//			每移动一次,步数加一
			step++;
//调用方法按照最新的数字加载图片
			initImage();
//		向右移动
		} else if (code == 39) {
			if (y == 0) {
				return;
			}
//			把空白方块左方的数字往右移动
			data[x][y] = data[x][y - 1];
			data[x][y - 1] = 0;
			y--;
			//			每移动一次,步数加一
			step++;
			//调用方法按照最新的数字加载图片
			initImage();
//		向下移动
		} else if (code == 40) {
			if (x == 0) {
				return;
			}
//			把空白方块上方的数字往下移动
			data[x][y] = data[x - 1][y];
			data[x - 1][y] = 0;
			x--;
			//			每移动一次,步数加一
			step++;
//调用方法按照最新的数字加载图片
			initImage();
		} else if (code == 65) {
			initImage();
		} else if (code == 87) {
			data = new int[][]{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12},
					{13, 14, 15, 0}
			};
			initImage();
		}
	}

	//	判断data数组中的数据跟win数组中的数据是否相同
	public boolean victory() {
		for (int i = 0; i < data.length; i++) {
//			i:依次表示二维数组data里面的索引
//					data[i]:依次表示每一个一维数组
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] != win[i][j]) {
//					只要有一个数据不一样,则返回false
					return false;
				}
			}
		}
//		循环结束表示数组遍历比较完毕,全都一样返回true
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//获取当前被点击的条目对象
		Object obj = e.getSource();
		if (obj == replayItem) {
			//		计步器清零
			step = 0;
//再次打乱数据
			initData();
//		重新加载图片
			initImage();

		} else if (obj == reLoginItem) {
//关闭当前页面
			this.setVisible(false);
//打开登陆页面
			new LoginJFrame();

		} else if (obj == closeItem) {
//直接关闭虚拟机
			System.exit(0);

		} else if (obj == accountItem) {
//创建一个弹框对象
			JDialog jDialog = new JDialog();
//	创建一个管理图片的容器对象
			JLabel jLabel = new JLabel(new ImageIcon("JigsawPuzzleGame\\image\\about.png"));
			jLabel.setBounds(0, 0, 258, 258);
//			把图片添加到弹框当中
			jDialog.getContentPane().add(jLabel);
//			给弹框设置大小
			jDialog.setSize(344, 344);
//			让弹框置顶
			jDialog.setAlwaysOnTop(true);
//			让弹框居中
			jDialog.setLocationRelativeTo(null);
//			弹框不关闭无法操作其他页面
			jDialog.setModal(true);
//					让弹框显示出来
			jDialog.setVisible(true);


		}

	}
}

