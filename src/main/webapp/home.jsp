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
        <p>节点收藏,${user.person_node}</p>
        <p>主题收藏,${user.person_theme}</p>
        <p>特别关注,${user.person_atten}</p>
        <p>金钱,${user.money}</p>
        <p>创作新主题</p>
        <p>0条未读提醒</p>
        <p><a href="#">注销</a></p>
    </c:when>
    <c:otherwise>
        <p><a href="/signin">登录</a></p>
        <p><a href="/signup">注册</a></p>
    </c:otherwise>
</c:choose>
<p>这里是主页的内容</p>
<p>下面是所有的节点</p>
<c:forEach items="${nodes}" var="node">
   <p>${node.node_name}节点</p>
</c:forEach>
<p>下面是所有的主题</p>
<c:forEach items="${themes}" var="theme">
    <p><a href="/t/${theme.theme_id}">${theme.theme_title}</a></p>
    <p>${theme.theme_content}</p>
    <p>主题的作者是<span>${theme.theme_creater}</span></p>
    <p>主题的节点是<span>${theme.node}</span></p>
    <p>主题的回复数量是<span>${theme.theme_reply_count}</span></p>
    <p>主题的创建时间是<span>${theme.theme_date}</span></p>
</c:forEach>
</body>
</html>
