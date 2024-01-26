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
                                <a class="navbar-brand" href="javascript:;">Paper Dashboard 2</a>
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
                        <div class="container">
                            <div class="row align-items-center">
                                <div class="col-md-6">
                                    <div class="mb-3">
                                        <h5 class="card-title">Danh sách xin nghỉ phép</h5>
                                    </div>
                                </div>
                                <div class="col-md-6"></div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class>
                                        <div class="table-responsive">
                                            <table
                                                class="table project-list-table table-nowrap align-middle table-borderless"
                                                >
                                                <thead>
                                                    <tr>
                                                        <th scope="col" class="ps-4" style="width: 50px">
                                                            <div class="form-check font-size-16">
                                                                <input
                                                                    type="checkbox"
                                                                    class="form-check-input"
                                                                    id="contacusercheck"
                                                                    /><label
                                                                    class="form-check-label"
                                                                    for="contacusercheck"
                                                                    ></label>
                                                            </div>
                                                        </th>
                                                        <th scope="col">Họ tên</th>
                                                        <th scope="col">Mã Số Sinh Viên</th>
                                                        <th scope="col">Lớp</th>
                                                        <th scope="col">Lý Do</th>
                                                        <th scope="col" style="width: 200px">Duyệt</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <th scope="row" class="ps-4">
                                                            <div class="form-check font-size-16">
                                                                <input
                                                                    type="checkbox"
                                                                    class="form-check-input"
                                                                    id="contacusercheck1"
                                                                    /><label
                                                                    class="form-check-label"
                                                                    for="contacusercheck1"
                                                                    ></label>
                                                            </div>
                                                        </th>
                                                    </tr>
                                                <c:forEach items="${donxin}" var="d">
                                                    <tr>
                                                        <td></td>
                                                        <td>${d.getTenSV()}</td>
                                                        <td>
                                                            <span class="badge badge-soft-success mb-0"
                                                                  >${d.getMssv()}</span
                                                            >
                                                        </td>
                                                        <td>${d.getClassno()}</td>
                                                        <td>${d.getLydo()}</td>
                                                        <c:if test="${d.getDuyet() == 0}">
                                                            <td>
                                                                <a href="duyetdon?Mssv=${d.getMssv()}&duyetdon?classno=${d.classno}" class=""> Duyet di tre</a>
                                                            </td>
                                                        </c:if>
                                                        <c:if test="${d.getDuyet() == 1}">
                                                            <td>
                                                               Da Duyet
                                                            </td>
                                                        </c:if>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="update ml-auto mr-auto" >
                                        <button type="submit" class="btn btn-primary btn-round">
                                            Luu vao database
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row g-0 align-items-center pb-4">
                            <div class="col-sm-6"></div>
                        </div>
                    </div>
                </div>
                <script
                    data-cfasync="false"
                    src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"
                ></script>
                <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
                <script type="text/javascript"></script>
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
</html>
