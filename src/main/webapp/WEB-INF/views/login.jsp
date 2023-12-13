<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../src/main/resources/static/scss/Login1.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
</head>
<body>
    <section class="content">
        <div class="container-fluid ActivityPage ">
            <div class="row justify-content-center align-item-center ">
                <div class=" col-5 border border-danger">
                    <h1 class="my-2"><b>Masuk ke golivin</b></h1>
                </div>
                <div class="col-5 border border-danger"  >
                    <h2 class=""><b>Home</b> <span>
                        / Login Form
                    </span>
                    </h2>
                </div>
            </div>
        </div>

        <div class="row">
                <form>
                    <div class="regist">
                    <div class="mb-3 my-4">
                        <label for="nama" class="form-label">Nama</label>
                        <input type="text" class="form-control" id="nama">
                    </div>
                    <div class="mb-3">
                        <label for="nomorHP" class="form-label">Nomor Handphone/Whatsapp</label>
                        <input type="tel" class="form-control" id="nomorHP">
                    </div>
                    <div class="mb-3">
                        <label for="Email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="Email">
                    </div>
                    <div class="mb-3">
                        <label for="pass" class="form-label">Kata Sandi</label>
                        <input type="password" class="form-control" id="pass" placeholder="Minimal 8 karakter">
                    </div>
                    <div class="mb-3">
                        <label for="repeatpass" class="form-label">Ulangi Kata Sandi</label>
                        <input type="password" class="form-control" id="pass" placeholder="Masukkan kembali kata sandi">
                    </div>
                    <div id="hasAcc" class="form-text">Sudah punya akun golivin? <a1 href="#" class="link-offset-1"><u>Masuk Disini</u></a1></div>
                        <button type="submit" class="btn btn-primary my-2">Daftar</button>
                    </div>
                </form>
        </div>
    </section>
</body>
</html>