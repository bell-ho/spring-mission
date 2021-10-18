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

<form id="uploadForm" enctype="multipart/form-data">
    <input type="file" id="uploadImage" name="picture">
</form>

<script>
    $(document).on("change", "#uploadImage", function () {
        const imageInput = $("#uploadImage")[0];

        const formData = new FormData();
        formData.append("picture", imageInput.files[0]);

        $.ajax({
            type: "post",
            url: "/28/uploadAjax",
            processData: false, //processData 관련하여, 일반적으로 서버에 전달되는 데이터는 query string 이라는 형태로 전달된다.
            contentType: false, //contentType 은 default 값이 "application/x-www-form-urlencoded; charset=UTF-8" 인데, "multipart/form-data" 로 전송이 되게 false 로 넣어준다.
            data: formData,
        })
    });
</script>
</body>
</html>
