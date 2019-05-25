<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/25
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<a href="/addUser" >添加</a><br/>
    <table>
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>年龄</th>
        </tr>
        <c:forEach items="${users}" var="user" >
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>

    </table>


</body>
</html>
