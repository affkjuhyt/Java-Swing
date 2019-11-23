package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer-widget\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Service</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Online Help</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Order Status</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Change Location</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">FAQ’s</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Quock Shop</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">T-Shirt</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mens</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Womens</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Gift Cards</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Policies</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Privecy Policy</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Refund Policy</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Billing System</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Ticket System</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Company Information</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Careers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Store Location</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Affillate Program</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Copyright</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-sm-offset-1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"searchform\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your email address\" />\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Get the most recent updates from <br />our site and be updated your self...</p>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<p class=\"pull-left\">Copyright © 2013 E-SHOPPER Inc. All rights reserved.</p>\n");
      out.write("\t\t\t\t\t<p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</footer><!--/Footer-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
