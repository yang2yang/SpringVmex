<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-6-1
  Time: 下午9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这里是一个主题的名字</title>
</head>
<body>
<%--这个页面有主题的名字，作者，时间，还有评论--%>
<p>以下是主题的一些信息</p>
${theme.theme_title}
${theme.theme_content}
${theme.theme_date}
<%--下面还有这个主题的回复--%>
<p>下面是主题的回复</p>
<c:forEach items="${replys}" var="reply">
    <p>${reply.reply_person_username}</p>
    <p>${reply.reply_date}</p>
    <p>${reply.reply_content}</p>
</c:forEach>
</body>
</html>
