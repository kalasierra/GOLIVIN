<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <style>
        /* Add your custom styling here */
        .kost-item {
            border: 1px solid #ccc;
            padding: 10px;
            margin: 10px;
            border-radius: 5px;
        }

        /* Customize as needed */
        .kost-link {
            text-decoration: none;
            color: #333;
        }
    </style>
</head>
<body>

    <c:forEach var="kost" items="${kosts}">
        <div class="kost-item">
            <!-- Display attributes of kost -->
            <p>Kost ID: ${kost.kost_id}</p>
            <p>Name: ${kost.name}</p>
            <p>Address: ${kost.address}</p>
            <p>Allowed Male: ${kost.allowedMale}</p>
            <p>Allowed Female: ${kost.allowedFemale}</p>

            <!-- Link to redirect to /kost/search/{clicked_kost_id} -->
            <a href="<c:url value='/kost/search/${kost.kost_id}' />" class="kost-link">View Details</a>
        </div>
    </c:forEach>

</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <style>
        /* Add your custom styling here */
        .kost-item {
            border: 1px solid #ccc;
            padding: 10px;
            margin: 10px;
            border-radius: 5px;
        }

        /* Customize as needed */
        .kost-link {
            text-decoration: none;
            color: #333;
        }
    </style>
</head>
<body>

    <c:forEach var="kost" items="${kosts}">
        <div class="kost-item">
            <!-- Display attributes of kost -->
            <p>Kost ID: ${kost.kost_id}</p>
            <p>Name: ${kost.name}</p>
            <p>Address: ${kost.address}</p>
            <p>Allowed Male: ${kost.allowedMale}</p>
            <p>Allowed Female: ${kost.allowedFemale}</p>

            <!-- Link to redirect to /kost/search/{clicked_kost_id} -->
            <a href="<c:url value='/kost/search/${kost.kost_id}' />" class="kost-link">View Details</a>
        </div>
    </c:forEach>

</body>
</html>
