<%--index.jsp文件--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>SpringMVC的四种跳转方式</h1>
<a href="${pageContext.request.contextPath}/one.action">1.请求转发页面(默认)</a>
<br/>
<a href="${pageContext.request.contextPath}/two.action">2.请求转发action</a>
<br/>
<a href="${pageContext.request.contextPath}/three.action">3.重定向页面</a>
<br/>
<a href="${pageContext.request.contextPath}/four.action">4.重定向action</a>
<br/>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/data.action?name=lili">访问服务器，携带数据跳转</a>
</body>
</html>