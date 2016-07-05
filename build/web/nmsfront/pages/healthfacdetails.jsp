<%-- 
    Document   : heath fac details
    Created on : 06-May-2015, 18:26:10
    Author     : Elijah
--%>

<%@page import="com.nms.backend.model.Deliveries"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<%@page import="com.nms.backend.Logic.LogicController"%>
<%@page import="com.nms.backend.model.Messages"%>
    <title>EMHDMS - confirm delivery </title>

    <!-- Bootstrap Core CSS -->
    
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

   <script src="../Highcharts-4.1/js/highcharts.js"></script>
 <script src="../Highcharts-4.1/js/modules/exporting.js"></script>
<!-- <script src="../Highcharts-4.1/api/js/jquery.min.js"></script>-->
 <script src="../Highcharts-4.1/api/js/jquery-ui.min.js"></script>
    
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
                <a class="navbar-brand" href="index.html">Essential Medicines and Health Supplies Distribution Management System</a>
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
                        <li><a href="Message.jsp"><i class="fa fa-gear fa-fw"> Msg to NMS</i> </a>
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
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> View Health Facilities <span class="fa arrow"></span></a>
                            
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
                                    <a href="ConfirmDelivery.jsp">Confirm Delivery</a>
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
                            <a href="ViewMessages.jsp"><i class="fa fa-sitemap fa-fw"></i>  Messages<span class="fa arrow"></span></a>
                            
                           
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-files-o fa-fw"></i> Update Consumption<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="ViewConsumption.jsp">Check Out Consumption</a>
                                </li>
                                <li>
                                    <a href="GetDistribution.jsp">View full Report</a>
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
                    <h1 class="page-header">Health Facility Details</h1>
                </div>
                <script> 
                $(function () {
    $('#container1').highcharts({
        chart: {
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        title: {
            text: 'My custom title'  
        },
        series: [{
            data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]        
        }]
    });
});

$(function () {
    $('#container2').highcharts({
        chart: {
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        title: {
            text: 'My custom title'  
        },
        series: [{
            data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]        
        }]
    });
});

$(function () {
    $('#container3').highcharts({
        chart: {
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        title: {
            text: 'My custom title'  
        },
        series: [{
            data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]        
        }]
    });
});
        </script>
        
        <div class = "row-fluid">
        <div class = "span9">
            <div class = "row-fluid">
                <h3>Test</h3>

                    <ul class="nav nav-tabs">
                        <li class = "active">
                            <a data-toggle = "tab" href = "#one">One</a>
                        </li>
                        <li><a data-toggle = "tab" href = "#two">Two</a></li>
                        <li><a data-toggle = "tab" href = "#three">Three</a></li>
                    </ul>

                    <div class="tab-content">

                        <div class="tab-pane active" id="one" >
                            <h4>One</h4>
                            <div id = "container1" style = "height: 300px;"></div>
                            
                        </div>

                        <div class="tab-pane" id="two" >
                        <h4>Two</h4>
                        <div id = "container2" style = "height: 300px;"></div>
                        
                        </div>

                        <div class="tab-pane" id="three" >
                        <h4>Three</h4>
                        <div id = "container3" style = "height: 300px;"></div>
                        
                        </div>

                    </div> 
            </div>
        </div>
        <div class = "span3">
            <p>Here is the content on my sidebar</p>
        </div>
    </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Our Account 
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                
                                <div class="col-lg-6">
                                    <form role="form" method="POST" action="../../sev/confirmdelivery">
                                        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        
                                        
                                        <tr>
                                             <!--<th>ID</th>-->
                                            <th></th>
                                            <th></th>
                                            
                                            
                                            
                                        </tr>
                                           
                                    </thead>
                                    <tbody>
                <%   // LogicController logiccont = new LogicController();for non ststic methods 
//                                        String css []= {"success","danger","info","warning"};                        

                                       
                                         List <Deliveries> DyLlist= LogicController.getDelivery();
                                        int size = DyLlist.size();                    

                                                 for(int i = 0; i< size; i++) {
                                                 Deliveries obj= DyLlist.get(i);
                                                 
                                                      %>
                                                      <tr><td>Administrtor</td><td>Sekitoleko Thomas</td></tr>                                                      
                                                      <tr><td> Admin contact</td><td>0778567345</td></tr>
                                                      <tr><td> Next Delivery</td> <td><%=obj.getDeliveryexp()%></td></tr>
                                                      <tr><td> Phone Number</td><td><%=obj.getDeliveryphone()%></td></tr>
                                                      <tr><td> Next Delivery</td><td><%=obj.getDeliveryexp()%></td></tr>
                                                      <tr><td> Number Plate</td><td>UAM 6&5G</td></tr>

<!--                                        <tr class="odd gradeX">
                                           
                                            <td><%// =obj.getDistrictno()%></td>
                                            
                                             
                                            <td><%=obj.getDeliveryid()%></td>                                

                                            
                                            <td><%=obj.getDeliveryname()%></td>                                        
                                            
                                            <td><%=obj.getDeliveryphone()%></td>                                          
                                            
                                            
                                            <td><%=obj.getDeliveryexp()%></td>                                            
                                         
                                           
                                                                                       
                                        </tr>-->
                                                                            
                                      
                                         <% } %>
                                      
                                    </tbody>
                                </table>
                                        <div class="col-lg-4">
                    
                    <!-- /.col-lg-4 -->
                </div>
                                        <%
                                        
                                        
                                        %>
                                        
                                        
                                        
                                        
<!--                                        <button type="submit" class="btn btn-default">confirm</button>-->
                                   
                                    </form>

                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
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

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>
</html>

