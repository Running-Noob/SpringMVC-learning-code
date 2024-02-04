<%--index.jsp文件--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>get请求</h1>
<form action="${pageContext.request.contextPath}/req.action" method="get">
    用户名：<input name="getUsername" value="">
    密  码：<input name="getPassword" value="">
    <input type="submit" value="get请求提交">
</form>
<br/>
<h1>post请求</h1>
<form action="${pageContext.request.contextPath}/req.action" method="post">
    用户名：<input name="postUsername" value="">
    密  码：<input name="postPassword" value="">
    <input type="submit" value="post请求提交">
</form>
<br/>
<h1>五种数据提交方式</h1>
<h2>1.单个数据提交</h2>
    <form action="${pageContext.request.contextPath}/one.action" method="post">
        姓名：<input name="name" value="">
        年龄：<input name="age" value="">
        <input type="submit" value="提交">
    </form>
<h2>2.对象封装数据提交</h2>
    <form action="${pageContext.request.contextPath}/two.action" method="post">
        姓名：<input name="uname" value="">
        年龄：<input name="uage" value="">
        <input type="submit" value="提交">
    </form>
<h2>3.动态占位符提交</h2>
    <a href="${pageContext.request.contextPath}/three/张三/22.action">动态占位符提交</a>
<h2>4.映射名称不一致</h2>
    <form action="${pageContext.request.contextPath}/four.action" method="post">
        姓名：<input name="uname" value="">
        年龄：<input name="uage" value="">
        <input type="submit" value="提交">
    </form>
<h2>5.手工提取数据</h2>
    <form action="${pageContext.request.contextPath}/five.action" method="post">
        姓名：<input name="uname" value="">
        年龄：<input name="uage" value="">
        <input type="submit" value="提交">
    </form>
</body>
</html>