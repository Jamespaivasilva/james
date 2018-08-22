package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.MediaDAO;
import java.util.ArrayList;
import Classes.Media;

public final class boletim_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String status = request.getParameter("status");

    if (status != null) {
        if (status.equals("OK")) {

            out.println("Logado com sucesso");
        } else {
            out.println("ERRO: " + status);
        }
    }

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
      out.write("        <div style=\"border:1px solid; width:350px; margin-left: 40%;margin-top: 5%\">\n");
      out.write("            <div align=\"center\">BOLETIM DO ALUNO</div>\n");
      out.write("            <div>\n");
      out.write("                <table>\n");
      out.write("\n");
      out.write("                    ");

                        String rgm = (String) session.getAttribute("rgm");
                        ArrayList<Media> media = new MediaDAO().getMediaBoletim(rgm);

                        out.println("<td> Aluno: " + media.get(0).getNome() + "</td>");
                        out.println("<td> Rgm: " + media.get(0).getRgm() + "</td>");
                        out.println("<tr>");
                        out.println("<td>Disciplina</td>");
                        out.println("<td>Média</td>");

                        for (int i = 0; i < media.size(); i++) {
                            out.println("<tr>");
                            out.println("<td>" + media.get(i).getDisciplina() + "</td>");
                            out.println("<td colspan='3'>" + media.get(i).getMedia() + "</td>");
                            out.println("</tr>");

                        }


                    
      out.write("\n");
      out.write("\n");
      out.write("                </table> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
