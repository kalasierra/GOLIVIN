<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>searchkost</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
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
    <!-- searchbar section start -->
    <section>
        <div class="search-bar">
            <div class="search-input-container">
                <input type="text" class="search-input" placeholder="Cari Kost Anda disini" name="query">
                <button type="submit" class="search-button">
                    <i class="fas fa-search"></i>
                </button>
            </div>
        </div> 
    </section>
    <!-- searchbar section end -->

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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
