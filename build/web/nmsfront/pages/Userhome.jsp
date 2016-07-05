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
  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
$(function () {
    $('#container').highcharts({
        title: {
            text: 'Health Center Drug Distribution ',
            x: -20 //center
        },
        subtitle: {
            text: '',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: 'Quantity (cartons)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '°C'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Panadol',
            data: [20.0, 57.9, 67.5, 24.5, 27.2, 21.5, 28.2, 26.5, 34.3, 57.3, 47.9, 39.6]
        }, {
            name: 'Ceptrine',
            data: [ 19.2, 28.6, 25.7, 24.3, 26.0, 32.0, 34.8, 38.1, 42.1, 44.1, 48.6, 32.5]
        }, {
            name: 'Test Kits',
            data: [10.3, 10.9,17.7, 13.3, 15.0, 18.0, 22.8, 20.1, 21.1, 17.1, 29.6, 34.5]
        }, {
            name: 'Medical Gloves',
            data: [18.6, 23.5, 25.7, 28.3, 25.0, 37.0, 36.8, 48.1, 32.1, 27.1, 32.6, 37.5]
        },  {
            name: 'Artenum',
            data: [18.6, 23.5, 25.7, 28.3, 25.0, 37.0, 36.8, 48.1, 32.1, 27.1, 32.6, 37.5]
        },	{
            name: 'Coartem',
            data: [15.9, 10.6, 23.5, 28.4, 33.5, 27.0, 28.6, 37.9, 34.3, 39.0, 43.9, 51.0]
        }, {
            name: 'Magnesium',
            data: [78.9, 67.2, 90.7, 68.5, 31.9, 25.2, 27.0, 26.6, 24.2, 20.3, 36.6, 34.8]
        }]
    });
});
		</script>
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
                        <li><a href=""><i class="fa fa-user fa-fw"></i> </a>
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
                            <a href="Userhome.jsp"><i class="fa fa-dashboard fa-fw"></i> Home</a>
                        </li>
                        <li>
                            <a href="ViewUsermessages.jsp"><i class="fa fa-bar-chart-o fa-fw"></i> Messages Inbox <span class="fa arrow"></span></a>
                            
                            <!-- /.nav-second-level -->
                        </li>
                        
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i>Drugs<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                
                                <li>
                                    <a href="ConfirmDelivery.jsp">Confirms Delivery</a>
                                </li>
                                <li>
                                    <a href="HealthCenterconsumption.jsp">View Consumption Report</a>
                                </li>
                                
                                
                                
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="Message.jsp"><i class="fa fa-sitemap fa-fw"></i> Send Message<span class="fa arrow"></span></a>
                            
                           
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-files-o fa-fw"></i> Update Consumption<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="addconsumption.jsp">Check Out Consumption</a>
                                </li>
                                <li>
                                    <a href="HealthCenterconsumption.jsp">View full Report</a>
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
<script src="../Highcharts-4.1/js/highcharts.js"></script>
 <script src="../Highcharts-4.1/js/modules/exporting.js"></script>
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
                            Mukono Health Center
                        </div>
                        <!-- /.panel-heading -->
                        <div id="container" style="min-width: 310px; max-width: 1200px; height: 400px; margin: 0 auto"></div>

                        
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <form action="/FinalYearProject/sev/getdistribution" >
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        
                                        
                                        <tr>
                                             <!--<th>ID</th>-->
                                            <th> id</th>
                                            
                                            <th>Panadol</th>
                                            <th>Ceptrine</th>
                                            <th>Testkits</th>
                                            <th>Medical Gloves</th>
                                            <th>Artenum</th>                                           
                                            <th>Coartem</th>
                                            <th>Magnesium</th>
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
<!--    <script src="../bower_components/jquery/dist/jquery.min.js"></script>-->

     Bootstrap Core JavaScript 
    <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

     Metis Menu Plugin JavaScript 
    <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

     DataTables JavaScript 
    <script src="../bower_components/DataTables/media/js/jquery.dataTables.min.js"></script>
    <script src="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

     Custom Theme JavaScript 
    <script src="../dist/js/sb-admin-2.js"></script>

     Page-Level Demo Scripts - Tables - Use for reference 
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>
	</body>
</html>
