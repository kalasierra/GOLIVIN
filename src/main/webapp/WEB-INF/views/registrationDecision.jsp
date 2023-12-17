<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>

    <form action="/register/decision" method="get" contentType="application/json">
        <label>
            <input type="radio" name="userType" value="1" checked>
            Daftar sebagai pencari kost
        </label>
        <br>
        <label>
            <input type="radio" name="userType" value="2">
            Daftar sebagai pemilik kost
        </label>
        <br>
        <input type="submit" value="Submit">
    </form>

</body>
</html>