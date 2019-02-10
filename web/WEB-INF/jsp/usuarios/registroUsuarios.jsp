<%-- 
    Document   : registroUsuarios
    Created on : 9/02/2019, 02:16:44 PM
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
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <sf:form>
            <div>
                <label>Nombre de usuario:</label>
                <sf:input path="user"/>
            </div>
            <div>
                <label>Contraseña:</label>
                <sf:input type="password" path="pass"/>
            </div>
            <div>
                <label>Nombre Completo:</label>
                <sf:input path="nombre"/>
            </div>
            <div>
                <label>Apellidos:</label>
                <sf:input path="apellidos"/>
            </div>
            <div>
                <label>Estado</label>
                <sf:select path="estado">
                    <sf:option label="Elije" value="NONE"></sf:option>
                    <sf:options items="${estados}"></sf:options>
                </sf:select>
            </div>
<!--            <div>
                <label>Genero</label>
                      <sf:checkboxes items="${sexo}" path="hobbie" ></sf:checkboxes> 
                      
            </div>
            <div>
                <label>Hobbie</label>
                <sf:checkboxes items="${hobbie}" path="hobbie" ></sf:checkboxes>
            </div>-->
            <div>
                <input type="submit" value="Enviar"/>
            </div>
                
        </sf:form>
       
    </body>
</html>
