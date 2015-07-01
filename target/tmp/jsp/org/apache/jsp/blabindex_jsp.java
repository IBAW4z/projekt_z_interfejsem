package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blabindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/stopka.jsp");
  }

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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>FRIDGE, RECIPE & FRIENDS</title>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<header><center>\n");
      out.write("\t<h1>FRIDGE, RECIPE & FRIENDS</h1>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"login.jsp\" method=\"POST\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<body><center>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\"/>\n");
      out.write("\t\t\t</body>\n");
      out.write("\t</form>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t<body><center>\n");
      out.write("\t\t\t<form action=\"register.jsp\" method=\"POST\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Register\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</body>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t");
      out.write("<br>\r\n");
      out.write("<hr>\r\n");
      out.write("<h2>\r\n");
      out.write("\tCOPYRIGHT: TEAM4\r\n");
      out.write("</h2>\r\n");
      out.write("</body>\r\n");
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
