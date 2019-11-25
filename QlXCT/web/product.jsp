<%-- 
    Document   : product
    Created on : Nov 22, 2019, 9:22:12 AM
    Author     : Thien Linh
--%>

<%@page import="java.text.NumberFormat"%>
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
    </head>
    <body>
        <%
            SanPham sanPhamDAO = new SanPham();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        %>
        <div class="col-sm-9 padding-right">
            <div class="features_items"><!--features_items-->
                    <h2 class="title text-center">San pham <%=request.getParameter("ma_danh_muc")%></h2>
                    <%
                        for(SanPham sp: sanPhamDAO.getListProductByCategory(request.getParameter("ma_danh_muc"))) {
                    %>
                    <div class="col-sm-4">
                            <div class="product-image-wrapper">
                                    <div class="single-products">
                                        <div class="productinfo text-center">
                                                <img src="images/home/linh.jpg" alt="" />
                                                <h2><%=nf.format(sp.getDon_gia())%> VNĐ</h2>
                                                <p><%=sp.getTen_san_pham()%></p>
                                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Them vao gio hang</a>
                                        </div>
                                    </div>
                                    <div class="choose">
                                            <ul class="nav nav-pills nav-justified">
                                                    <li><a href="#"><i class="fa fa-plus-square"></i>Them so sanh</a></li>
                                                    <li><a href="detail.jsp?ma_san_pham=<%=sp.getMa_san_pham()%>"><i class="fa fa-plus-square"></i>Xem chi tiet</a></li>
                                            </ul>
                                    </div>
                            </div>
                    </div>
                    <%
                        }
                    %>
            </div><!--features_items-->				
	</div>
    </body>
</html>
