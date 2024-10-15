package com.servlet;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

public class VerifyCode {
	private int width = 150; // 宽度
	private int height = 70; // 高度
	private Color bgColor = new Color(240,240,240);//背景色
	private String codes = "3456789abdefghjkmnpqrtuvwxyABDEFGHJKLMNPQRTUVWXY";
	private Random r = new Random(); //随机数生成器
	private String[] fontNames = {"宋体","微软雅黑","黑体","仿宋","华文行楷"};
	
	private String text;
	// 得到codes的长度内的随机数，并使用charAt取得随机数位置上的codes中的字符
	private char randomChar() {
		int index = r.nextInt( codes.length() );
		return codes.charAt(index);
	}
	// 生成随机字体
	private Font randomFont() {
		int index = r.nextInt(fontNames.length);
		String fontName = fontNames[ index ];
		int style = r.nextInt(4);
		int size = 50 + r.nextInt(5);
		return new Font(fontName,style,size);
	}
	// 生成随机颜色
	private Color randomColor() {
		int red = r.nextInt(180);
		int green = r.nextInt(180);
		int blue = r.nextInt(180);
		return new Color(red,green,blue);
	}
	// 画干扰点
	private void drawLine( BufferedImage image ) {
		int num = 500;
		Graphics2D g2 = (Graphics2D) image.getGraphics();
		for(int i = 0; i < num; i++) {
			int x = r.nextInt(width);
			int y = r.nextInt(height);
			g2.setColor(randomColor());
			g2.setStroke(new BasicStroke(1.5F));
			g2.drawLine(x, y, x, y);
		}
	}
	// 创建一张验证码的图片
	public BufferedImage creatImage() {
		// 先创建一个画布，image对象
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);//得到一个图片缓冲区（缓存，放字母
		
		Graphics2D g2 = (Graphics2D) image.getGraphics();//理解成一个画笔
		g2.setColor(bgColor); //给画笔上色
		g2.fillRect(0, 0, width, height); //填充一个矩形
		g2.setColor(Color.RED); //再换一个颜色
		g2.drawRect(0,0,width-1,height-1); //画一个矩形框
		
		StringBuilder stringBuilder = new StringBuilder();
		
		//填充内容（四个字符）
		for(int i = 0; i < 4; i++) {
			String str = randomChar() + ""; // 'c' -> "c"
			stringBuilder.append(str);
			
			g2.setColor( randomColor() );
			g2.setFont( randomFont() );
			int x = width / 4 * i + 10;
			g2.drawString(str, x, height - 20);
		}
		
		text = stringBuilder.toString();
		
		drawLine(image); // 调用画线的方法画干扰线
		
		return image;
	}
	
//	两个参数：1、电子版图片（BufferedImage里面保存的数据，creatImage方法的返回值）
//	2、输出流，如果要输出到文件，文件输出流；如果要输出到网页，响应输出流
	public void output(BufferedImage bi, OutputStream out) {
		try {
			ImageIO.write(bi, "JPEG", out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 得到验证码的文本信息，与用户输入的文本进行比对
	public String getText(){
		return text;
	}
}
