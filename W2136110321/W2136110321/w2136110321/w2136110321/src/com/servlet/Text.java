package com.servlet;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Text")
public class Text extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jpeg"); // 设置响应体类型
		VerifyCode code = new VerifyCode(); //构造VerifyCode类的对象
		BufferedImage image = code.creatImage(); //调用code对象的生成验证码图片的方法
        String text = code.getText(); // 获取验证码文本
        System.out.println("text = " + text);
        // 将验证码文本保存到session中
        request.getSession().setAttribute("sessionVerifyCode", text); 
        code.output(image, response.getOutputStream()); // 将验证码图片输出响应流
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
