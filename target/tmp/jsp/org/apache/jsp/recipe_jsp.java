package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\n");
      out.write("\t<link type=\"text/css\"\n");
      out.write("\t\thref=\"css/ui-lightness/jquery-ui-1.8.18.custom.css\" rel=\"stylesheet\" />\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.7.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-ui-1.8.18.custom.min.js\"></script>\n");
      out.write("  <title>TheFridge</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"./style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("        $(function() {\n");
      out.write("            $('input[name=dob]').datepicker();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\t\n");
      out.write("\t<header>\n");
      out.write("\t<h1>Add recipe</h1>\n");
      out.write("\t</header>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\t\t<div id=\"robocza\"><center>\n");
      out.write("\n");
      out.write("\t\t\t<form method=\"POST\" action='RecipeController' name=\"frmAddRecipe\">\n");
      out.write("\t\t\t\tRecipe ID : <input type=\"text\" readonly=\"readonly\" name=\"recipeId\"\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.recipeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br />\n");
      out.write("\t\t\t\tName : <input\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"dishname\"\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" /> <br />\n");
      out.write("\t\t\t\tType : <input\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"dishtype\"\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" /> <br />\n");
      out.write("\t\t\t\tDifficulty : <input\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"dishdifficulty\"\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\" /> <br />\n");
      out.write("\t\t\t\tFlavour : <input type=\"text\" name=\"dishflavour\"\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\" /> <br />\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Add\" />\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</center></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<footer style=\"margin-top:40px;\">\n");
      out.write("\tCopyright - Team4 \n");
      out.write("\t</footer>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.type}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.difficulty}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.flavour}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
