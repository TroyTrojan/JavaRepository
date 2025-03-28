<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录</title>
<style>
        * {
            padding: 0;
            margin: 0;
        }

        html {
            height: 100%;
        }

        body {
            background-image: linear-gradient(to bottom right, rgb(114, 135, 254), rgb(130, 88, 186));
        }

        .login-container {
            width: 600px;
            /* height: 315px; */
            height: 364px;
            margin: 0 auto;
            margin-top: 10%;
            border-radius: 15px;
            box-shadow: 0 10px 50px 0px rgb(59, 45, 159);
            background-color: rgb(95, 76, 194);
        }

        .left-container {
            display: inline-block;
            width: 330px;
            border-top-left-radius: 15px;
            border-bottom-left-radius: 15px;
            padding: 60px;
            background-image: linear-gradient(to bottom right, rgb(118, 76, 163), rgb(92, 103, 211));
        }

        .title {
            color: #fff;
            font-size: 18px;
            font-weight: 200;
        }

        .title span {
            border-bottom: 3px solid rgb(237, 221, 22);
        }

        .input-container {
            padding: 20px 0;
        }

        input {
            border: 0;
            background: none;
            outline: none;
            color: #fff;
            margin: 20px 0;
            display: block;
            width: 100%;
            padding: 5px 0;
            transition: .2s;
            border-bottom: 1px solid rgb(199, 191, 219);
        }

        #num {
            width: 50%;
        }

        input:hover {
            border-bottom-color: #fff;
        }

        ::-webkit-input-placeholder {
            color: rgb(199, 191, 219);
        }

        .message-container {
            font-size: 14px;
            transition: .2s;
            color: rgb(199, 191, 219);
            cursor: pointer;
        }

        .message-container:hover {
            color: #fff;
        }

        .right-container {
            width: 145px;
            display: inline-block;
            height: calc(100% - 120px);
            vertical-align: top;
            padding: 60px 0;
        }

        .regist-container {
            text-align: center;
            color: #fff;
            font-size: 18px;
            font-weight: 200;
        }

        .regist-container span {
            border-bottom: 3px solid rgb(237, 221, 22);
        }

        .action-container {
            font-size: 10px;
            color: #fff;
            text-align: center;
            position: relative;
            top: 200px;
        }

        .action-container input {
            width: 83px;
            border: 1px solid rgb(237, 221, 22);
            padding: 10px;
            display: inline;
            line-height: 20px;
            border-radius: 20px;
            position: absolute;
            bottom: -26px;
            left: calc(72px - 42px);
            transition: .2s;
            cursor: pointer;
        }

        .action-container input:hover {
            background-color: rgb(237, 221, 22);
            color: rgb(95, 76, 194);
        }

        .p {
            display: block;
            width: 60px;
            height: 40px;
            position: absolute;
            left: 760px;
            top: 380px;
        }
          #h {
            display: inline-block;
            width: 99px;
            font-size: 1px;
            position: absolute;
            left: 760px;
            top: 421px;
        }
    </style>
    <script type="text/javascript">
    function _change() {
        var imgEle = document.getElementById("code"); // 获得图片控件元素
        imgEle.src = "./Text?" + new Date().getTime();
    }
</script>
</head>
<body>
	<form action="./LoginServlet" method="POST">
        <div class="login-container">
            <div class="left-container">
                <div class="title"><span>登录</span></div>
        			<%String username = (String) session.getAttribute("username");
        				if (username == null){
            				username = "";
        								}%>
                <div class="input-container">
                    <input type="text" name="username" placeholder="用户名" value="<%=username%>">
                    <input type="password" name="password" placeholder="密码">
                    <input type="text" name="VerifyCode" placeholder="验证码" id="num">
                    <div id="p"><img src="./Text" id="code" class="p"></div>
                    <a href="javascript:_change()" id="h">看不清?换一张</a>
                </div>
                <div class="message-container">
                    <span>忘记密码</span>
                </div>
            </div>
            <div class="right-container">
                <div class="regist-container">
                    <span class="regist">欢迎</span>
                </div>
                <div class="action-container">
                    <input type="submit" value="登录">
                </div>
            </div>
        </div>
    </form>
</body>
</html>