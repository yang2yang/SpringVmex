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
<c:choose>
    <c:when test="${user!=null}">
        <p>hello,${user.username}</p>
        <p><a href="#">注销</a></p>
    </c:when>
    <c:otherwise>
        <p><a href="/signin">登录</a></p>
        <p><a href="/signup">注册</a></p>
    </c:otherwise>
</c:choose>
<p>这里是主页的内容</p>
<p>下面是所有的主题</p>
<c:forEach items="${themes}" var="theme">
    <p><a href="/t/${theme.theme_id}">${theme.theme_title}</a></p>
    <p>${theme.theme_content}</p>
</c:forEach>
</body>
</html>
