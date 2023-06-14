package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"../css/bootstrap-4.0.0-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"../css/bootstrap-4.0.0-dist/css/bootstrap-grid.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-sm fixed-top text-dark .bg-white choice-taskbar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"> <img src=\"../icon/bars-solid.svg\" alt=\"\"> </span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"collapsibleNavbar\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto choice-taskbar-one\">\n");
      out.write("                    <li class=\"nav-item choice-taskbar\">\n");
      out.write("                        <a href=\"./home.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item choice-taskbar\">\n");
      out.write("                        <a href=\"./aboutus.html\">\n");
      out.write("                            About\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item choice-taskbar\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            Menu\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item choice-taskbar\">\n");
      out.write("                        <a href=\"./contactus.html\">\n");
      out.write("                            Contact\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle text-center\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                       \n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\">Javascript</a>\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\">Css</a>\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\">Bootstrap</a>\n");
      out.write("                        </div>\n");
      out.write("                     </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"navbar-nav ml-auto order-last login-logout\">\n");
      out.write("                    <!-- <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"../\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Logout</a>\n");
      out.write("                    </li> -->\n");
      out.write("                <!-- </ul> -->\n");
      out.write("\n");
      out.write("                <!-- <ul class=\"navbar-nav ml-auto\"> -->                    \n");
      out.write("\n");
      out.write("                     <form class=\"form-inline\" action=\"/somepage\">\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                        <button class=\"btn btn-success\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"btn-group dropleft\">\n");
      out.write("                        <div class=\"btn \" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"30\" height=\"30\" fill=\"currentColor\" class=\"bi bi-person-circle\" viewBox=\"0 0 16 16\">\n");
      out.write("                                <path d=\"M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z\"/>\n");
      out.write("                                <path fill-rule=\"evenodd\" d=\"M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z\"/>\n");
      out.write("                              </svg>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                       \n");
      out.write("                              <div class=\"dropdown-menu\">\n");
      out.write("                                  <a class=\"dropdown-item\" href=\"login.jsp\">Login</a>\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\">Logout</a>\n");
      out.write("                           <a class=\"dropdown-item\" href=\"#\">Edit profile</a>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("         \n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"Navbar\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\"> ... </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"slider\">\n");
      out.write("        <div class=\"text-content\">\n");
      out.write("            <h2 class=\"text-description\">Your pleasure is our happiness</h2>\n");
      out.write("            <h2 class=\"text-header\">Outer beauty comes from inner health.</h2>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"main-content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row  choice-list\">\n");
      out.write("                <div class=\"col-sm-6 ml-auto\">\n");
      out.write("                    <h5>DANH MỤC SẢN PHẨM</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 mr-auto\">\n");
      out.write("                    <a href=\"./detailVaccine.jsp\">Xem tất cả</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2021/07/vaxigrip-tetra.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin Tứ giá Vaxigrip Tetra phòng bệnh Cúm mùa</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2019/11/prevenar.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin phế cầu PREVENAR 13 – Phòng các bệnh do phế cầu khuẩn</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2020/02/boostrix.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin BOOSTRIX (Bỉ) phòng Ho gà – Bạch hầu – Uốn ván</h6>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2021/07/vaxigrip-tetra.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin Tứ giá Vaxigrip Tetra phòng bệnh Cúm mùa</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2019/11/prevenar.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin phế cầu PREVENAR 13 – Phòng các bệnh do phế cầu khuẩn</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2020/02/boostrix.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin BOOSTRIX (Bỉ) phòng Ho gà – Bạch hầu – Uốn ván</h6>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2021/07/vaxigrip-tetra.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin Tứ giá Vaxigrip Tetra phòng bệnh Cúm mùa</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2019/11/prevenar.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin phế cầu PREVENAR 13 – Phòng các bệnh do phế cầu khuẩn</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 content-vaccine\">\n");
      out.write("                    <img src=\"https://vnvc.vn/wp-content/uploads/2020/02/boostrix.jpg\" alt=\"\">\n");
      out.write("                    <h6>Vắc xin BOOSTRIX (Bỉ) phòng Ho gà – Bạch hầu – Uốn ván</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-4 col-sm-2\">\n");
      out.write("                <p>Links</p>\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"./home.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"\">About</a></li>\n");
      out.write("                    <li><a href=\"\">Menu</a></li>\n");
      out.write("                    <li><a href=\"\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-7 col-sm-5\">\n");
      out.write("                <p>Our Address</p>\n");
      out.write("                <span>121, Clear Water Bay Road <br>\n");
      out.write("                    Clear Water Bay, Kowloon <br>\n");
      out.write("                    HONG KONG </span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12\">\n");
      out.write("                        <img width=\"10\" height=\"10\" src=\"icon/phone-solid.svg\" alt=\"\">\n");
      out.write("                        <span class=\"\">+852 1234 5678</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12\">\n");
      out.write("                        <img width=\"10\" height=\"10\" src=\"icon/tty-solid.svg\" alt=\"\">\n");
      out.write("                        <span class=\"\">+852 8765 4321 </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"phone col-xl-12\">\n");
      out.write("                        <img width=\"10\" height=\"10\" src=\"icon/envelope-solid.svg\" alt=\"\">\n");
      out.write("                        <a href=\"mailto:confusion@food.net\">confusion@food.net</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-12 col-sm-4\" style=\"margin: auto;\">\n");
      out.write("                <div class=\"row social-media\">\n");
      out.write("                    <img width=\"40\" height=\"40\" src=\"icon/450_1000.jpg\" alt=\"\">\n");
      out.write("                    <img width=\"40\" height=\"40\" src=\"icon/640px-Facebook-icon-1.png\" alt=\"\">\n");
      out.write("                    <img width=\"40\" height=\"40\" src=\"icon/download.png\" alt=\"\">\n");
      out.write("                    <img width=\"40\" height=\"40\" src=\"icon/twitter-icon-square-logo-108D17D373-seeklogo.com.png\" alt=\"\">\n");
      out.write("                    <img width=\"40\" height=\"40\" src=\"icon/pngtree-youtube-square-png-png-image_1589629.jpg\" alt=\"\">\n");
      out.write("                    <img width=\"40\" height=\"40\" src=\"icon/images.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-auto\" style=\"margin: auto;\">© Copyright 2018 Ristorante Con Fusion</div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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