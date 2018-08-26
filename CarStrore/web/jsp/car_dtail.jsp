
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${car.name}</h1>
<ul>
    <li><label>价格：</label>${car.price}</li>
    <li><label>颜色：</label>${car.color}</li>
    <li><label>厂商：</label>${car.manufacturer}</li>

</ul>

<a href="/index">返回主页面</a>
</body>
</html>
