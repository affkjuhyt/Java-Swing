<%-- 
    Document   : detail
    Created on : Nov 22, 2019, 9:35:36 AM
    Author     : Thien Linh
--%>

<%@page import="model.SanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </head>
    <body>
        <%
           SanPham sanPhamDAO = new SanPham();
           // Lay gia tri gui len tu client
           SanPham sp = sanPhamDAO.getChiTietSanPham(request.getParameter("ma_san_pham"));
        %>
        
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="category.jsp"></jsp:include>
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-9 padding-right">
                            <div class="product-details"><!--product-details-->
                                    <div class="col-sm-5">
                                            <div class="view-product">
                                                    <img src="images/product-details/linh.jpg" alt="" />
                                            </div>
                                    </div>
                                    
                                    
                                    <div class="col-sm-7">
                                            <div class="product-information"><!--/product-information-->
                                                    <img src="images/product-details/new.jpg" class="newarrival" alt="" />
                                                    
                                                    <h2><%=sp.getTen_san_pham()%></h2>
                                                    <p>Ma san pham: <%=request.getParameter("ma_san_pham")%></p>
                                                    <span>
                                                            <span><%=sp.getDon_gia()%> VNĐ</span>
                                                    </span>
                                                     <button type="button" class="btn btn-fefault cart">
                                                                    <i class="fa fa-shopping-cart"></i>
                                                                    Them vao gio hang
                                                            </button>
                                                    <p><b>So luong:</b> <%=sp.getSo_luong()%></p>
                                                    <p><b>Giam gia:</b> <%=sp.getGiam_gia()%></p>
                                                    
                                            </div><!--/product-information-->
                                    </div>
                            </div><!--/product-details-->
            </div>
        </section>                                       
    </body>
</html>
