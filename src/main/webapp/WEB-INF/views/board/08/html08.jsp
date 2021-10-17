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
<button type="button" id="clickBtn">post08버튼</button>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    $(document).on("click", "#clickBtn", function () {
        $.ajax(
            {
                type: "get",
                url: "/board/08/08",
                headers: {
                    "Accept" : "application/json"
                },
            }
        )
    });

</script>
</body>
</html>
