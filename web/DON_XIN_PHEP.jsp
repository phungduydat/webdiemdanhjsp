<%-- 
    Document   : DON_XIN_PHEP
    Created on : Sep 9, 2023, 10:32:59 PM
    Author     : duyda
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <link
            rel="apple-touch-icon"
            sizes="76x76"
            href="../assets/img/apple-icon.png"
            />
        <link rel="icon" type="image/png" href="../assets/img/favicon.png" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>Paper Dashboard 2 by Creative Tim</title>
        <meta
            content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no"
            name="viewport"
            />
        <!--     Fonts and icons     -->
        <link
            href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200"
            rel="stylesheet"
            />
        <link
            href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
            rel="stylesheet"
            />
        <!-- CSS Files -->
        <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
        <link href="../assets/css/paper-dashboard.css?v=2.0.1" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="../assets/demo/demo.css" rel="stylesheet" />
    </head>

    <body class="">
        <jsp:include page="lefthomepage.jsp"></jsp:include>
            <div class="main-panel">
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
                <div class="content">
                    <div class="row">
                        <section class="ftco-section">
                            <div class="container">
                                <div class="row justify-content-center">
                                    <div class="col-md-6 text-center mb-5">
                                        <h2 class="heading-section">Đơn Xin Phép</h2>
                                    </div>
                                </div>
                                <div class="row justify-content-center">
                                    <div class="col-md-10">
                                        <div class="wrapper">
                                            <div class="row no-gutters">
                                                <div class="col-md-6">
                                                    <div class="contact-wrap w-100 p-lg-5 p-4">
                                                        <h3 class="mb-4">Đơn Xin Phép</h3>
                                                        <div id="form-message-warning" class="mb-4"></div>
                                                        <!-- <div id="form-message-success" class="mb-4">
                                                            Your message was sent, thank you!
                                                          </div> -->
                                                        <form
                                                            method="POST"
                                                            id="contactForm"
                                                            name="contactForm"
                                                            class="contactForm"
                                                            >
                                                            <div class="row">
                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <input
                                                                            type="text"
                                                                            class="form-control"
                                                                            name="name"
                                                                            id="name"
                                                                            placeholder="Họ tên"
                                                                            />
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <input
                                                                            type="text"
                                                                            class="form-control"
                                                                            name="mssv"
                                                                            id="subject"
                                                                            placeholder="MSSV"
                                                                            />
                                                                    </div>
                                                                </div>  

                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <input
                                                                            type="text"
                                                                            class="form-control"
                                                                            name="email"
                                                                            id="email"
                                                                            placeholder="Lớp Xin nghỉ"
                                                                            />
                                                                    </div>
                                                                </div>

                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <textarea
                                                                            name="lydo"
                                                                            class="form-control"
                                                                            id="message"
                                                                            cols="30"
                                                                            rows="6"
                                                                            placeholder="Lý do xin nghỉ"
                                                                            ></textarea>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-12">
                                                                    <div class="form-group">
                                                                        <input
                                                                            type="submit"
                                                                            value="Gửi Đơn"
                                                                            class="btn btn-primary"
                                                                            />
                                                                        <div class="submitting"></div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 d-flex align-items-stretch">
                                                    <div class="info-wrap w-100 p-lg-5 p-4 img">
                                                        <h3>Thông tin liên lạc</h3>
                                                        <p class="mb-4">
                                                            We're open for any suggestion or just to have a
                                                            chat
                                                        </p>
                                                        <div class="dbox w-100 d-flex align-items-start">
                                                            <div
                                                                class="icon d-flex align-items-center justify-content-center"
                                                                >
                                                                <span class="fa fa-map-marker"></span>
                                                            </div>
                                                            <div class="text pl-3">
                                                                <p>
                                                                    <span>Địa chỉ :</span> 198 West 21th Street,
                                                                    Suite 721 New York NY 10016
                                                                </p>
                                                            </div>
                                                        </div>
                                                        <div class="dbox w-100 d-flex align-items-center">
                                                            <div
                                                                class="icon d-flex align-items-center justify-content-center"
                                                                >
                                                                <span class="fa fa-phone"></span>
                                                            </div>
                                                            <div class="text pl-3">
                                                                <p>
                                                                    <span>Phone:</span>
                                                                    <a href="tel://1234567920">+ 1235 2355 98</a>
                                                                </p>
                                                            </div>
                                                        </div>
                                                        <div class="dbox w-100 d-flex align-items-center">
                                                            <div
                                                                class="icon d-flex align-items-center justify-content-center"
                                                                >
                                                                <span class="fa fa-paper-plane"></span>
                                                            </div>
                                                            <div class="text pl-3">
                                                                <p>
                                                                    <span>Email:</span>
                                                                    <a href="mailto:info@yoursite.com"
                                                                       >info@yoursite.com</a
                                                                    >
                                                                </p>
                                                            </div>
                                                        </div>
                                                        <div class="dbox w-100 d-flex align-items-center">
                                                            <div
                                                                class="icon d-flex align-items-center justify-content-center"
                                                                >
                                                                <span class="fa fa-globe"></span>
                                                            </div>
                                                            <div class="text pl-3">
                                                                <p>
                                                                    <span>Website</span>
                                                                    <a href="#">yoursite.com</a>
                                                                </p>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </section>
                    </div>
                </div>
                <footer class="footer footer-black footer-white">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="card card-plain">
                                    <div class="card-header">
                                        <h4 class="card-title">DANH SACH DON XIN CUA BAN</h4>
                                        <p class="card-category">Here is a subtitle for this table</p>
                                    </div>
                                </div>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead class="text-primary">
                                        <th>MSSV</th>
                                        <th>Lớp</th>
                                        <th>Lý do</th>
                                        <th>Duyet</th>
                                        <!-- <th class="text-right">Salary</th> -->
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${donxin}" var="d">
                                            <tr>
                                                <td>${d.getMssv()}</td>
                                                <td>${d.getClassno()}</td>
                                                <td>${d.getLydo()}</td>
                                                <c:if test="${d.getDuyet() == 0}">
                                            <li class="nav-item">
                                            <td>Chua duoc duyet</td>
                                            </li>
                                        </c:if>
                                        <c:if test="${d.getDuyet() == 1}">
                                            <li class="nav-item">
                                            <td>Da duoc duyet</td>
                                            </li>
                                        </c:if>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
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
