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
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<h1>registerForm</h1>


<form action="/register" , method="post">
    <input type="text" name="userId" value="test">
    <input type="text" name="password" value="12345">
    <button type="submit">/register 전송</button>
</form>

<form action="/register" method="post">
    <input type="text" name="userId" value="userId">
    <input type="text" name="password" value="password">
    <button type="submit">전송post</button>
</form>
</body>
</html>
