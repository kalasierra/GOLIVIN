<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Room</title>
    <link rel="stylesheet" href="/css/roomView2.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
    <!-- navbar section start -->
    <section class="header">
        <div class="container-fluid cont_nav" style="height: 84px;">
            <ul class="nav nav-pills justify-content-end content_nav">
                <li class="logo my-3">
                    <img src="../src/main/resources/static/aset/logo.png" alt="">
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
                        <img src="../src/main/resources/static/aset/ikonuser.png" alt="Icon User" style="width: 30px;"/>
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

    <!-- Title Start -->
    <div class="row">
        <div class="col-md-12">
            <div class="text" style="font-size: 30px; margin-left: 280px;">
                <h1>Halo, selamat datang di Kost Sazira</h1>
            </div>
            <div class="text2" style="font-size: 20px; margin-left: 280px;">
                <h2>Pilih kamar yang sesuai dengan keinginanmu</h2>
            </div>
        </div>
    </div>
    <!-- Title End -->

    <!-- kos section start -->
    <c:choose>
        <c:when test="${not empty rooms}">
            <c:forEach var="room" items="${rooms}">
                <section class="room1">
                    <div class="list_room">
                        <div class="container">
                            <div class="room_content">
                                <div class="container_media">
                                    <div id="carouselExampleCaptions" class="carousel slide">
                                        <div class="carousel-indicators">
                                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                                        </div>
            
                                        <div class="carousel-inner">
                                            <div class="carousel-item active">
                                                <img src="../src/main/resources/static/aset/kost2.png" alt="Slide 1">
                                            </div>
                                            <div class="carousel-item">
                                                <img src="../src/main/resources/static/aset/kost3.png" alt="Slide 2">
                                            </div>
                                        </div>
            
                                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="visually-hidden">Previous</span>
                                        </button>
            
                                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="visually-hidden">Next</span>
                                        </button>
                                    </div>
                                </div>
                                <div class="container_info">
                                    <div class="container_info-wrapper">
                                        <div class="container_info-details">
                                            <div class="idkamar">ID Kamar: ${room.room_id}</div>
                                            <div class="harga-kamar">Harga: Rp. ${room.price} / Bulan</div>
                                            <div class="alamat-kost">Alamat: <c:out value="${address}"/></div>
                                            <div class="fasilitas">
                                                <div>Fasilitas:</div>
                                                <ul>
                                                    <li>${room.description}</li>
                                                </ul>
                                            </div>
                                            <a href="${pageContext.request.contextPath}/chat" class="btn btn-primary">Chat</a>
                                            <a href="${pageContext.request.contextPath}/room/${room.room_id}/book" class="btn btn-primary">Ajukan sewa</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <div class="row">
                <div class="col-md-12">
                    <p>Maafkan kami, kost ini belum memiliki ruangan yang tersedia.</p>
                </div>
            </div>
        </c:otherwise>
    </c:choose>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>




