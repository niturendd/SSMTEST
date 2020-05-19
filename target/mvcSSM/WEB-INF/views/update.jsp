<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/4/17
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<form method="get" action="up">
    <input type="hidden" name="id" value="${id}">
    账号：<input type="text" name="username" value="${username}"><br>
    密码：<input type="text" name="password" value="${password}"><br>
    <input type="submit" value="修改">
</form>
</body>

</html>