<%--index.jsp文件--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mydate.action">
    日期：<input type="date" name="mydate">
    <br/>
    <input type="submit" value="提交">
</form>
</body>
</html>