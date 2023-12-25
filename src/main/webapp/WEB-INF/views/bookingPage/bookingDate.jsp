<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking Tanggal</title>
    <link rel="stylesheet" href="/css/bookingDate.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
        integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
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
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                        aria-expanded="false">Tipe Kost</a>
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
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                        aria-expanded="false">
                        <img src="../src/main/resources/static/aset/ikonuser.png" alt="Icon User"
                            style="width: 30px;" />
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

    <!-- Tanggal section start -->
    <section class="booking-section">
        <h2>Pilih Rentang Tanggal Sewa</h2>
        <form id="booking-form" action = "${pageContext.request.contextPath}/booking/${booking_id}/payment" method="GET">
            <div class="form-group">
                <label for="start-date">Tanggal Masuk:</label>
                <input type="text" id="start-date" name="start-date" class="form-control" placeholder="Pilih tanggal" autocomplete="off">
            </div>

            <div class="form-group">
                <label for="end-date">Tanggal Keluar:</label>
                <input type="text" id="end-date" name="end-date" class="form-control" placeholder="Pilih tanggal" autocomplete="off">
            </div>

            <div id="date-info">
                <!-- Info tanggal akan ditampilkan di sini -->
            </div>

            <button type="submit" class="btn btn-primary">Lanjutkan ke Pembayaran</button>
        </form>
    </section>
    <!-- Tanggal section end -->


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

    <!-- inisialisasi datepicker dan menampilkan info tanggal -->
    <script>
        $(document).ready(function () {
            $('#start-date, #end-date').datepicker({
                format: 'yyyy-mm-dd',
                todayHighlight: true,
                autoclose: true,
                startDate: new Date()
            });

            $('#start-date, #end-date').on('changeDate', function (e) {
                const startDate = $('#start-date').val();
                const endDate = $('#end-date').val();
                const dateInfo = `Tanggal Awal: ${startDate}<br>Tanggal Akhir: ${endDate}`;
                $('#date-info').html(dateInfo);
            });
        });
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>