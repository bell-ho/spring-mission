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
<form action="/registerUser" , method="post">
    userId : <input type="text" name="userId" value="user"><br>
    password : <input type="text" name="password" value="password"><br>
    username : <input type="text" name="userName" value="username"><br>
    email : <input type="text" name="email" value="email"><br>
    dateOfBirth : <input type="text" name="dateOfBirth" value="211012"><br>

    gender : <input type="radio" name="gender" value="mail" checked/>
    <input type="radio" name="gender" value="femail"/><br>

    developer :<input type="checkbox" name="developer" value="Y" checked><br>
    foreigner : <input type="checkbox" name="foreigner" value="false"><br>

    nationality :
    <select name="nationality" id="nationality">
        <option value="Korea">한국</option>
        <option value="Japan">일본</option>
        <option value="China">중국</option>
    </select><br>

    cars :
    <select name="cars" id="cars">
        <option value="volvo">volvo</option>
        <option value="audi">audi</option>
        <option value="k5">k5</option>
    </select><br>

    carArray :
    <select name="carArray" id="carArray">
        <option value="volvo">volvo</option>
        <option value="audi">audi</option>
        <option value="k5">k5</option>
    </select><br>

    carList :
    <select name="carList" id="carList">
        <option value="volvo">volvo</option>
        <option value="audi">audi</option>
        <option value="k5">k5</option>
    </select><br>

    hobby :
    <select name="hobby" id="hobby">
        <option value="Sports">Sports</option>
        <option value="Music">Music</option>
        <option value="Movie">Movie</option>
    </select><br>

    hobbyArray :
    <select name="hobbyArray" id="hobbyArray">
        <option value="Sports">Sports</option>
        <option value="Music">Music</option>
        <option value="Movie">Movie</option>
    </select><br>

    hobbyList :
    <select name="hobbyList" id="hobbyList">
        <option value="Sports">Sports</option>
        <option value="Music">Music</option>
        <option value="Movie">Movie</option>
    </select><br>

    address.postcode : <input type="text" name="address.postcode" value="address.postcode"><br>
    address.location : <input type="text" name="address.location" value="address.location"><br>

    cardList[0].no : <input type="text" name="cardList[0].no" value="5"><br>
    cardList[0].validMonth : <input type="text" name="cardList[0].validMonth" value="220502"><br>

    introduction : <textarea name="introduction" id="introduction" cols="30" rows="10">introduction</textarea><br>
    <button type="submit">전송</button>
    <button type="reset">리셋</button>
</form>


<form action="/registerFile01" method="post" enctype="multipart/form-data">
    picture : <input type="file" name="picture">
    <button type="submit">전송</button>
</form>

<button id="registerBtn01">get전송</button>
<button id="registerBtn02">post전송</button>
<br>

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
            url: "/uploadAjax",
            processData: false, //processData 관련하여, 일반적으로 서버에 전달되는 데이터는 query string 이라는 형태로 전달된다.
            contentType: false, //contentType 은 default 값이 "application/x-www-form-urlencoded; charset=UTF-8" 인데, "multipart/form-data" 로 전송이 되게 false 로 넣어준다.
            data: formData,
        })
    });
    $(document).on("click", "#registerBtn01", function () {
        $.ajax(
            {
                type: "get",
                url: "/register/test",
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
                url: "/register02",
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
