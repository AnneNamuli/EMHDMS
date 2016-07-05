 
<!--    Document   : Getregions
    Created on : 28-Apr-2015, 11:08:30
    Author     : Elijah-->

<%@page import="com.nms.backend.model.Region"%>
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
        <title>NMS - Regions</title>
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

    
    
    </head>
    <body>
        
        <form action="/FinalYearProject/sev/getregion">
            <table border="1">
                <thead>
                    <tr>
                        
                        <th>Region no.</th>
                        <th>Region name</th>
                        <th>Region no.</th>
                        <th>Region name</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <%   // LogicController logiccont = new LogicController();for non ststic methods 
                         String css []= {"success","danger","info","warning"};                        
                       
                        List <Region> RLlist= LogicController.getRegion();                         
                        int size = RLlist.size();                    
                      
                                 for(int i = 0; i< size; i++) {
                                 Region obj= RLlist.get(i);
                                   
                                   %>
                    <tr>
                        <td><%=obj.getRno()%></td>
                        <td><%=obj.getRname()%></td>
                        <td><%=obj.getRno()%></td>
                        <td><%=obj.getRname()%></td>
                    </tr>
                    
                    <% } %>
                </tbody>
            </table>

            
        </form>
    </body>
</html>
