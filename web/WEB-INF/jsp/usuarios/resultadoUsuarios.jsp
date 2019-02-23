<%-- 
    Document   : resultadoUsuarios
    Created on : 9/02/2019, 05:14:03 PM
    Author     : jackh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Ingresados</h1>
        ${user}<br>
        ${nombre}<br>
        ${apellidos}<br>
        ${pass}<br>
        ${estado}<br>
<!--        ${sexo}<br>
        ${hobbie}<br>-->

       

    </body>
</html>
