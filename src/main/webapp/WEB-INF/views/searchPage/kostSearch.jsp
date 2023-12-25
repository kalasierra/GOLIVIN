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
    <link rel="stylesheet" href="/css/kostList.css"/>
</head>
<body>

    <!-- navbar section start -->
    <section class="header">
        <div class="container-fluid cont_nav" style="height: 84px;">
            <ul class="nav nav-pills justify-content-end content_nav">
                <li class="logo my-3">
                    <img src="/aset/Logo copy.png" alt="">
                </li>
                <li class="nav-item dropdown my-3">
                <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Tipe Kost</a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="./listPutra.jsp">Putra</a></li>
                    <li><a class="dropdown-item" href="./listPutri.jsp">Putri</a></li>
                    <li><a class="dropdown-item" href="./listCampur.jsp">Campur</a></li>
                </ul>
                </li>
                <li class="nav-item my-3">
                    <a class="nav-link" href="#">Chat</a>
                </li>
                <li class="nav-item dropdown2 my-3">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">
                        <img src="/aset/ikonuser.png" alt="Icon User" style="width: 30px;"/>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Edit Profil</a></li>
                        <li><a class="dropdown-item" href="#">Logout</a></li>
                    </ul>
                </li>
                
            </ul>
        </div>
    </section>
    <!-- navbar section end -->
    
    <!-- searchbar section start -->
    <section>
        <div class="search-bar">
            <div class="search-input-container">
                <input type="text" class="search-input" placeholder="Cari kost impian Anda di sini!" name="query">
                <button type="submit" class="search-button">
                    <img src="/aset/search1.png" alt="Search Icon">
                </button>
            </div>
        </div> 
    </section>
    <!-- searchbar section end -->

    
    <c:forEach var="kost" items="${kosts}">
        <div class="kost-item my-3" style="margin-left: 700px;">
        <!-- Display attributes of kost -->
            <p>Kost ID: ${kost.kost_id}</p>
            <p>Name: ${kost.name}</p>
            <p>Address: ${kost.address}</p>
            <p>Allowed Male: ${kost.allowedMale}</p>
            <p>Allowed Female: ${kost.allowedFemale}</p>

            <!-- Link to redirect to /kost/search/{clicked_kost_id} -->
            <a href="<c:url value='/kost/${kost.kost_id}' />" class="kost-link">View Details</a>
        </div>
    </c:forEach> 

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
