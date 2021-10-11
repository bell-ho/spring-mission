<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>RegisterForm</title>
</head>
<body>
<h1>registerForm</h1>
<a href="/register?userId=test&password=123456">버튼</a>
<a href="/register/test">버튼2</a>

<form action="/register01" , method="post">
    <input type="hidden" name="userId" value="test">
    <input type="hidden" name="password" value="12345">
    <button type="submit">전송</button>
</form>

</body>
</html>
