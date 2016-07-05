<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 
    Document   : response
    Created on : 23-Apr-2015, 01:26:35
    Author     : Elijah
--%>
<sql:query var="dregionQuerry" dataSource="jdbc/FinalYearProject">
    SELECT * FROM district, regions WHERE regions.region_no = district.regions_region_no AND district.district_name = ? <sql:param value="${param.districtlist}"/>
</sql:query>
    <c:set var="districtdetsils" value="${dregionQuerry.rows[0]}"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>${districtdetails.name}</title>
    </head>
    <body>
        <table border="0">
    <thead>
        <tr>
            <th colspan="2">${districtdetails.name}</th><th colspan="2">${districtdetails.name}</th>
        </tr>
    </thead>
    <tbody>
        <tr><c:forEach var="row" items="${dregionQuerry.rows}">
            <td value="${row.district_no}"><strong>                  
                   ${row.district_name}
                    </strong></td>
            <td> ${row.district_name}</td>
            <td> ${row.regions_region_no}</td>
             </c:forEach>
        </tr>
        
    </tbody>
</table>
    </body>
</html>
