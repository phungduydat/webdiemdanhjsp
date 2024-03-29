<%-- 
    Document   : ThongKeCuoiGioGV
    Created on : Sep 10, 2023, 10:38:09 PM
    Author     : duyda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <div class="wrapper ">
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
                                <a class="navbar-brand" href="javascript:;">${classno.name} : ${classno.ngayhoc}</a>
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
                            <div class="col-md-12">
                                <div class="card">
                                    <div class="card-header">
                                        <h5 class="title">Thống Kê Sau Buổi Học</h5>
                                        <!-- <p class="category">Created using Montserrat Font Family</p> -->
                                    </div>
                                    <div class="col-md-12">
                                        <div class="card card-plain">
                                            <div class="card-header">
                                                <h4 class="card-title">Sinh Viên Đi Học Đầy đủ</h4>
                                                <!-- <p class="card-category">Here is a subtitle for this table</p> -->
                                            </div>
                                            <div class="card-body">
                                                <div class="table-responsive">
                                                    <table class="table">
                                                        <thead class="text-primary">
                                                        <th>Họ và Tên</th>
                                                        <th>MSSV</th>
                                                        <th>Lớp</th>
                                                        <th>Time-in</th>
                                                        <th>Time-out</th>
                                                        <!-- <th class="text-right">Salary</th> -->
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${list1}" var="l1">
                                                            <tr>
                                                                <td>${l1.getMSSV()}</td>
                                                                <td>${l1.getName()}</td>
                                                                <td>${l1.getMalop()}</td>
                                                                <td>${l1.getCheckin()}</td>
                                                                <td>${l1.getCheckout()}</td>
                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="card card-plain">
                                        <div class="card-header">
                                            <h4 class="card-title">Sinh Viên Đi Trễ</h4>
                                            <p class="card-category">Here is a subtitle for this table</p>
                                        </div>
                                        <div class="card-body">
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead class="text-primary">
                                                    <th>Họ và Tên</th>
                                                    <th>MSSV</th>
                                                    <th>Lớp</th>
                                                    <th>Time-in</th>
                                                    <th>Time-out</th>
                                                    <!-- <th class="text-right">Salary</th> -->
                                                    </thead>
                                                    <c:forEach items="${list2}" var="tre">
                                                        <tr>
                                                            <td>${tre.getMSSV()}</td>
                                                            <td>${tre.getName()}</td>
                                                            <td>${tre.getMalop()}</td>
                                                            <td>${tre.getCheckin()}</td>
                                                            <td>${tre.getCheckout()}</td>
                                                        </tr>
                                                    </c:forEach>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="card card-plain">
                                        <div class="card-header">
                                            <h4 class="card-title">Sinh Viên Nghỉ Học</h4>
                                            <p class="card-category">Here is a subtitle for this table</p>
                                        </div>
                                        <div class="card-body">
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead class="text-primary">
                                                    <th>Họ và Tên</th>
                                                    <th>MSSV</th>
                                                    <th>Lớp</th>
                                                    <th>Lý do</th>
                                                    <th>Duyệt</th>
                                                    <!-- <th class="text-right">Salary</th> -->
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach items="${list3}" var="l3">
                                                            <tr>
                                                                <td>${l3.getMssv()}</td>
                                                                <td>${l3.getTensv()}</td>
                                                                <td>${l3.getMalop()}</td>
                                                                <td>${l3.getLydo()}</td>
                                                                <c:if test="${l3.getDuyet() == 1}">
                                                                    <td>Da duoc duyet</td>
                                                                </c:if>
                                                                <c:if test="${l3.getDuyet() == -1}">
                                                                    <td>Chua duoc duyet</td>
                                                                </c:if>
                                                                <c:if test="${l3.getDuyet() == 0}">
                                                                    <td>Chua duoc duyet</td>
                                                                </c:if>

                                                            </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="card card-plain">
                                            <div class="card-header">
                                                <h4 class="card-title">Sinh Viên Về Sớm</h4>
                                                <p class="card-category">Here is a subtitle for this table</p>
                                            </div>
                                            <div class="card-body">
                                                <div class="table-responsive">
                                                    <table class="table">
                                                        <thead class="text-primary">
                                                        <th>Họ và Tên</th>
                                                        <th>MSSV</th>
                                                        <th>Lớp</th>
                                                        <<th>Time-in</th>
                                                        <th>Time-out</th>
                                                        <!-- <th class="text-right">Salary</th> -->
                                                        </thead>
                                                        <tbody>
                                                            <c:forEach items="${list4}" var="l4">
                                                                <tr>
                                                                    <td>${l4.getMssv()}</td>
                                                                    <td>${l4.getTensv()}</td>
                                                                    <td>${l4.getMalop()}</td>
                                                                    <td>${l4.getCheckin()}</td>
                                                                    <td>${l4.getCheckout()}</td>
                                                                </tr>
                                                            </c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <footer class="footer footer-black  footer-white ">
                    <div class="container-fluid">
                        <div class="row">
                            <nav class="footer-nav">
                                <ul>
                                    <li><a href="https://www.creative-tim.com" target="_blank">Creative Tim</a></li>
                                    <li><a href="https://www.creative-tim.com/blog" target="_blank">Blog</a></li>
                                    <li><a href="https://www.creative-tim.com/license" target="_blank">Licenses</a></li>
                                </ul>
                            </nav>
                            <div class="credits ml-auto">
                                <span class="copyright">
                                    © <script>
                                        document.write(new Date().getFullYear())
                                    </script>, made with <i class="fa fa-heart heart"></i> by Creative Tim
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
        <script src="../assets/js/paper-dashboard.min.js?v=2.0.1" type="text/javascript"></script><!-- Paper Dashboard DEMO methods, don't include it in your project! -->
        <script src="../assets/demo/demo.js"></script>
    </body>

</html>
</html>
