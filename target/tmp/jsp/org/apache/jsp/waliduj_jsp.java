package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class waliduj_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <!-- Użycie tagu jsp:useBean. Tag ten szuka obiektu klasy User z pakiecie\r\n");
      out.write("    javastart.jspexample.model w sesji użytkownika. Jeśli znajdzie, to go \r\n");
      out.write("    wykorzysta, jeśli nie stworzy nowy obiekt klasy user o nazwie \"user\"-->\r\n");
      out.write("    ");
      main.java.model.User user = null;
      synchronized (session) {
        user = (main.java.model.User) _jspx_page_context.getAttribute("user", PageContext.SESSION_SCOPE);
        if (user == null){
          user = new main.java.model.User();
          _jspx_page_context.setAttribute("user", user, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <!-- Użycie tagu jsp:setProperty. Tag ten umieszcza wszystkie parametry\r\n");
      out.write("    przesyłane z innych plików jsp pasujące do obiektu o nazwie user. Jeśli\r\n");
      out.write("    parametry te nie będą się zgadzać, tomcat wyrzuci wyjątkiem -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("user"), request);
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <!-- Ponowne użycie tagu jsp:useBean ładujący źródło danych. -->\r\n");
      out.write("    ");
      main.java.model.DataSource dataSource = null;
      synchronized (session) {
        dataSource = (main.java.model.DataSource) _jspx_page_context.getAttribute("dataSource", PageContext.SESSION_SCOPE);
        if (dataSource == null){
          dataSource = new main.java.model.DataSource();
          _jspx_page_context.setAttribute("dataSource", dataSource, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <!-- Wyświetlenie nazwy użytkownika. -->\r\n");
      out.write("    Nazwa: ");
      out.print( user.getName() );
      out.write("<br />\r\n");
      out.write(" \r\n");
      out.write("    <!-- Logika sprawdzająca poprawność parametrów logowania. -->\r\n");
      out.write("    ");
 String result = "Dane niepoprawne";
 
    if(dataSource.userExists(user)) {
        result = "Poprawny użytkownik oraz hasło";
		forward=index.jsp;
        }
    
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <!-- Zwrócenie wynikowego stringa \"result\" -->\r\n");
      out.write("    ");
      out.print( result );
      out.write("\r\n");
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
