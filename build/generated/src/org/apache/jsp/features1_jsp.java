package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class features1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" class=\"csstransforms csstransforms3d csstransitions\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"webthemez\">\n");
      out.write("  <title>MESS MANAGEMENT</title>\n");
      out.write("  <!-- core CSS -->\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("  <script src=\"js/html5shiv.js\"></script>\n");
      out.write("  <script src=\"js/respond.min.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("<body id=\"home\">\n");
      out.write("\n");
      out.write("<header id=\"header\">\n");
      out.write("  <nav id=\"main-nav\" class=\"navbar navbar-default navbar-fixed-top\" role=\"banner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("          <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"home.jsp\"><span style=\"font-size: 35px;color: #FFF;line-height: 1em;font-weight: bold;\">MESS MANAGEMENT SYSTEM</span></a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse navbar-right\">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("         <li class=\"scroll\"><a href=\"home22.jsp\">Admin</a></li>\n");
      out.write("          <li class=\"scroll\"><a href=\"about.jsp\">Daily Expense</a></li>\n");
      out.write("          <li class=\"scroll\"><a href=\"features1.jsp\">Supplier</a></li>\n");
      out.write("          <li class=\"scroll\"><a href=\"services.jsp\">Kitchen Stock</a></li>\n");
      out.write("          <li class=\"scroll\"><a href=\"display\">Stores</a></li>\n");
      out.write("          <li class=\"scroll\"><a href=\"contact.jsp\">Reports</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--/.container-->\n");
      out.write("  </nav>\n");
      out.write("  <!--/nav-->\n");
      out.write("  </header>\n");
      out.write("<!--/header-->\n");
      out.write("<div class=\"features\"></div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"section-header\">\n");
      out.write("      <h2 class=\"section-title wow fadeInDown animated\"\n");
      out.write("          style=\"visibility: visible; animation-name: fadeInDown; -webkit-animation-name: fadeInDown;\"><b>SUPPLIER  AND SUPPLY DETAILS</b></h2>\n");
      out.write("\n");
      out.write("      <p class=\"wow fadeInDown animated\"\n");
      out.write("         style=\"visibility: visible; animation-name: fadeInDown; -webkit-animation-name: fadeInDown;\">.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"home\"></div>\n");
      out.write("  <div class=\"banner-inner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("              <li class=\"scroll\"><a href=\"features2.jsp\"><b>PURCHASE DETAILS</b></a></li>\n");
      out.write("              <li class=\"scroll\"><a href=\"features.jsp\"><b>PAYMENT DETAILS</b></a></li>\n");
      out.write("              <li class=\"scroll\"><a href=\"features.jsp\"><b>RETURN PURCHASE</b></a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/mousescroll.js\"></script>\n");
      out.write("<script src=\"js/smoothscroll.js\"></script>\n");
      out.write("<script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("<script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.inview.min.js\"></script>\n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<script src=\"js/custom-scripts.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
