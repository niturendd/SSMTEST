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
<form method="get" action="By">
    <input placeholder="请输入姓名" name="username">
    <input type="submit" value="查询">
</form>
<form method="get" action="to">
    <input type="submit" value="新增">
</form>
<table>
    <tr>
        <th>id</th>
        <th>账号</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${dates}" var="date">
        <tr>
            <td>${date.id}</td>
            <td>${date.username}</td>
            <td>${date.password}</td>
            <td><a href="de?id=${date.id}">删除</a> <a href="toU?id=${date.id}&username=${date.username}&password=${date.password}">修改</a> </td>
        </tr>
    </c:forEach>
</table>
</body>

</html>