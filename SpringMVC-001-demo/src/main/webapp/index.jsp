<%--index.jsp文件--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
  <a href="${pageContext.request.contextPath}/hello/demo.action">访问hello服务器</a>
  <br/>
  <a href="${pageContext.request.contextPath}/hi/demo.action">访问hi服务器</a>
</body>
</html>