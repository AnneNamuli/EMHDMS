package org.apache.jsp.nmsfront.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.nms.backend.model.District;
import com.nms.backend.model.Region;
import com.nms.backend.model.Zones;
import com.nms.backend.model.Distribution;
import java.util.ArrayList;
import java.util.List;
import com.nms.backend.Logic.LogicController;

public final class Stockout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--    Document   : GetDrugs\n");
      out.write("    Created on : 28-Apr-2015, 11:08:30\n");
      out.write("    Author     : Elijah-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<!--        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">-->\n");
      out.write("        <title>NMS - Distribution</title>\n");
      out.write("  \n");
      out.write("  <link href=\"../bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"../bower_components/metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- DataTables CSS -->\n");
      out.write("    <link href=\"../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- DataTables Responsive CSS -->\n");
      out.write("    <link href=\"../bower_components/datatables-responsive/css/dataTables.responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"../dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"../bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Essential Medicines and Health Supplies Distribution Management System</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                \n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("<!--                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-tasks fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-tasks\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 1</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">40% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 2</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">20% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\n");
      out.write("                                            <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 3</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">60% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 4</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">80% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                            <span class=\"sr-only\">80% Complete (danger)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>See All Tasks</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                     /.dropdown-tasks \n");
      out.write("                </li>-->\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("                \n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                        <li><a href=\"AdminMsg.jsp\"><i class=\"fa fa-user fa-fw\"></i> Admin msg</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"Message.jsp\"><i class=\"fa fa-gear fa-fw\"> Msg to NMS</i> </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"../../index.jsp\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-user -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("            </ul>\n");
      out.write("            <!-- /.navbar-top-links -->\n");
      out.write("\n");
      out.write("            <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"GetDistribution.jsp\"><i class=\"fa fa-dashboard fa-fw\"></i> Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> View Health Facilities <span class=\"fa arrow\"></span></a>\n");
      out.write("                            \n");
      out.write("                            <!-- /.nav-second-level -->\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"AddHealthFacility.jsp\"><i class=\"fa fa-table fa-fw\"></i> Add Health Facility</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"AddHealthOfficer.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Add Health Officer</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i>Drugs<span class=\"fa arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"NextDrugDetails.jsp\"> Send next Drug Details</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"ConfirmDelivery.jsp\">Confirms Delivery</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"GetDistribution.jsp\">View Consumption Report</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"NextDrugDetails.jsp\"> Send Delivery details</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"AddDistribution.jsp\">Add distribution</a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                            <!-- /.nav-second-level -->\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ViewMessages.jsp\"><i class=\"fa fa-sitemap fa-fw\"></i>  Messages<span class=\"fa arrow\"></span></a>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-files-o fa-fw\"></i> Update Consumption<span class=\"fa arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"ViewConsumption.jsp\">Check Out Consumption</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"GetDistribution.jsp\">View full Report</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <!-- /.nav-second-level -->\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.sidebar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-static-side -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Distribution</h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Current Distribution in the Country\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-heading -->\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"dataTable_wrapper\">\n");
      out.write("                                <form action=\"/FinalYearProject/sev/getallstockout\" >\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                             <!--<th>ID</th>-->\n");
      out.write("                                            <th> id</th>\n");
      out.write("                                            <th>Recieved</th>\n");
      out.write("                                            <th>Stock Type</th>\n");
      out.write("                                            \n");
      out.write("                                            <th>Time</th>\n");
      out.write("                                            <th>Health Facility</th>\n");
      out.write("                                            <th>Panadol</th>\n");
      out.write("                                            <th>Ceptrine</th>\n");
      out.write("                                            <th>Testkits</th>\n");
      out.write("                                            <th>Medical Gloves</th>\n");
      out.write("                                            <th>Artenum</th>                                           \n");
      out.write("                                            <th>Coartem</th>\n");
      out.write("                                            <th>Cetamol</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                           \n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                ");
   // LogicController logiccont = new LogicController();for non ststic methods 
//                                        String css []= {"success","danger","info","warning"};                        

                                       
                                         List <Distribution> DrLlist= LogicController.getallstockout();
                                        int size = DrLlist.size();                    

                                                 for(int i = 0; i< size; i++) {
                                                 Distribution obj= DrLlist.get(i);
                                                 
                                                      
      out.write("\n");
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                           \n");
      out.write("                                            <!--<td>");
// =obj.getDistrictno()
      out.write("</td>-->\n");
      out.write("                                            \n");
      out.write("                                             \n");
      out.write("                                            <td>");
      out.print(obj.getDisid());
      out.write("</td>                                \n");
      out.write("\n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(obj.getRecieved());
      out.write("</td>                                        \n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(obj.getStockin());
      out.write("</td>                                          \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(obj.getTime());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(obj.getHno());
      out.write("</td>                                        \n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(obj.getPanadol());
      out.write("</td>                                          \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(obj.getCeptrine());
      out.write("</td> \n");
      out.write("                                            <td>");
      out.print(obj.getTestkits());
      out.write("</td> \n");
      out.write("                                         \n");
      out.write("                                            <td>");
      out.print(obj.getMedicalgloves());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(obj.getCoartem());
      out.write("</td>                                          \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(obj.getArtenum());
      out.write("</td>                                            \n");
      out.write("                                         \n");
      out.write("                                            <td>");
      out.print(obj.getCetamol());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                                                            \n");
      out.write("                                      \n");
      out.write("                                         ");
 } 
      out.write("\n");
      out.write("                                      \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.table-responsive -->\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.panel -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            .\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.panel -->\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- /.row -->\n");
      out.write("           \n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"../bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"../bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"../bower_components/metisMenu/dist/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- DataTables JavaScript -->\n");
      out.write("    <script src=\"../bower_components/DataTables/media/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"../dist/js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("    <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('#dataTables-example').DataTable({\n");
      out.write("                responsive: true\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    </script>\n");
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
