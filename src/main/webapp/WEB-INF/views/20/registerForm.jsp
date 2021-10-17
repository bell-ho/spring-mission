<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>registerForm</title>
</head>
<body>
<h1>registerForm</h1>
<a href="/20/register?userId=test&password=12345">버튼</a>

<form action="/20/register01" method="post">
    <input type="text" name="userId" value="test">
    <input type="text" name="password" value="password">
    <button type="submit">전송</button>
</form>
<br>

</body>
</html>
