<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 23-Apr-2015, 00:15:43
    Author     : Elijah
--%>
<sql:query var="districts" dataSource="jdbc/FinalYearProject">
    SELECT district_name FROM district
</sql:query>
    

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title> NMS System Online</title>
    </head>
    <body>
        <h1>Your finally Here</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>welcome to NMS system Online</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Fill in the form to get started with filling in the regions</td>
                </tr>
                <tr>
                    <td>
                        <form action="response.jsp">
                             <strong>Select health facility</strong>
                             <select name="districtlist">
                                 <c:forEach var="row" items="${districts.rowsByIndex}">
                                     <c:forEach var="column" items="${row}">
                                         <option value="<c:out value="${column}"/>"> <c:out value="${column}"/>  </option>
                                 
                                    </c:forEach>
                                 </c:forEach>
                             </select>
                             <input type="submit" value="submit" name="submit" />
                        </form> 
                       
                    </td>
                </tr>
            </tbody>
        </table>

        
    </body>
</html>
