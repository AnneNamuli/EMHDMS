package org.apache.jsp.nmsfront.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class barcharttest2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\t\t<title>Health Centre consumption</title>\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${demo.css}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("$(function () {\n");
      out.write("    $('#container').highcharts({\n");
      out.write("        title: {\n");
      out.write("            text: 'Health Center Drug Distribution ',\n");
      out.write("            x: -20 //center\n");
      out.write("        },\n");
      out.write("        subtitle: {\n");
      out.write("            text: '',\n");
      out.write("            x: -20\n");
      out.write("        },\n");
      out.write("        xAxis: {\n");
      out.write("            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\n");
      out.write("                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\n");
      out.write("        },\n");
      out.write("        yAxis: {\n");
      out.write("            title: {\n");
      out.write("                text: 'Quantity (cartons)'\n");
      out.write("            },\n");
      out.write("            plotLines: [{\n");
      out.write("                value: 0,\n");
      out.write("                width: 1,\n");
      out.write("                color: '#808080'\n");
      out.write("            }]\n");
      out.write("        },\n");
      out.write("        tooltip: {\n");
      out.write("            valueSuffix: '°C'\n");
      out.write("        },\n");
      out.write("        legend: {\n");
      out.write("            layout: 'vertical',\n");
      out.write("            align: 'right',\n");
      out.write("            verticalAlign: 'middle',\n");
      out.write("            borderWidth: 0\n");
      out.write("        },\n");
      out.write("        series: [{\n");
      out.write("            name: 'Panadol',\n");
      out.write("            data: [16.0, 18.9, 19.5, 24.5, 27.2, 21.5, 28.2, 26.5, 34.3, 57.3, 47.9, 39.6]\n");
      out.write("        }, {\n");
      out.write("            name: 'Ceptrine',\n");
      out.write("            data: [ 19.2, 28.6, 25.7, 24.3, 26.0, 32.0, 34.8, 38.1, 42.1, 44.1, 48.6, 32.5]\n");
      out.write("        }, {\n");
      out.write("            name: 'Test Kits',\n");
      out.write("            data: [10.3, 10.9,17.7, 13.3, 15.0, 18.0, 22.8, 20.1, 21.1, 17.1, 29.6, 34.5]\n");
      out.write("        }, {\n");
      out.write("            name: 'Medical Gloves',\n");
      out.write("            data: [18.6, 23.5, 25.7, 28.3, 25.0, 37.0, 36.8, 48.1, 32.1, 27.1, 32.6, 37.5]\n");
      out.write("        },  {\n");
      out.write("            name: 'Artenum',\n");
      out.write("            data: [18.6, 23.5, 25.7, 28.3, 25.0, 37.0, 36.8, 48.1, 32.1, 27.1, 32.6, 37.5]\n");
      out.write("        },\t{\n");
      out.write("            name: 'Coartem',\n");
      out.write("            data: [15.9, 10.6, 23.5, 28.4, 33.5, 27.0, 28.6, 37.9, 34.3, 39.0, 43.9, 51.0]\n");
      out.write("        }, {\n");
      out.write("            name: 'Magnesium',\n");
      out.write("            data: [13.9, 24.2, 25.7, 28.5, 31.9, 25.2, 27.0, 26.6, 24.2, 20.3, 36.6, 34.8]\n");
      out.write("        }]\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("<script src=\"../../js/highcharts.js\"></script>\n");
      out.write("<script src=\"../../js/modules/exporting.js\"></script>\n");
      out.write("\n");
      out.write("<div id=\"container\" style=\"min-width: 310px; height: 400px; margin: 0 auto\"></div>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
