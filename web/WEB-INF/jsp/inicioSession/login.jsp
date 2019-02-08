<%-- 
    Document   : login
    Created on : 7/02/2019, 09:15:33 PM
    Author     : DeveloperSr
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
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
        <sf:form>
            Usuario:
            <div><sf:input path="nombre_usuario"/> </div>
            Contraseña:
            <div><sf:input type="password" path="contraseña"/> </div>
            <div><input type="submit" value="Entrar" />   </div>
        </sf:form>
    </body>
</html>
