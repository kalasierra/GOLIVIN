<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Input Form</title>
</head>
<body>
    <h2>User Input Form</h2>
    <form action="/kost/create" method="post" contentType="application/json">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="allowedMale">Allowed Male:</label>
        <input type="checkbox" id="allowedMale" name="allowedMale"><br>

        <label for="allowedFemale">Allowed Female:</label>
        <input type="checkbox" id="allowedFemale" name="allowedFemale"><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>