<%-- 
    Document   : TheoDoiGV
    Created on : Sep 10, 2023, 9:59:12 PM
    Author     : duyda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <style type="text/css">
            body {
                margin-top: 20px;
                background: #eee;
                color: #708090;
            }
            .icon-1x {
                font-size: 24px !important;
            }
            a {
                text-decoration: none;
            }
            .text-primary,
            a.text-primary:focus,
            a.text-primary:hover {
                color: #00adbb !important;
            }
            .text-black,
            .text-hover-black:hover {
                color: #000 !important;
            }
            .font-weight-bold {
                font-weight: 700 !important;
            }
        </style>
    </head>

    <body class="">
        <div class="wrapper">
            <jsp:include page="lefthomepage_1.jsp"></jsp:include>

                <!-- Navbar -->
                <nav
                    class="navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent"
                    >
                    <div class="container-fluid">
                        <div class="navbar-wrapper">
                            <div class="navbar-toggle">
                                <button type="button" class="navbar-toggler">
                                    <span class="navbar-toggler-bar bar1"></span>
                                    <span class="navbar-toggler-bar bar2"></span>
                                    <span class="navbar-toggler-bar bar3"></span>
                                </button>
                            </div>
                            <a class="navbar-brand" href="javascript:;">Paper Dashboard 2</a>
                        </div>
                        <button
                            class="navbar-toggler"
                            type="button"
                            data-toggle="collapse"
                            data-target="#navigation"
                            aria-controls="navigation-index"
                            aria-expanded="false"
                            aria-label="Toggle navigation"
                            >
                            <span class="navbar-toggler-bar navbar-kebab"></span>
                            <span class="navbar-toggler-bar navbar-kebab"></span>
                            <span class="navbar-toggler-bar navbar-kebab"></span>
                        </button>
                        <div
                            class="collapse navbar-collapse justify-content-end"
                            id="navigation"
                            >
                            <form>
                                <div class="input-group no-border">
                                    <input
                                        type="text"
                                        value=""
                                        class="form-control"
                                        placeholder="Search..."
                                        />
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
                                    <a
                                        class="nav-link dropdown-toggle"
                                        href="http://example.com"
                                        id="navbarDropdownMenuLink"
                                        data-toggle="dropdown"
                                        aria-haspopup="true"
                                        aria-expanded="false"
                                        >
                                        <i class="nc-icon nc-bell-55"></i>
                                        <p>
                                            <span class="d-lg-none d-md-block">Some Actions</span>
                                        </p>
                                    </a>
                                    <div
                                        class="dropdown-menu dropdown-menu-right"
                                        aria-labelledby="navbarDropdownMenuLink"
                                        >
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
                <div class="container">
                    <div class="row">
                        <div class="col-lg-9 mb-3">
                            <div class="row text-left mb-5">
                                <div class="col-lg-6 mb-3 mb-sm-0">
                                    <!-- <div
                                      class="dropdown bootstrap-select form-control form-control-lg bg-white bg-op-9 text-sm w-lg-50"
                                      style="width: 100%"
                                    >
                                      <select
                                        class="form-control form-control-lg bg-white bg-op-9 text-sm w-lg-50"
                                        data-toggle="select"
                                        tabindex="-98"
                                      >
                                        <option>Categories</option>
                                        <option>Learn</option>
                                        <option>Share</option>
                                        <option>Build</option>
                                      </select>
                                    </div> -->
                                </div>
                                <div class="col-lg-6 text-lg-right">
                                    <!-- <div
                                      class="dropdown bootstrap-select form-control form-control-lg bg-white bg-op-9 ml-auto text-sm w-lg-50"
                                      style="width: 100%"
                                    >
                                      <select
                                        class="form-control form-control-lg bg-white bg-op-9 ml-auto text-sm w-lg-50"
                                        data-toggle="select"
                                        tabindex="-98"
                                      >
                                        <option>Filter by</option>
                                        <option>Votes</option>
                                        <option>Replys</option>
                                        <option>Views</option>
                                      </select>
                                    </div> -->
                                </div>
                            </div>

                            <div
                                class="card row-hover pos-relative py-3 px-3 mb-3 border-warning border-top-0 border-right-0 border-bottom-0 rounded-0"
                                >

                            <c:forEach items="${listclass}" var="o">
                                <div class="row align-items-center">
                                    <div class="col-md-8 mb-3 mb-sm-0">
                                        <h5>
                                            <a href="thongke?classno=${o.classno}" class="text-primary">${o.name}</a>
                                        </h5>

                                        <div class="text-sm">
                                            <a class="text-black" href="#"> ${o.ngayhoc}</a>
                                            <span class="op-6">7-11</span>
                                        </div>

                                        <div class="text-sm">
                                            <a class="text-black" href="#">Phòng : </a>
                                            <span class="op-6">${o.classno}</span>
                                        </div>
                                        <div class="text-sm">
                                            <a class="text-black" href="#">Lớp :</a>
                                            <span class="op-6">${o.name}</span>
                                        </div>
                                    </div>

                                    <div class="col-md-4 op-7">
                                        <div class="row text-center op-7">
                                            <div class="col px-1">
                                                <i class="ion-connection-bars icon-1x"></i>
                                                <span class="d-block text-sm">50 Học Viên</span>
                                            </div>
                                        </div>
                                    </div>
                                          <div class="col-md-8 mb-3 mb-sm-0">
                                            -----------------------------------------------------------------------
                                        </div>
                                </div>


                            </c:forEach>

                        </div>


                        <div class="col-lg-3 mb-4 mb-lg-0 px-lg-0 mt-lg-0">
                            <div
                                style="
                                visibility: hidden;
                                display: none;
                                width: 285px;
                                height: 801px;
                                margin: 0px;
                                float: none;
                                position: static;
                                inset: 85px auto auto;
                                "
                                ></div>
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
