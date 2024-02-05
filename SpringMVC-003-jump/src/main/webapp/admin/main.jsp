<%--main.jsp文件--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<h1>main</h1>
<%--
    request.setAttribute("requestUser", user);
    session.setAttribute("sessionUser", user);
    model.addAttribute("modelUser", user);
    map.put("mapUser", user);
    modelMap.addAttribute("modelMapUser", user);
--%>
requestUser：${requestUser}<br/>
sessionUser：${sessionUser}<br/>
modelUser：${modelUser}<br/>
mapUser：${mapUser}<br/>
modelMapUser：${modelMapUser}<br/>
从index.jsp页面得到的数据：${param.name}<br/>
</body>
</html>
