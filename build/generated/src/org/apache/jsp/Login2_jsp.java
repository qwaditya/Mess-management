package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>MESS MANAGEMENT SYSTEM</title>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"css/ie/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.poptrox.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\n");
      out.write("\t\t<noscript>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("\t\t</noscript>\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie/v8.css\" /><![endif]-->\n");
      out.write("                <style>\n");
      out.write("                    \n");
      out.write("                    .button {\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 12px 21px;\n");
      out.write("  font-size: 19px;\n");
      out.write("  text-align: center;\n");
      out.write("  right:300px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  text-decoration: none;\n");
      out.write("  position:center;\n");
      out.write("  outline: none;\n");
      out.write("  color: black;\n");
      out.write("  background-color: whitesmoke;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  box-shadow: 0 9px activecaption;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {background-color: window}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  background-color: white;\n");
      out.write("  box-shadow: 0 5px blue;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}\n");
      out.write("                    body{\n");
      out.write("                        background-image: url(\"one.jpg\");\n");
      out.write("                    }\n");
      out.write("                    h3{\n");
      out.write("                        top:100px;\n");
      out.write("                        right:450px;\n");
      out.write("                        color:white;\n");
      out.write("                        font-family: sans-serif;\n");
      out.write("                        text-align: center;\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                    h1{\n");
      out.write("                      \n");
      out.write("    text-align: center;\n");
      out.write("    \n");
      out.write("                    }\n");
      out.write("                    form{\n");
      out.write("        text-align:center;\n");
      out.write("       padding: 40px;\n");
      out.write("      \n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("\t</head>\n");
      out.write("        \n");
      out.write("\t<body >\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t <img src='messs.png' alt='mess management'/></a> \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!-- Intro -->\n");
      out.write("\t\t\t\n");
      out.write("                                    <h1>MESS MANAGEMENT SYSTEM</h1>\n");
      out.write("                                    <h3><b>Hardwork should be rewarded by good food</b></h3>\n");
      out.write("                                     \n");
      out.write("\t\t\t\t\t\n");
      out.write("        &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;     &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;   &nbsp;&nbsp;                <button id=\"show-dialog\" class=\"button\">LOGIN</button>\n");
      out.write("  <dialog class=\"mdl-dialog\">\n");
      out.write("    \n");
      out.write("    <div class=\"mdl-dialog__content\">\n");
      out.write("      <form action=\"Home2.jsp\" method=\"POST\">\n");
      out.write("   \n");
      out.write("    \n");
      out.write("     USERNAME:\n");
      out.write("     <input type=\"text\" name=\"email\" value=\"\" autocomplete=\"on\" required\n");
      out.write("     \n");
      out.write("     <br>\n");
      out.write("     PASSWORD:\n");
      out.write("     <input type=\"password\" name=\"pass\" title=\"six characters or more\" required>\n");
      out.write("    \n");
      out.write("    <div class=\"mdl-dialog__actions\">\n");
      out.write("        <input type=\"submit\" value=\"SUBMIT\" name=\"cmdSubmit\" />\n");
      out.write("      <button type=\"button\" class=\"mdl-button close\">CLOSE</button>\n");
      out.write("    </div>\n");
      out.write("      </form>\n");
      out.write("     </div>\n");
      out.write("  </dialog>\n");
      out.write("        \n");
      out.write("  <script>\n");
      out.write("    var dialog = document.querySelector('dialog');\n");
      out.write("    var showDialogButton = document.querySelector('#show-dialog');\n");
      out.write("    if (! dialog.showModal) {\n");
      out.write("      dialogPolyfill.registerDialog(dialog);\n");
      out.write("    }\n");
      out.write("    showDialogButton.addEventListener('click', function() {\n");
      out.write("      dialog.showModal();\n");
      out.write("    });\n");
      out.write("    dialog.querySelector('.close').addEventListener('click', function() {\n");
      out.write("      dialog.close();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("\t\t\t\n");
      out.write("                \n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
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
