package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.MediaDAO;
import Classes.Media;
import java.util.ArrayList;
import Dao.AlunoDAO;
import Classes.Aluno;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    String status = request.getParameter("status");

    if (status != null) {
        if (status.equals("OK")) {

            out.println("Registro inserido com sucesso");
        } else {
            out.println("ERRO: " + status);
        }
    }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form name=\"form1\" action=\"gravar.jsp?\" method=\"post\">\n");
      out.write("                <table border=\"2\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan =\"2\" align=\"center\">CADASTRO DE PROVAS</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>RGM:   </td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"rgm\">\n");
      out.write("                                ");
                               
                                    ArrayList<Aluno> lista = new AlunoDAO().getAlunos();

                                    for (int i = 0; i < lista.size(); i++) {
                                        
                                        out.println("<option value=" + lista.get(i).getRgm() + ">");
                                        out.println("[" + lista.get(i).getRgm() + "] " + lista.get(i).getNome());
                                        out.println("</option>");
                                    }


                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Disciplina:   </td>\n");
      out.write("                        <td><input name=\"disciplina\" type=\"text\">\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Médias:   </td>\n");
      out.write("                        <td><input name=\"media\" type=\"text\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Gravar\"></td>                  \n");
      out.write("                    </tr>\n");
      out.write("                    </tr>\n");
      out.write("                </table>            \n");
      out.write("            </form>  \n");
      out.write("            <br><br>                \n");
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr><td><b>RGM</b></td><td><b>Disciplina</b></td><td><b>Média</b></td></tr>\n");
      out.write("                ");
               
                    ArrayList<Media> media = new MediaDAO().getMedia();

                    for (int i = 0; i < media.size(); i++) {

                        out.println("<tr>");
                        out.println("<td>" + media.get(i).getRgm() + "</td>");
                        out.println("<td>" + media.get(i).getDisciplina() + "</td>");
                        out.println("<td colspan='3'>" + media.get(i).getMedia() + "</td>");
                        out.println("</tr>");

                    }


                
      out.write("\n");
      out.write("\n");
      out.write("            </table> \n");
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
