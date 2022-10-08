<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.springweb.domain.ToDo" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ktony
  Date: 2022-10-08
  Time: 오후 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo List</title>
</head>
<body>
<h1>ToDo List</h1>
<form method="post" action="addTodo">
    할일: <input type="text" name="todo">
    <input type="submit" value="add">
</form>
<br><br>
<c:forEach var = 'todo' items = "${todos}" varStatus="status">
    <p>${todo.todo}</p>
</c:forEach>
</body>
</html>
