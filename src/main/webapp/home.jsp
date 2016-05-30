<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-5-27
  Time: 下午4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这里是主页的内容</title>
</head>
<body>
<p>这里是主页的内容</p>
<p>下面是所有的主题</p>
<c:forEach items="${themes}" var="theme">
    <p>${theme.theme_title}</p>
    <p>${theme.theme_content}</p>
</c:forEach>
</body>
</html>
