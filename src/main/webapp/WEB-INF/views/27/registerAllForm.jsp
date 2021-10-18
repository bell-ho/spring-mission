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
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<button id="registerBtn01">get전송</button>
<button id="registerBtn02">post전송</button>
<br>

<script>

    $(document).on("click", "#registerBtn01", function () {
        $.ajax(
            {
                type: "get",
                url: "/27/register01/test",
                headers: {
                    // 'Accept': 'application/json',
                    // 'Content-Type': 'application/xml; charset=utf-8'
                },
            }
        )
    });
    $(document).on("click", "#registerBtn02", function () {
        $.ajax(
            {
                type: "post",
                url: "/27/register02",
                data: {
                    userId: "test",
                    password: "12"
                },
                headers: {
                    // 'Accept': 'application/json',
                    // 'Content-Type': 'application/xml; charset=utf-8'
                },
            }
        )
    });
</script>
</body>
</html>
