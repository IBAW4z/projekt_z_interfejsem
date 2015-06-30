package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>TheFridge</title>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./style.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<h1>TheFridge</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\t");
      out.write("\t<div id=\"center\" style=\"text-align:center;\" name=\"interfejs\">\r\n");
      out.write("\t\t<div id=\"menu_place\" name=\"panel_sterowania\">\r\n");
      out.write("\t\t\t<div id=\"pole_batona\">\r\n");
      out.write("\t\t\t\t<p><a id=\"odsylacz\" href=\"RecipeController?action=insert\">Add Recipe</a></p>\r\n");
      out.write("\t\t\t\t<!--<input type=\"submit\" value=\"Add recipe\" name=\"Add_recipe\">-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pole_batona\" style=\"top:90px;\">\r\n");
      out.write("\t\t\t\t<p><a id=\"odsylacz\" href=\"FridgeController?action=insert\">Add Product</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pole_batona\" style=\"top:160px;\">\r\n");
      out.write("\t\t\t\t<p><a id=\"odsylacz\" href=\"FridgeController?action=listFridge\">Show all Products</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pole_batona\" style=\"top:230px;\">\r\n");
      out.write("\t\t\t\t<p><a id=\"odsylacz\" href=\"RecipeController?action=listRecipe\">Show all Recipes</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pole_batona\" style=\"top:300px;\">\r\n");
      out.write("\t\t\t\t<p><a id=\"odsylacz\" href=\"RecipeController?action=insert\">Other operation</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pole_batona\" style=\"top:370px;\">\r\n");
      out.write("\t\t\t\t<p><a id=\"odsylacz\" href=\"LogoutController\">Logout</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>");
      out.write("\r\n");
      out.write("\t\t<div id=\"robocza\"><center>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1>Welcome to THE FRIDGE! </h1>\r\n");
      out.write("\t\t</center></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"stopka.html\"> </script>\r\n");
      out.write("\t<footer style=\"margin-top:40px;\">\r\n");
      out.write("\tCopyright - Team4 \r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
