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
<h1>등록</h1>


<form action="/register" , method="post">
    유저 ID : <input type="text" name="userId" value=""><br>
    패스워드 : <input type="text" name="password" value="12345"><br>
    이름 : <input type="text" name="userName" value="abc"><br>
    Email : <input type="text" name="email" value="abc@abc.com"><br>
    birthDay : <input type="text" name="birthDay" value="220602"><br>

    성별 <br>
    <input type="radio" name="gender" value="male"> male
    <input type="radio" name="gender" value="Female"> Female
    <br>

    <button type="submit">전송</button>
</form>


</body>
</html>
