<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>data kos</title>
    <link rel="stylesheet" href="/css/datakos.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
</head>
<body>
<section>
    <div class="sidebar">
        <div class="image">
            <img src="aset/Logo copy.png" alt="">
        </div>
        <ul class="nav">
            <span style="font-weight: bold;">
                Tambahkan kos Anda
            </span><br><br>
            <span>
                Data kos
            </span><br><br>
            <span>Foto kos dan kamar</span>
        </ul>
    </div>
</section>

<section>
    <form>
        <div class="main">
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
                Silakan lengkapi data kos
            </span>
            <h2>Lengkapi data kos agar penyewa lebih mengetahui spesifikasi kos yang Anda sewakan</h2><br>
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
                Nama Kos
            </span>
            <h2>Saran: Kos (spasi) nama kos</h2>
                <div class="form mb-3 my-1">
                    <input type="name" class="form-control">
                </div><br>
            <h1>Disewakan untuk putra/putri/campur</h1>
            <h2>Pilih tipe kos yang sesuai</h2>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                    <label class="form-check-label" for="inlineCheckbox1">Putri</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">Putra</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option2">
                    <label class="form-check-label" for="inlineCheckbox3">Campur</label>
                </div><br>
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
                Alamat kos
            </span>
            <h2>Saran: Tulis lengkap mulai dari nama jalan, RT/RW, Kecamatan, Kabupaten, Provinsi (tambahkan
                patokan agar kos mudah ditemukan)</h2>
                <textarea class="form-control mb-3 mx-1" style="height: 100px; width: 450px;  margin-left: 295px;"></textarea><br>
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
               Deskripsi kos
            </span>
            <h2>Ceritakan lebih lanjut tentang kos Anda secara detail (luas kamar, fasilitas kamar dan kamar mandi,
                fasilitas umum yang ada di kost)</h2>
                <textarea class="form-control mb-3" style="height: 100px; width: 450px;  margin-left: 295px;"></textarea><br>
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
                Jumlah total kamar
            </span>
                <div class="form mb-3">
                    <input type="number" class="form-control">
                </div><br>
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
                Jumlah kamar tersedia
            </span>
                <div class="form mb-3">
                    <input type="number" class="form-control">
                </div><br>
            <span style="font-size: x-large; font-weight: bolder; margin-left: 285px; margin-top: 25px;">
                Harga kos
            </span>
            <h2>Masukkan harga per kamar</h2>
                <div class="form mb-3">
                    <input type="currency-field" class="form-control">
                </div><br>
            <a href="${pageContext.request.contextPath}/fotokos" class="btn btn-link no-border" style="margin-left: 1300px;">Lanjutkan</a>
        </div>
    </form>
</section>
</body>
</html>