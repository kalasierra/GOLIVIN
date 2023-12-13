<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>GO-Livin</title>
        <link rel="stylesheet" type="text/css" href="scss/landingpage.css" />
    </head>
    <body>
        <div class="landing-page">

        <!-- Konten atau elemen lain di dalam "Rectangle 120" -->
        <div class="rectangle-120"></div>

        <!-- Elemen "Chat" -->
        <div id="chatButton" class="chat">Chat</div>    
        
        <!-- Elemen "home" -->
        <a href="login.jsp" class="super-small-active">Masuk</a>

        <!-- Elemen "Tipe Kost" -->
        <div class="tipe-kost">Tipe Kost</div>

        <!-- Elemen "Expand_down" dengan konten -->
        <div class="expand-down" id="expandButton">▼</div>

        <!-- Elemen Logo langsung -->
        <img src="aset/logo.png" alt="Logo" class="logo">

        <!-- Gambar Image 1 -->
        <img src="aset/image1.jpg" alt="image-1" class="image-1">

        <div class="find-dream-kost">Temukan Kost Impianmu</div>
        
        <!-- Elemen "Rectangle 121" -->
        <div class="rectangle-121" onclick="handleSearchClick()">
            <button class="search-button">
                <img src="aset/search1.png" alt="Search">
            </button>
        </div>

        <div class="daerah-mana">Mau tinggal di daerah mana?</div>

        <!-- Elemen "Kost Popular" -->
        <div class="kost-popular">Kost Popular</div>
        <div class="lihat-semua" onclick="handleClick('lihat-semua')">Lihat Semua</div>
        
        <img src="aset/kost1.jpg" alt="kost1" class="kost1">
        <img src="aset/kost2.png" alt="kost2" class="kost2">
        <img src="aset/kost3.png" alt="kost3" class="kost3">


        <!-- Konten atau elemen lain di dalam "Rectangle kost1" -->
        <div class="rectangle-kost1">
            <div class="lockost1">Sukapura</div>
            <div class="deskkost1" onclick="handleClick('rumah-sazira')">
                Khusus Putri<br>
                <b>Kost Rumah Sazira</b><br>
                Rp 1.100.000 / bulan
            </div>
        </div>

        <!-- Konten atau elemen lain di dalam "Rectangle kost2" -->
        <div class="rectangle-kost2">
            <div class="lockost2">Sukabirus</div>
            <div class="deskkost2" onclick="handleClick('7-days-room')">
                Khusus Putra<br>
                <b>Kost 7 days room</b><br>
                Rp 2.500.000 / bulan
            </div>
        </div>

        <!-- Konten atau elemen lain di dalam "Rectangle kost3" -->
        <div class="rectangle-kost3">
            <div class="lockost3">Margacinta</div>
            <div class="deskkost3" onclick="handleClick('kost-tulip')">
                Khusus Campur<br>
                <b>Kost Tulip</b><br>
                Rp 1.250.000 / bulan
            </div>
        </div>

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

        </div>
    </body>
</html>
