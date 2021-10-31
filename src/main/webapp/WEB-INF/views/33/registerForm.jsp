<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<form:form modelAttribute="member" method="post" action="/33/register">
    <table>
        <tr>
            <td>유저ID</td>
            <td><form:input path="userId" /><font color="red"><form:errors path="userId" /></font></td>
        </tr>
        <tr>
            <td>패스워드</td>
            <td><form:password path="password" /><font color="red"><form:errors path="password" /></font></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><form:input path="username" /><font color="red"><form:errors path="username" /></font></td>
        </tr>
        <tr>
            <td>성별</td>
            <td>
                <form:radiobutton path="gender" value="male" label="Male" /> <br>
                <form:radiobutton path="gender" value="female" label="Female" /> <br>
                <form:radiobutton path="gender" value="other" label="Other" />
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <td align="center"><input type="submit" name="btnSubmit" value="등록"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
