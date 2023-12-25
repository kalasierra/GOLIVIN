<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking Pay</title>
    <link rel="stylesheet" href="/css/bookingpay.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
    <!-- navbar section start -->
    <section class="header">
        <div class="container-fluid cont_nav" style="height: 84px;">
            <ul class="nav nav-pills justify-content-end content_nav">
                <li class="logo my-3">
                    <img src="/aset/logo.png" alt="">
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
                <li class="nav-item my-3">
                    <a class="nav-link" href="">
                        <img src="/aset/notification.png" alt="Icon Notif" style="width: 30px;"/>
                    </a>
                </li>
                <li class="nav-item dropdown2 my-3">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">
                        <img src="/aset/ikonuser.png" alt="Icon User" style="width: 30px;"/>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Edit Profil</a></li>
                        <li><a class="dropdown-item" href="#" data-bs-toggle="modal" data-bs-target="#logoutGolivin">Logout</a></li>
                    </ul>
                </li>
                
            </ul>
        </div>
    </section>
    <!-- navbar section end -->

    <!-- Booking Pay start -->
    <section>
        <div class="payment-container">
            <div class="left-section">
                <h1>Pembayaran</h1>
                <div class="durasi" style="font-size: 20px;">
                    <label for="paymentMethod">Durasi sewa kost:</label>
                </div>
                <select id="duration" name="duration">
                    <option value="year">Per Tahun</option>
                    <option value="month">Per Bulan</option>
                    <option value="week">Per Minggu</option>
                </select>
                
                <div class="payment" style="font-size: 20px;">
                    <label for="paymentMethod">Pilih metode pembayaran:</label>
                </div>
                
                <div class="payment-method-option">
                    <input type="radio" id="virtualAccount" name="paymentMethod" value="virtualAccount">
                    <label for="virtualAccount">Virtual Account</label>
                </div>
            
                <div class="payment-method-option">
                    <input type="radio" id="qris" name="paymentMethod" value="qris">
                    <label for="qris">QRIS</label>
                </div>
            </div>
            
    
            <div class="right-section">
                <h2>Detail Pembayaran</h2>
                <!-- Elemen untuk menampilkan metode pembayaran yang dipilih -->
                <p id="selectedPaymentMethod">Metode Pembayaran:</p>

            <script>
                // Dapatkan semua elemen radio button dengan name="paymentMethod"
                var radios = document.querySelectorAll('input[name="paymentMethod"]');

                // Tambahkan event listener untuk setiap radio button
                radios.forEach(function(radio) {
                    radio.addEventListener('change', function() {
                        if (this.checked) {
                            // Perbarui elemen dengan ID 'selectedPaymentMethod' dengan teks "Metode Pembayaran: " diikuti dengan teks dari radio button yang dipilih
                            document.getElementById('selectedPaymentMethod').innerText = "Metode Pembayaran: " + this.nextElementSibling.innerText;
                        }
                    });
                });
            </script>

    
                <p>Subtotal: <span id="subtotal">Rp 0</span></p>
                <p>Biaya Administrasi: Rp 2.500</p>
                <p>Total: <span id="total">Rp 2.500</span></p>
    
                <button class="cancel-button">Batalkan Pesanan</button>
                <button class="continue-button">Lanjutkan</button>
            </div>
        </div>
    </section>
    <!-- Booking Pay end -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>




