<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Spring mission 005</h1>
<table>
    <thead>
    <tr>
        <th>no</th>
        <th>url</th>
        <th>title</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>
            <form action="/board/get?register" method="get">
                <input type="submit" value="/board/get?register">
            </form>
        </td>
        <td>등록</td>
    </tr>
    <tr>
        <td>2</td>
        <td><a href="/board/get?modify">/board/get?modify</a></td>
        <td>수정</td>
    </tr>
    <tr>
        <td>3</td>
        <td><a href="/board/get?list">/board/get?list</a></td>
        <td>목록</td>
    </tr>
    <tr>
        <td>4</td>
        <td><a href="/board/get?read">/board/get?read</a></td>
        <td>읽기</td>
    </tr>
    <tr>
        <td>5</td>
        <td><a href="/board/get?remove">/board/get?remove</a></td>
        <td>삭제</td>
    </tr>
    </tbody>
</table>

</body>
</html>
