<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎</title>
</head>
<body>
	<%String username = request.getSession().getAttribute("username").toString();%>
	欢迎<%=username %>，登录成功！
</body>
</html>