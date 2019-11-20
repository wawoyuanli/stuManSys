<%--
  Created by IntelliJ IDEA.
  User: space
  Date: 2019-11-19
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <title>用户注册</title>

    <style type="text/css">
        #body{
            /*background-image: url(http://n.sinaimg.cn/sinacn10/765/w1200h1165/20180406/2728-fysuuyc1109965.jpg);*/
            /*background-repeat: no-repeat;*/
            /*background-size:cover;*/
            background-color:#d0e4fe;
        }
    </style>
</head>
<body id="body">
<div class="container" style="margin-top:100px">
    <h3 class="text-center">注册</h3>

    <div class="col-md-5 mx-auto">

        <form id="loginForm" action="${pageContext.request.contextPath}/login/register" method="post">

            <div class="form-group">
                <input id="username" type="text" name="username" class="form-control" placeholder="用户名">
                <span id="alertUsername" style="color:red;"></span>
            </div>

            <div class="form-group">
                <input id="password" type="password" name="password" class="form-control" placeholder="密码">
                <span id="alertPassword" style="color:red;"></span>
            </div>

            <span id="alertFailure" style="color:red;"></span>
            <button id="registButton" class="btn btn-primary btn-lg btn-block" >注册</button>

        </form>
        <span style="margin-left:200px"><a href="index.jsp">返回登录</a></span>

    </div>
</div>

<!-- JavaScript -->
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

</body>
</html>
