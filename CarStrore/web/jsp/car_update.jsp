<%@ page import="entity.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%Car car = (Car) request.getAttribute("car");%>


<form action="/update" method="post">
    <div><input type="text" name="id" placeholder="id" value="${car.id}"></div>
    <div><input type="text" name="name" placeholder="name" value="${car.name}"></div>
    <div><input type="number" step="0.01" name="price" placeholder="price" value="${car.price}"></div>
    <div><input type="text" name="color" placeholder="color" value="${car.color}"></div>
    <div><input type="text" name="manufacturer" placeholder="manufacturer" value="${car.manufacturer}"></div>
    <div><input type="submit" value="提交更新"></div>
</form>
</body>
</html>
