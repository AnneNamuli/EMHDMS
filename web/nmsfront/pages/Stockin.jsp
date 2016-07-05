<!--    Document   : GetDrugs
    Created on : 28-Apr-2015, 11:08:30
    Author     : Elijah-->

<%@page import="com.nms.backend.model.District"%>
<%@page import="com.nms.backend.model.Region"%>
<%@page import="com.nms.backend.model.Zones"%>
<%@page import="com.nms.backend.model.Distribution"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nms.backend.Logic.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

<!--        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <title>NMS - Distribution</title>
  
    <link href="../bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="../bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    
    
    </head>
    <body>
         <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="">Essential Medicines and Health Supplies Distribution Management System</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                
                <!-- /.dropdown -->
<!--                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 1</strong>
                                        <span class="pull-right text-muted">40% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 2</strong>
                                        <span class="pull-right text-muted">20% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 3</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 4</strong>
                                        <span class="pull-right text-muted">80% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                     /.dropdown-tasks 
                </li>-->
                <!-- /.dropdown -->
                
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="AdminMsg.jsp"><i class="fa fa-user fa-fw"></i> Admin msg</a>
                        </li>
                        <li><a href=""><i class="fa fa-gear fa-fw"> </i> </a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="../../index.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        
                        <li>
                            <a href="GetDistribution.jsp"><i class="fa fa-dashboard fa-fw"></i> Home</a>
                        </li>
                        <li>
                            <a href="ViewMessages.jsp"><i class="fa fa-bar-chart-o fa-fw"></i> View Messages <span class="fa arrow"></span></a>
                            
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="AddHealthFacility.jsp"><i class="fa fa-table fa-fw"></i> Add Health Facility</a>
                        </li>
                        <li>
                            <a href="AddHealthOfficer.jsp"><i class="fa fa-edit fa-fw"></i> Add Health Officer</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i>Drugs<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="NextDrugDetails.jsp"> Send next Drug Details</a>
                                </li>
                                <li>
                                    <a href="ConfirmDelivery.jsp">Confirms Delivery</a>
                                </li>
                                <li>
                                    <a href="GetDistribution.jsp">View Consumption Report</a>
                                </li>
                                <li>
                                    <a href="NextDrugDetails.jsp"> Send Delivery details</a>
                                </li>
                                <li>
                                    <a href="AddDistribution.jsp">Add distribution</a>
                                </li>
                                
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="addconsumption.jsp"><i class="fa fa-sitemap fa-fw"></i>  Check Out Drugs<span class="fa arrow"></span></a>
                            
                           
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-files-o fa-fw"></i> Consumption<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="Stockin.jsp">Stock In</a>
                                </li>
                                <li>
                                    <a href="Stockout.jsp">Stock out</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Distribution</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Current Distribution in the Country
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <form action="/FinalYearProject/sev/getallstockin" >
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        
                                        
                                        <tr>
                                             <!--<th>ID</th>-->
                                            <th> id</th>
                                            <th>Recieved</th>
                                            <th>Stock Type</th>
                                            
                                            <th>Time</th>
                                            <th>Health Centre</th>
                                            <th>Panadol</th>
                                            <th>Ceptrine</th>
                                            <th>Testkits</th>
                                            <th>Medical Gloves</th>
                                            <th>Artenum</th>                                           
                                            <th>Coartem</th>
                                            <th>Cetamol</th>
                                        </tr>
                                           
                                    </thead>
                                    <tbody>
                <%   // LogicController logiccont = new LogicController();for non ststic methods 
//                                        String css []= {"success","danger","info","warning"};                        

                                       
                                         List <Distribution> DrLlist= LogicController.getallstockin();
                                        int size = DrLlist.size();                    

                                                 for(int i = 0; i< size; i++) {
                                                 Distribution obj= DrLlist.get(i);
                                                 
                                                      %>

                                        <tr class="odd gradeX">
                                           
                                            <!--<td><%// =obj.getDistrictno()%></td>-->
                                            
                                             
                                            <td><%=obj.getDisid()%></td>                                

                                            
                                            <td><%=obj.getRecieved()%></td>                                        
                                            
                                            <td><%=obj.getStockin()%></td>                                          
                                            
                                            
                                            <td><%=obj.getTime()%></td>
                                            <td><%=obj.getHname()%></td>                                         
                                            
                                            <td><%=obj.getPanadol()%></td>                                          
                                            
                                            
                                            <td><%=obj.getCeptrine()%></td> 
                                            <td><%=obj.getTestkits()%></td> 
                                         
                                            <td><%=obj.getMedicalgloves()%></td>
                                            <td><%=obj.getCoartem()%></td>                                          
                                            
                                            
                                            <td><%=obj.getArtenum()%></td>                                            
                                         
                                            <td><%=obj.getCetamol()%></td>

                                            
                                        </tr>
                                                                            
                                      
                                         <% } %>
                                      
                                    </tbody>
                                </table>
                                </form>
                            </div>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            .
                        </div>
                       
                        
                    </div>
                    <!-- /.panel -->
                </div>
               
            </div>
            
            <!-- /.row -->
           
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="../bower_components/DataTables/media/js/jquery.dataTables.min.js"></script>
    <script src="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>

    </body>
</html>
