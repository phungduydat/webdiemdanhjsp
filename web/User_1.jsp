<%-- 
    Document   : User
    Created on : Aug 28, 2023, 9:21:02 AM
    Author     : duyda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
=========================================================
* Paper Dashboard 2 - v2.0.1
=========================================================

* Product Page: https://www.creative-tim.com/product/paper-dashboard-2
* Copyright 2020 Creative Tim (https://www.creative-tim.com)

Coded by www.creative-tim.com

 =========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
-->
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="assets/img/favicon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>
            Paper Dashboard 2 by Creative Tim
        </title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
        <!-- CSS Files -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
        <link href="assets/css/paper-dashboard.css?v=2.0.1" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="assets/demo/demo.css" rel="stylesheet" />
    </head>

    <body class="">
        <jsp:include page="lefthomepage_1.jsp"></jsp:include>

            <div class="main-panel">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent">
                    <div class="container-fluid">
                        <div class="navbar-wrapper">
                            <div class="navbar-toggle">
                                <button type="button" class="navbar-toggler">
                                    <span class="navbar-toggler-bar bar1"></span>
                                    <span class="navbar-toggler-bar bar2"></span>
                                    <span class="navbar-toggler-bar bar3"></span>
                                </button>
                            </div>
                            <a class="navbar-brand" href="javascript:;">User Profile</a>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-bar navbar-kebab"></span>
                            <span class="navbar-toggler-bar navbar-kebab"></span>
                            <span class="navbar-toggler-bar navbar-kebab"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-end" id="navigation">
                            <form>
                                <div class="input-group no-border">
                                    <input type="text" value="" class="form-control" placeholder="Search...">
                                    <div class="input-group-append">
                                        <div class="input-group-text">
                                            <i class="nc-icon nc-zoom-split"></i>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link btn-magnify" href="javascript:;">
                                        <i class="nc-icon nc-layout-11"></i>
                                        <p>
                                            <span class="d-lg-none d-md-block">Stats</span>
                                        </p>
                                    </a>
                                </li>
                                <li class="nav-item btn-rotate dropdown">
                                    <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="nc-icon nc-bell-55"></i>
                                        <p>
                                            <span class="d-lg-none d-md-block">Some Actions</span>
                                        </p>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                        <a class="dropdown-item" href="#">Action</a>
                                        <a class="dropdown-item" href="#">Another action</a>
                                        <a class="dropdown-item" href="#">Something else here</a>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link btn-rotate" href="javascript:;">
                                        <i class="nc-icon nc-settings-gear-65"></i>
                                        <p>
                                            <span class="d-lg-none d-md-block">Account</span>
                                        </p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- End Navbar -->
                <div class="content">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="card card-user">
                                <div class="image">
                                    <img src="assets/img/damir-bosnjak.jpg" alt="..." />
                                </div>
                                <div class="card-body">
                                    <div class="author">
                                        <a href="#">
                                            <img
                                                class="avatar border-gray"
                                                src="assets/img/mike.jpg"
                                                alt="..."
                                                />
                                            <h5 class="title">${gv.getTenGV()}</h5>
                                    </a>

                                </div>
                                <p class="description text-center">
                                    ${gv.getMAGV()}
                                </p>
                            </div>
                            <div class="card-footer">
                                <hr />
                                <div class="button-container">
                                    <div class="row">
                                        <div class="col-lg-3 col-md-6 col-6 ml-auto">
                                            <h5>12<br /><small>Tổng số buổi Học</small></h5>
                                        </div>
                                        <div class="col-lg-4 col-md-6 col-6 ml-auto mr-auto">
                                            <h5>2<br /><small>Số buổi vắng có phép</small></h5>
                                        </div>
                                        <div class="col-lg-3 mr-auto">
                                            <h5>
                                                2<br /><small>Số buổi vắng không phép</small>
                                            </h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title">Team Members</h4>
                            </div>
                            <div class="card-body">

                            </div>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="card card-user">
                            <div class="card-header">
                                <h5 class="card-title">Edit Profile</h5>
                            </div>
                            <div class="card-body">
                                <form>
                                    <div class="row">
                                        <div class="col-md-5 pr-1">
                                            <div class="form-group">
                                                <label>MSSV</label>
                                                <input type="text" class="form-control" disabled="" placeholder="Company" value="${gv.getMAGV()}">
                                            </div>
                                        </div>
                                        <div class="col-md-3 px-1">
                                            <div class="form-group">
                                                <label>Username</label>
                                                <input type="text" class="form-control" disabled="" placeholder="" value="${gv.getTenGV()}">

                                            </div>
                                        </div>
                                        <div class="col-md-4 pl-1">
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Email address</label>
                                                <input
                                                    name="email"
                                                    type="email"
                                                    class="form-control"
                                                    placeholder="Email"
                                                    value="${gv.getEmail()}"
                                                    />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6 pr-1">
                                            <div class="form-group">
                                                <label>Họ và Tên lót</label>
                                                <input
                                                    name="fname"
                                                    type="text"
                                                    class="form-control"
                                                    placeholder="ten lot"
                                                    value="${gv.getFristname()}"
                                                    />
                                            </div>
                                        </div>
                                        <div class="col-md-6 pl-1">
                                            <div class="form-group">
                                                <label>Tên</label>
                                                <input
                                                    name="lname"
                                                    type="text"
                                                    class="form-control"
                                                    placeholder="Last Name"
                                                    value="${gv.getLastname()}"
                                                    />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>Địa Chỉ</label>
                                                <input
                                                    name="diachi"
                                                    type="text"
                                                    class="form-control"
                                                    placeholder="Home Address"
                                                    value="HUTECH"
                                                    />
                                            </div>
                                        </div>
                                    </div>
                                    <!--                                    <div class="row">
                                                                            <div class="col-md-4 pr-1">
                                                                                <div class="form-group">
                                                                                    <label>Quận,Huyện</label>
                                                                                    <input
                                                                                        type="text"
                                                                                        class="form-control"
                                                                                        placeholder="City"
                                                                                        value="Melbourne"
                                                                                        />
                                                                                </div>
                                                                            </div>
                                                                            <div class="col-md-4 px-1">
                                                                                <div class="form-group">
                                                                                    <label>Thành Phố</label>
                                                                                    <input
                                                                                        type="text"
                                                                                        class="form-control"
                                                                                        placeholder="Country"
                                                                                        value="Australia"
                                                                                        />
                                                                                </div>
                                                                            </div>-->
                                    <div class="col-md-4 pl-1">
                                        <!-- <div class="form-group">
                                        <label>Postal Code</label>
                                        <input type="number" class="form-control" placeholder="ZIP Code">
                                      </div> -->
                                    </div>
                            </div>
                            <div class="row">
                                <!-- <div class="col-md-12">
                                  <div class="form-group">
                                    <label>About Me</label>
                                    <textarea class="form-control textarea">Oh so, your weak rhyme You doubt I'll bother, reading into it</textarea>
                                  </div>
                                </div> -->
                            </div>
                            <div class="row">
                                <div class="update ml-auto mr-auto">
                                    <button type="submit" class="btn btn-primary btn-round">
                                        Update Profile ( luu y can dien dhu thong tin)
                                    </button>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer footer-black footer-white">
            <div class="container-fluid">
                <div class="row">
                    <nav class="footer-nav">
                        <ul>
                            <li>
                                <a
                                    href="https://www.facebook.com/minkang.27/"
                                    target="_blank"
                                    >facebook</a
                                >
                            </li>
                            <li>
                                <a
                                    href="https://www.instagram.com/minkang.27/"
                                    target="_blank"
                                    >instagram</a
                                >
                            </li>
                            <!-- <li>
                              <a
                                href="https://www.creative-tim.com/license"
                                target="_blank"
                                >Licenses</a
                              >
                            </li> -->
                        </ul>
                    </nav>
                    <div class="credits ml-auto">
                        <span class="copyright">
                            ©
                            <script>
                                document.write(new Date().getFullYear());
                            </script>
                            , made with <i class="fa fa-heart heart"></i> by OpenCV
                        </span>
                    </div>
                </div>
            </div>
        </footer>
    </div>
</div>
<!--   Core JS Files   -->
<script src="../assets/js/core/jquery.min.js"></script>
<script src="../assets/js/core/popper.min.js"></script>
<script src="../assets/js/core/bootstrap.min.js"></script>
<script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
<!--  Google Maps Plugin    -->
<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!-- Chart JS -->
<script src="../assets/js/plugins/chartjs.min.js"></script>
<!--  Notifications Plugin    -->
<script src="../assets/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
<script
    src="../assets/js/paper-dashboard.min.js?v=2.0.1"
    type="text/javascript"
></script>
<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
<script src="../assets/demo/demo.js"></script>
</body>
</html>
