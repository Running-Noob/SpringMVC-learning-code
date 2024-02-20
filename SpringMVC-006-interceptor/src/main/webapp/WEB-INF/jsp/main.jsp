<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<h2>欢迎${user.username}</h2>
<form action="${pageContext.request.contextPath}/logout">
    <input type="submit" value="退出登录">
</form>
</body>
</html>
