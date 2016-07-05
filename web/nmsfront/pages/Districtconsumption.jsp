<!DOCTYPE HTML>

<%@page import="com.nms.backend.model.District"%>
<%@page import="com.nms.backend.model.Region"%>
<%@page import="com.nms.backend.model.Zones"%>
<%@page import="com.nms.backend.model.Distribution"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nms.backend.Logic.LogicController"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>District Consumption</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
$(function () {
    $('#container').highcharts({
        chart: {
            type: 'bar'
        },
        title: {
            text: 'Drug distribution by Region'
        },
        subtitle: {
            text: 'Broken down into Health centers'
        },
        xAxis: {
            categories: ['Eastern', 'Northern', 'Central', 'Southern', 'Western'],
            title: {
                text: null
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Quantity',
                align: 'high'
            },
            labels: {
                overflow: 'justify'
            }
        },
        tooltip: {
            valueSuffix: ' thousands'
        },
        plotOptions: {
            bar: {
                dataLabels: {
                    enabled: true
                }
            }
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'top',
            x: -40,
            y: 100,
            floating: true,
            borderWidth: 1,
            backgroundColor: ((Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'),
            shadow: true
        },
        credits: {
            enabled: false
        },
        series: [{
            name: 'Health Center 3',
            data: [50, 31, 300, 100, 2]
        }, {
            name: 'Health Center 2',
            data: [133, 156, 947, 408, 6]
        }, {
            name: 'Health Center 1',
            data: [450, 420, 2025, 335, 22]
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
 <script src="../Highcharts-4.1/js/highcharts.js"></script>
 <script src="../Highcharts-4.1/js/modules/exporting.js"></script>
<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">District Distribution</h1>
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
<div id="container" style="min-width: 310px; max-width: 800px; height: 400px; margin: 0 auto"></div>
<div class="panel-body">
                            <div class="dataTable_wrapper">
                                <form action="/FinalYearProject/sev/getdistrictDistribution" >
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        
                                        
                                        <tr>
                                             <!--<th>ID</th>-->
                                            <th> id</th>
                                            <th>Recieved</th>
                                            <th>Stock Type</th>
                                            
                                            <th>Time</th>
                                            <th>Health Facility</th>
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

                                       
                                         List <Distribution> DrLlist= LogicController.getdistrictDistribution();
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
                                            <td><%=obj.getHno()%></td>                                        
                                            
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
