/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-05-25 07:41:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/views/AdminHome.jsp", Long.valueOf(1621870254689L));
    _jspx_dependants.put("/WEB-INF/views/CommonHeader.jsp", Long.valueOf(1621773629643L));
    _jspx_dependants.put("/WEB-INF/views/MyCarousel.jsp", Long.valueOf(1621852576849L));
    _jspx_dependants.put("/WEB-INF/views/Footer.jsp", Long.valueOf(1621852517370L));
    _jspx_dependants.put("jar:file:/E:/All%20about%20Spring/TheProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shopify_Frontend/WEB-INF/lib/spring-security-taglibs-5.3.3.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1591200870000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.3.3.RELEASE.jar", Long.valueOf(1620720403512L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1616332259262L));
    _jspx_dependants.put("jar:file:/E:/All%20about%20Spring/TheProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shopify_Frontend/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\ttype=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("* {box-sizing: border-box;}\r\n");
      out.write("\r\n");
      out.write("body { \r\n");
      out.write("  margin: 0;\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header {\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #f1f1f1;\r\n");
      out.write("  padding: 20px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 18px; \r\n");
      out.write("  line-height: 25px;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a.logo {\r\n");
      out.write("  font-size: 25px;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a.active {\r\n");
      out.write("  background-color: dodgerblue;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header-right {\r\n");
      out.write("  float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 500px) {\r\n");
      out.write("  .header a {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .header-right {\r\n");
      out.write("    float: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <a href=\"index\" class=\"logo\">Shopify</a>\r\n");
      out.write("  <div class=\"header-right\">\r\n");
      out.write("    <a class=\"active\" href=\"index\">Home</a>\r\n");
      out.write("    <a href=\"register\">Register</a>\r\n");
      out.write("    <a href=\"login\">Login</a>\r\n");
      out.write("    <a href=\"aboutUs\">AboutUs</a>\r\n");
      out.write("    <a href=\"contact\">ContactUs</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>\r\n");
      out.write("  <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js'></script>\r\n");
      out.write("  <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>\r\n");
      out.write("  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("   \r\n");
      out.write(" @import url('https://fonts.googleapis.com/css?family=Rubik&display=swap');\r\n");
      out.write("\r\n");
      out.write(" body {\r\n");
      out.write("     background: linear-gradient(0deg, #fff, 50%, #DEEEFE);\r\n");
      out.write("     font-family: 'Rubik', sans-serif;\r\n");
      out.write("     background: #455A64;\r\n");
      out.write("     height: 100 !important\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .container-fluid {\r\n");
      out.write("     overflow: hidden;\r\n");
      out.write("     margin-top: 250px;\r\n");
      out.write("     background: #262626;\r\n");
      out.write("     color: #627482 !important;\r\n");
      out.write("     margin-bottom: 0;\r\n");
      out.write("     padding-bottom: 0\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" small {\r\n");
      out.write("     font-size: calc(12px + (15 - 12) * ((100vw - 360px) / (1600 - 360))) !important\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .bold-text {\r\n");
      out.write("     color: #989c9e !important\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .mt-55 {\r\n");
      out.write("     margin-top: calc(50px + (60 - 50) * ((100vw - 360px) / (1600 - 360))) !important\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" h3 {\r\n");
      out.write("     font-size: calc(34px + (40 - 34) * ((100vw - 360px) / (1600 - 360))) !important\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .social {\r\n");
      out.write("     font-size: 21px !important\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .rights {\r\n");
      out.write("     font-size: calc(10px + (12 - 10) * ((100vw - 360px) / (1600 - 360))) !important\r\n");
      out.write(" }\r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div class=\"container-fluid pb-0 mb-0 justify-content-center text-light \">\r\n");
      out.write("     <footer>\r\n");
      out.write("         <div class=\"row my-5 justify-content-center py-5\">\r\n");
      out.write("             <div class=\"col-11\">\r\n");
      out.write("                 <div class=\"row \">\r\n");
      out.write("                     <div class=\"col-xl-8 col-md-4 col-sm-4 col-12 my-auto mx-auto a\">\r\n");
      out.write("                         <h3 class=\"text-muted mb-md-0 mb-5 bold-text\">Shopify.</h3>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col-xl-2 col-md-4 col-sm-4 col-12\">\r\n");
      out.write("                         <h6 class=\"mb-3 mb-lg-4 bold-text \"><b>MENU</b></h6>\r\n");
      out.write("                         <ul class=\"list-unstyled\">\r\n");
      out.write("                             <li><a class=\"active\" href=\"index\">Home</a></li>\r\n");
      out.write("                             <li><a href=\"register\">Register</a></li>\r\n");
      out.write("                             <li><a href=\"aboutUs\">AboutUs</a></li>\r\n");
      out.write("                             <li><a href=\"contact\">ContactUs</a></li>\r\n");
      out.write("                         </ul>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col-xl-2 col-md-4 col-sm-4 col-12\">\r\n");
      out.write("                         <h6 class=\"mb-3 mb-lg-4 text-muted bold-text mt-sm-0 mt-5\"><b>ADDRESS</b></h6>\r\n");
      out.write("                         <p class=\"mb-1\">Warangal</p>\r\n");
      out.write("                         <p>Telangana</p>\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"row \">\r\n");
      out.write("                     <div class=\"col-xl-8 col-md-4 col-sm-4 col-auto my-md-0 mt-5 order-sm-1 order-3 align-self-end\">\r\n");
      out.write("                         <p class=\"social text-muted mb-0 pb-0 bold-text\"> <span class=\"mx-2\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></span> <span class=\"mx-2\"><i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i></span> <span class=\"mx-2\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></span> <span class=\"mx-2\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></span> </p><small class=\"rights\"><span>&#174;</span> Shopify All Rights Reserved.</small>\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </footer>\r\n");
      out.write(" </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /index.jsp(8,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          out.write("<!DOCTYPE html>\r\n");
          out.write("<html lang=\"en\">\r\n");
          out.write("<head>\r\n");
          out.write("  <meta charset=\"utf-8\">\r\n");
          out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
          out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
          out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
          out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
          out.write("</head>\r\n");
          out.write("<body>\r\n");
          out.write("<div class=\"container\">\r\n");
          out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
          out.write("    <!-- Indicators -->\r\n");
          out.write("    <ol class=\"carousel-indicators\">\r\n");
          out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
          out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
          out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
          out.write("    </ol>\r\n");
          out.write("\r\n");
          out.write("    <!-- Wrapper for slides -->\r\n");
          out.write("    <div class=\"carousel-inner\">\r\n");
          out.write("\r\n");
          out.write("      <div class=\"item active\">\r\n");
          out.write("        <img src=\"images/carousel1.jpg\" alt=\"Image1\" style=\"width:100%;\">\r\n");
          out.write("        <div class=\"carousel-caption\">\r\n");
          out.write("          <h3>Home Decoratives</h3>\r\n");
          out.write(" \r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("\r\n");
          out.write("      <div class=\"item\">\r\n");
          out.write("        <img src=\"images/carousel2.jpg\" alt=\"Image2\" style=\"width:100%;\">\r\n");
          out.write("        <div class=\"carousel-caption\">\r\n");
          out.write("          <h3>Gadgets</h3>\r\n");
          out.write("  \r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("    \r\n");
          out.write("      <div class=\"item\">\r\n");
          out.write("        <img src=\"images/carousel3.jpg\" alt=\"Image3\" style=\"width:100%;\">\r\n");
          out.write("        <div class=\"carousel-caption\">\r\n");
          out.write("          <h3>Shop Here</h3>\r\n");
          out.write("          <p>We have many more!</p>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("  \r\n");
          out.write("    </div>\r\n");
          out.write("\r\n");
          out.write("    <!-- Left and right controls -->\r\n");
          out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
          out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
          out.write("      <span class=\"sr-only\">Previous</span>\r\n");
          out.write("    </a>\r\n");
          out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
          out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
          out.write("      <span class=\"sr-only\">Next</span>\r\n");
          out.write("    </a>\r\n");
          out.write("  </div>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("</html>\r\n");
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /index.jsp(12,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<h3 align=\"justify\">Welcome: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.userPrincipal.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h3>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<strong><a href=\"");
          if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\" class=\"btn btn-info\">Logout</a></strong>\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t\t<br>\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_security_005fauthorize_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_security_005fauthorize_005f1(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /index.jsp(15,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/perform_logout");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_security_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /index.jsp(18,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("\t\t\t\t<h1>Admin Page</h1>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("<head>\r\n");
        out.write("\r\n");
        out.write("<title>ADMIN HOME</title>\r\n");
        out.write("</head>\r\n");
        out.write("<body>\r\n");
        out.write("\t<div>\r\n");
        out.write("\t<center>\r\n");
        out.write("        <a href=\"showProduct\" class=\"btn btn-info\">\r\n");
        out.write("            Product Management\r\n");
        out.write("        </a>\r\n");
        out.write("        <a href=\"showCustomers\" class=\"btn btn-info\">\r\n");
        out.write("            Customer Management\r\n");
        out.write("        </a>\r\n");
        out.write("        </center>\r\n");
        out.write("      </div>\r\n");
        out.write("  \r\n");
        out.write("</body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      _jspx_th_security_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_security_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_security_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_security_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /index.jsp(24,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f1.setAccess("hasRole('ROLE_USER')");
      int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("\t\t\t\t<h1>USER Page</h1>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<a href=\"showProduct\" class=\"btn btn-info\">Shop Now!!</a>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
      _jspx_th_security_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_security_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_security_005fauthorize_005f1_reused);
    }
    return false;
  }
}
