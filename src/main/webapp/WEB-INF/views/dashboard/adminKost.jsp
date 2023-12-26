<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>approval kost</title>
    <link rel="stylesheet" href="/css/approvalkost.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
</head>
<body>
    
    <!-- section navbar start -->
    <section>
        <div class="sidebar">
            <div class="image">
                <img src="/aset/Logo copy.png" alt="">
            </div>
            <ul class="nav">
                <li>
                    <a href="${pageContext.request.contextPath}/dashboard/kost" style="color: black; text-decoration: none;">
                        <img src="/aset/pemilik.png" alt="approvalkos" style="vertical-align: middle; margin-right: 10px;">
                        <span>Kost</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/dashboard/booking" style="color: black; text-decoration: none; margin-left: 7px;">
                        <img src="/aset/pembayaran.png" alt="payment" style="vertical-align: middle; margin-right: 14px;">
                        <span>Booking</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/dashboard/pencariKost" style="color: black; text-decoration: none;">
                        <img src="/aset/pencari.png" alt="pencarikos" style="vertical-align: middle; margin-right: 14px;">
                        <span>Pencari Kost</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/logout" style="color: black; text-decoration: none;">
                        <img src="/aset/out.png" alt="pencarikos" style="vertical-align: middle; margin-right: 24px;">
                        <span>Logout</span>
                    </a>
                </li>
            </ul>
    </section>
    <!-- section navbar end -->

    <!-- section approval pemilik kost start -->
    <section>
        <div class="container my-3"> 
            <div class="text" style="font-size: 20px; margin-left: 280px;">
                <h1>Daftar Kost</h1>
            </div>
            <form>
                <div class="search">
                    <!-- <span class="search-icon material-symbols-outlined">search</span> -->
                    <input class="search-input" type="search" placeholder="Search Kost">
                    <button type="submit" class="search-button">Go</button>
                </div>
            </form>
        </div>

        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nama Kost</th>
                    <th scope="col">Pemilik</th>
                    <th scope="col">Putra</th>
                    <th scope="col">Putri</th>
                    <th scope="col">No HP</th>
                    <th scope="col">Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="kost" items="${kosts}">
                    <tr>
                        <th scope="row">${kost.kost_id}</th>
                        <td>${kost.name}</td>
                        <td>${kost.pemilikKost.user.username}</td>
                        <td>${kost.allowedMale}</td>
                        <td>${kost.allowedFemale}</td>
                        <td>${kost.pemilikKost.user.phoneNumber}</td>
                        <td>
                            <select class="custom-select">
                                <option value="" disabled selected>Pilih</option>
                                <option value="disetujui">Disetujui</option>
                                <option value="ditolak">Ditolak</option>
                            </select>
                        </td>
                    </tr>
                </c:forEach>
        </table>
    </section>

</body>
</html>