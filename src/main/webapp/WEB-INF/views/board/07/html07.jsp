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
<button type="button" id="clickPostBtn">post07버튼</button>
<button type="button" id="clickPutBtn">put07버튼</button>
<button type="button" id="clickPutBtnXml">put07버튼</button>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    $(document).on("click", "#clickPostBtn", function () {
        $.ajax(
            {
                type: "post",
                url: "/board/07/07",
                headers: {
                },
            }
        )
    });
    $(document).on("click", "#clickPutBtn", function () {
        $.ajax(
            {
                type: "put",
                url: "/board/07/07",
                headers: {
                    'Content-Type': 'application/json; charset=utf-8'
                },
            }
        )
    });
    $(document).on("click", "#clickPutBtnXml", function () {
        $.ajax(
            {
                type: "put",
                url: "/board/07/07",
                headers: {
                    'Content-Type' : 'application/xml; charset=utf-8'
                },
            }
        )
    });
</script>
</body>
</html>
