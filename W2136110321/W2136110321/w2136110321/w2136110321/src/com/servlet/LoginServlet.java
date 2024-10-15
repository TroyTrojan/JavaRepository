package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //获取表单中提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String VerifyCode = request.getParameter("VerifyCode");
        //从当前会话（session）中获取名为 "sessionVerifyCode" 的属性，并将其转换为字符串类型（String）。
        String sessionVerifyCode = (String) request.getSession().getAttribute("sessionVerifyCode");
        //验证用户名和密码，如果正确，跳转到success.jsp,如果错误，回到login.jsp
        if ("admin".equalsIgnoreCase(username) && "1111".equals(password) && sessionVerifyCode.equalsIgnoreCase(VerifyCode)) {
            // 登录成功
            HttpSession session = request.getSession();
            session.setAttribute("username", username); // 向HttpSession域中保存用户名
            response.sendRedirect("./success.jsp");
        } else if (!"admin".equalsIgnoreCase(username) || !"1111".equals(password)) {
            // 登录失败
            response.getWriter().print("登录失败，用户名或密码错误。");
        } else {
            response.getWriter().print("验证码错误，请重试。");
        }
    }

}
