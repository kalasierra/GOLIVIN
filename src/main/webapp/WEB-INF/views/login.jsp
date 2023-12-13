<%-- 
    Document   : login
    Created on : Nov 25, 2023, 2:57:37 PM
    Author     : Alicia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>GO-Livin</title>
        <link rel="stylesheet" type="text/css" href="scss/login.css" />
    </head>
    <body>

        <!-- Konten atau elemen lain di dalam "Rectangle 120" -->
        <div class="rectangle-120"></div>
        
        <!-- Elemen "Chat" -->
        <div id="chatButton" class="chat">Chat</div>    

        <!-- Elemen "Super Small/Active" -->
        <div class="super-small-active" onclick="handleSuperSmallActiveClick()">Masuk</div>

        <!-- Elemen "Tipe Kost" -->
        <div class="tipe-kost">Tipe Kost</div>

        <!-- Elemen "Expand_down" dengan konten -->
        <div class="expand-down" id="expandButton">▼</div>

        <!-- Elemen Logo langsung -->
        <img src="aset/logo.png" alt="Logo" class="logo">
        
        <!-- Konten atau elemen lain di dalam "Rectangle kuning" -->
        <div class="rectanglekuning"></div>
        
        <!-- Elemen "masukgolivin" -->
        <div id="logingolivin" class="logingolivin"><b>Masuk ke golivin</b></div>
        
        <!-- Elemen "home" -->
        <a href="landingpage.jsp" class="home">Home</a>
        
        <form action="processLogin.jsp" method="post">
            <!-- Input untuk email -->
            <div class="email">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>

            <!-- Input untuk kata sandi -->
            <div class="password">
                <label for="password">Kata Sandi:</label>
                <input type="password" id="password" name="password" required>
            </div>

            <input type="submit" value="Masuk">
         </form>
        
         <!-- Konten atau elemen lain di dalam "noakun" -->
         <div id="noakun" class="noakun">Belum punya akun golivin?</div>
            
         
         <!-- Elemen "register" -->
         <a href="role.jsp" class="daftarsekarang">Daftar Sekarang</a>
         
         <!-- Elemen "forgetpassword" -->
         <a href="lupapassword.jsp" class="lupapassword">Lupa Kata Sandi?</a>
         
         <div class="rectangle">
            <!-- Konten atau elemen lain yang berada di dalam "rectangle" -->
            <div class="rectangle2"></div>
            <div class="copyright">
                <b>© 2023 golivin.com All Rights Reserved</b>
            </div>
        </div>

        <!-- Gambar Logo Bawah -->
        <img src="aset/logobawah.png" alt="logobawah" class="logobawah">

        <div class="golivinDescription">
            golivin memanfaatkan teknologi untuk berkembang menjadi website yang memudahkan calon anak kos di wilayah Telkom University untuk booking properti kos dan juga melakukan pembayaran kos.
        </div>

        <div class="hubungiKami"><b>Hubungi Kami</b></div>
        <div class="nomorTelepon">0899-3322-1212</div>
        <div class="emailInfo">info@golivin.com</div>
        <div class="ellipse1"></div>
        <img src="aset/ikonpesan.png" alt="ikonpesan" class="ikonpesan">
        <div class="ellipse2"></div>
        <img src="aset/ikontelpon.png" alt="ikontelpon" class="ikontelpon">
        
    </body>
</html>
