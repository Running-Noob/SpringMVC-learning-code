<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<h2>登录</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username"><br>
    密  码：<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
<h3>${msg}</h3>
</body>
</html>
