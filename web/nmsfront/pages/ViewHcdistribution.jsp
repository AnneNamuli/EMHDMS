<%@page import="com.nms.backend.model.HealthFac"%>
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

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
$(function () {
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Monthly Average Rainfall'
        },
        subtitle: {
            text: 'Source: WorldClimate.com'
        },
        xAxis: {
            categories: [
                'Jan',
                'Feb',
                'Mar',
                'Apr',
                'May',
                'Jun',
                'Jul',
                'Aug',
                'Sep',
                'Oct',
                'Nov',
                'Dec'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Rainfall (mm)'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: 'Tokyo',
            data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]

        }, {
            name: 'New York',
            data: [83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3]

        }, {
            name: 'London',
            data: [48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2]

        }, {
            name: 'Berlin',
            data: [42.4, 33.2, 34.5, 39.7, 52.6, 75.5, 57.4, 60.4, 47.6, 39.1, 46.8, 51.1]

        }]
    });
});
		</script>
    
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
                            <a href="#"><i class="fa fa-wrench fa-fw"></i>View Hc consumption<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                
                                <li>
                                    <select class="form-control" name="healthfac">
                                                 <%   // LogicController logiccont = new LogicController();for non ststic methods 
                                             
                       
                        List <HealthFac> Hflist= LogicController.getHealthfac();                         
                        int sizee = Hflist.size();                    
                      
                                 for(int ii = 0; ii< sizee; ii++) {
                                 HealthFac objj=Hflist.get(ii);
                                   
                                   %>
                                   <option value="<%=objj.getNo()%>">
                                                    
                                                    <%=objj.getHfName()%> 
                                                
                                                </option>
                                                 <% } %>
                                                
                                            </select>
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
                    <h1 class="page-header">Health Centres Distribution</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Kampala
                        </div>
                        <!-- /.panel-heading -->
                        
                        <script src="../Highcharts-4.1/js/highcharts.js"></script>
                        <script src="../Highcharts-4.1/js/modules/exporting.js"></script>

        <div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
        
        
        
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <form action="/FinalYearProject/sev/viewcconsumption" >
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        
                                        
                                        <tr>
                                             <!--<th>ID</th>-->
                                            <th> id</th>
                                            
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

                                       
                                         List <Distribution> DrLlist= LogicController.getDistribution();
                                        int size = DrLlist.size();                    

                                                 for(int i = 0; i< size; i++) {
                                                 Distribution obj= DrLlist.get(i);
                                                 
                                                      %>

                                        <tr class="odd gradeX">
                                           
                                            <!--<td><%// =obj.getDistrictno()%></td>-->
                                            
                                             
                                            <td><%=obj.getDisid()%></td>                                

                                            
                                            
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
