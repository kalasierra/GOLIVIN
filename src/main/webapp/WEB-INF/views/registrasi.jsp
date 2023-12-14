<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">    
    <link rel="stylesheet" href="./css/registrasi.css" />
</head>
<body>
    <!-- navbar section start -->
    <section class="header">
        <div class="container-fluid cont_nav" style="height: 84px;">
            <div class="row">
                <div class="col-4 my-2">
                        <img src="./aset/logo.png" alt="">
                </div>
                <div class="col-4">
                    <p>&nbsp;</p>
                </div>
                <div class="col-4">
                    <ul class="nav nav-pills justify-content-end content_nav">
                        <li class="nav-item dropdown my-3">
                        <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Tipe Kost</a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="./listputra.html">Putra</a></li>
                            <li><a class="dropdown-item" href="#">Putri</a></li>
                            <li><a class="dropdown-item" href="#">Campur</a></li>
                        </ul>
                        </li>
                        <li class="nav-item my-3">
                            <a class="nav-link" href="#">Chat</a>
                        </li>
                        <li class="nav-item my-3">
                            <button href="${pageContext.request.contextPath}/login">
                                Masuk
                            </button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <!-- navbar section end -->
    
    <!-- regist section start -->
    <section class="content">
        <div class="container-fluid ActivityPage ">
            <div class="row justify-content-center align-item-center ">
                <div class=" col-5">
                    <h1 class="my-2"><b>Daftar Akun Pencari Kost</b></h1>
                </div>
                <div class="col-5">
                    <h2 class=""><b>Home</b> <span>
                        / Halaman Registrasi
                    </span>
                    </h2>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-6">
                <form method="post" action="/registrasi">
                    <div class="regist">
                    <div class="mb-3 my-4">
                        <label for="username" class="form-label">Username</label>
                        <input type="name" class="form-control" id="username" name="username">
                    </div>
                    <div class="mb-3">
                        <label for="phoneNumber" class="form-label">Phone number</label>
                        <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" id="password" name="password">
                    </div>
                    <!-- <div class="mb-3">
                        <label for="repeatpass" class="form-label">Ulangi Kata Sandi</label>
                        <input type="password" class="form-control" id="passconfirm" placeholder="Masukkan kembali kata sandi">
                    </div> -->
                    <div id="hasAcc" class="form-text">Sudah punya akun golivin? <a1 href="#" class="link-offset-1"><u>Masuk Disini</u></a1></div>
                        <button href="${pageContext.request.contextPath}/homepage2" type="submit" class="btn btn-primary my-2">Daftar</button>
                    </div>
                </form>
            </div>
            <div class="registpage col-6">
                <img src="./aset/regist.png" alt="">
            </div>
        </div>
    </section>
    <!-- regist section end -->

</body>
</html>