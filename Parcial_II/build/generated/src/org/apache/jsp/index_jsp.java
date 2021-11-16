package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Nomina;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Lato:wght@300;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("\n");
      out.write("        <title>NOMINA</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"Registrar\">\n");
      out.write("                <h1>NOMINA:</h1><br>\n");
      out.write("                <form action=\"Captura\" id=\"formulario\" method=\"POST\">\n");
      out.write("                    <!-- ID EMPLEADO -->\n");
      out.write("                    <label class=\"label\" name=\"Id_empleadol\">Id Empleado:</label>\n");
      out.write("                    <input class=\"input\" type=\"number\" name=\"id_empleado\"><br>\n");
      out.write("                    <!-- NOMBRE -->\n");
      out.write("                    <label class=\"label\" name=\"nombrel\">Nombre:</label>\n");
      out.write("                    <input class=\"input\" type=\"text\" name=\"nombre\" id=\"nombre\"><br>\n");
      out.write("                    <!-- CEDULA -->\n");
      out.write("                    <label class=\"label\" name=\"cedula\">Cedula:</label>\n");
      out.write("                    <input class=\"input\" type=\"text\" name=\"cedula\" id=\"cedula\"><br>\n");
      out.write("                    <!-- SALARIO -->\n");
      out.write("                    <label class=\"label\" name=\"salario\">Salario</label>\n");
      out.write("                    <select class=\"input\" name=\"salarios\" id=\"salarios\">\n");
      out.write("                        <option selected value=\"null\"></option>\n");
      out.write("                        <option name=\"salarios\" value=\"908526\">$ 908.526</option>\n");
      out.write("                        <option name=\"salarios\" value=\"1000000\">$ 1.000.000</option>\n");
      out.write("                        <option name=\"salarios\" value=\"1500000\">$ 1.500.000</option>\n");
      out.write("                        <option name=\"salarios\" value=\"2000000\">$ 2.000.000</option>\n");
      out.write("                        <option name=\"salarios\" value=\"2500000\">$ 2.500.000</option>\n");
      out.write("                        <option name=\"salarios\" value=\"3000000\">$ 3.000.000</option> \n");
      out.write("                    </select><br>\n");
      out.write("                    <!-- DIAS TRABAJADOS -->\n");
      out.write("                    <label class=\"label\" name=\"diasl\">Ingrese el número de dias trabajados:</label>\n");
      out.write("                    <input class=\"input\" type=\"number\" name=\"dias\" id=\"dias\"><br><br>\n");
      out.write("                    <!-- Registrar y Calcular -->\n");
      out.write("                    <button type=\"submit\" id=\"boton\">Registar</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div><br>\n");
      out.write("\n");
      out.write("            <div class=\"Registros\">\n");
      out.write("                <table class=\"tabla\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID EMPLEADO</th>\n");
      out.write("                        <th>NOMBRE</th>\n");
      out.write("                        <th>SALARIO</th>\n");
      out.write("                        <th>DIAS TRABAJADOS</th>\n");
      out.write("                        <th>AUXILIO DE TRANSPORTE</th>\n");
      out.write("                        <th>DESCUENTO SALUD</th>\n");
      out.write("                        <th>DESCUENTO PENSION</th>\n");
      out.write("                        <th>SALARIO NETO</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>01</td>\n");
      out.write("                        <td>Jhonatan</td>\n");
      out.write("                        <td>$ 1.000.000</td>\n");
      out.write("                        <td>30</td>\n");
      out.write("                        <td>$ 0</td>\n");
      out.write("                        <td>$ 10000</td>\n");
      out.write("                        <td>$ 10000</td>\n");
      out.write("                        <td>$ 990000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                       Nomina obj=new Nomina(); 
                       obj=(Nomina)request.getAttribute("respuesta");
                       if(obj!=null){ 
      out.write("\n");
      out.write("                       \n");
      out.write("                         ");
  out.print(obj.getId()); 
      out.write("\n");
      out.write("                         \n");
      out.write("                         ");
  out.print(obj.getNombre()); 
      out.write("\n");
      out.write("                         ");
  out.print(obj.getSalario()); 
      out.write("\n");
      out.write("                         ");
  out.print(obj.getDias()); 
      out.write("\n");
      out.write("                         ");
  out.print(obj.getAuxilioTransporte()); 
      out.write("\n");
      out.write("                         ");
  out.print(obj.getSalud()); 
      out.write("\n");
      out.write("                         ");
 out.print(obj.getPension()); 
      out.write("\n");
      out.write("                         ");
 out.print(obj.getTotalDev()); 
      out.write("\n");
      out.write("                           \n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
