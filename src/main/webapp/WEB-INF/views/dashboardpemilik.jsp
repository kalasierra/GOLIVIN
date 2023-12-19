<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>data kos</title>
    <link rel="stylesheet" href="/css/dashboardpemilik.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
</head>
<body>


    <!-- sidebar section start -->
    <section>
        <div class="sidebar">
            <div class="image my-2">
                <img src="/aset/Logo copy.png" alt="">
            </div>
            <ul class="nav">
                <li>
                    <a href="dashboardpemilik.html" style="color: black; text-decoration: none;">
                        <img src="/aset/ikonhome.png" alt="Data kos" style="vertical-align: middle; margin-right: 10px;">
                        <span>Home</span>
                    </a>
                </li>
                <li>
                    <a href="kospemilik.html" style="color: black; text-decoration: none;">
                        <img src="/aset/ikonkos.png" alt="kostsaya" style="vertical-align: middle; margin-right: 10px;">
                        <span>Kos Saya</span>
                    </a>
                </li>
                <li>
                    <a href="notifikasipemilik.html" style="color: black; text-decoration: none;">
                        <img src="/aset/notification.png" alt="notif" style="vertical-align: middle; margin-right: 10px;">
                        <span>Notifikasi</span>
                    </a>
                </li>
                <li>
                    <a href="chatpemilik.html" style="color: black; text-decoration: none;">
                        <img src="/aset/chat.png" alt="Chat" style="vertical-align: middle; margin-right: 10px;">
                        <span>Chat</span>
                    </a>
                </li>
                <li>
                    <a href="akunpemilik.html" style="color: black; text-decoration: none;">
                        <img src="/aset/ikonuser.png" alt="userpemilik" style="vertical-align: middle; margin-right: 10px; width: 30px;">
                        <span>Akun</span>
                    </a>
                </li>
                <li>
                    <a href="logoutpemilik.html" style="color: black; text-decoration: none;">
                        <img src="/aset/logout.png" alt="userpemilik" style="vertical-align: middle; margin-right: 10px; width: 30px;">
                        <span>Keluar</span>
                    </a>
                </li>
            </ul>
        </div>
    </section>
    <!-- sidebar section end -->

    <!-- home section start -->
    <section>
        <div class="container my-3"> 
            <div class="text" style="font-size: 30px; margin-left: 280px;">
                <h1>Halo, selamat datang di Go-Livin</h1>
            </div>
            <div class="text2" style="font-size: 20px; margin-left: 280px;">
                <h2>Waktunya Mengelola Properti</h2>
            </div>
            <div class="addkost">
                <a href="datakost.html" style="color: black; text-decoration: none;font-size: 20px; margin-left: 280px;">
                    <img src="/aset/plus.png" alt="" style="height: 30px;">
                    <span>Tambahkan Properti Anda!</span> 
                </a>
            </div>    
        </div>

    </section>
    <!-- home section end -->

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    
    
</body>
</html>