<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dn230483zav2
  Date: 22.04.19
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guestbook posts</title>
</head>
<body>
<table border="1">
    <c:forEach items="${requestScope.posts}" var="posts">
        <tr>
            <td>${posts.id}</td>
            <td><c:out value="${posts.txt}"/></td>  <%--c:out экранирует html код от инъекций--%>
            <td>
                <a href="delete?id=${post.id}" target="_blank"> <%--цепляем урл при клике на ссылку--%>
                    <img src="delete.png"/>  <%--навешиваем картинку--%>

                </a>
            </td>
        </tr>
    </c:forEach>
    <form action="/WorkWithGremlinWeb_war_exploded/add" method="POST">
        <tr>
            <td colspan="2">
                <input name="txt" type="text">
            </td>
            <td>
                <input type="submit">
            </td>
        </tr>
    </form>
</table>
</body>
</html>
