<%-- 
    Document   : index
    Created on : 20/06/2024, 12:59:08 p. m.
    Author     : cuerv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% String name = "Federico ";%>
        <%=name %>
        <form action="ServerltPrim" method="post">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input name="name"><td>
                </tr>
                <tr>
                    <td>Apellido</d>
                    <td><input name="namel"></td>
                </tr>
                <tr>
                    <td>Email</d>
                    <td><input name="email"></td>
                </tr>
                <tr>
                    <td>tel</d>
                    <td><input name="tel"></td>
                </tr>
                <tr>
                    <td>Contraseña</d>
                    <td><input type="password" name="pass"></td>
                </tr>
            </table>
            <input type="submit">
        </form>
    </body>
</html>
