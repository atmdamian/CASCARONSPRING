<%-- 
    Document   : catalogoEquipos
    Created on : 8/02/2019, 01:18:43 PM
    Author     : damian.atanacio
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
        <h1>${titulo}</h1>
        <sf:form>
            <div>
                <sf:label path="no_serie" >NO. Serie:</sf:label>
                <sf:input path="no_serie"/>
            </div>
            <div>

                <sf:label path="marca">Marca:</sf:label>
                <sf:select path="marca">
                    <sf:option value="NADA" label="Selecciona Marca" />
                    <sf:options items="${listaMarcas}" />
                </sf:select>                   
            </div>
            <div>
                <sf:label path="modelo">Modelo:</sf:label>
                <sf:input path="modelo" />
            </div>
            <div>
                <sf:label path="so">Sistema Operativo:</sf:label>
                <sf:select path="so" >
                    <sf:option value="NADA" label="Selecciona S.O"/>
                    <sf:options items="${listaSO}" />
                </sf:select>    
            </div>
                <div>
                <sf:label path="hd">Capacidad HD:</sf:label>
                <sf:radiobuttons path="hd" items="${capacidadHD}"/>
                </div>
                <div>
                    <sf:label path="ram">Velocidad Ram</sf:label>
                    <sf:radiobuttons path="ram" items="${velocidadRam}" />
                </div>
                <div>
                    <sf:label path="ip">Direccion IP:</sf:label>
                    <sf:input path="ip" />
                </div>
                <div>
                    <div>
                    <sf:label path="estado">Estado Equipo:</sf:label>
                    </div>
                    <sf:textarea path="estado" rows="5" cols="30" />                                 
                </div>
                <div>
                    
                    <input type="submit" value="ENVIAR"/>
                </div>
                <div>
                    ${no_serie}<br>
                    ${marca}<br>
                    ${modelo}<br>
                    ${so}<br>
                    ${hd}<br>
                    ${ram}<br>
                    ${ip}<br>
                    ${estado}<br>
                </div>
        </sf:form>
    </body>
</html>
