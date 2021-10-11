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
<h1>Spring mission 006</h1>

<button type="button" id="Btn">전송</button>

<script>

    $(document).on("click", "#Btn", function () {
        $.ajax(
            {
                type: "get",
                headers: {
                    'Accept': 'application/json',
                    // 'Content-Type': 'application/xml; charset=utf-8'
                },
                url: "/board/5"
            }
        )
    });
</script>

</body>
</html>
