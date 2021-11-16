
<%@page import="Modelo.Nomina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;900&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="estilos.css">

        <title>NOMINA</title>
    </head>
    <body>

        <div class="container">

            <div class="Registrar">
                <h1>NOMINA:</h1><br>
                <form action="Captura" id="formulario" method="POST">
                    <!-- ID EMPLEADO -->
                    <label class="label" name="Id_empleadol">Id Empleado:</label>
                    <input class="input" type="number" name="id_empleado"><br>
                    <!-- NOMBRE -->
                    <label class="label" name="nombrel">Nombre:</label>
                    <input class="input" type="text" name="nombre" id="nombre"><br>
                    <!-- CEDULA -->
                    <label class="label" name="cedula">Cedula:</label>
                    <input class="input" type="text" name="cedula" id="cedula"><br>
                    <!-- SALARIO -->
                    <label class="label" name="salario">Salario</label>
                    <select class="input" name="salarios" id="salarios">
                        <option selected value="null"></option>
                        <option name="salarios" value="908526">$ 908.526</option>
                        <option name="salarios" value="1000000">$ 1.000.000</option>
                        <option name="salarios" value="1500000">$ 1.500.000</option>
                        <option name="salarios" value="2000000">$ 2.000.000</option>
                        <option name="salarios" value="2500000">$ 2.500.000</option>
                        <option name="salarios" value="3000000">$ 3.000.000</option> 
                    </select><br>
                    <!-- DIAS TRABAJADOS -->
                    <label class="label" name="diasl">Ingrese el número de dias trabajados:</label>
                    <input class="input" type="number" name="dias" id="dias"><br><br>
                    <!-- Registrar y Calcular -->
                    <button type="submit" id="boton">Registar</button>

                </form>
            </div><br>

            <div class="Registros">
                <table class="tabla">
                    <tr>
                        <th>ID EMPLEADO</th>
                        <th>NOMBRE</th>
                        <th>SALARIO</th>
                        <th>DIAS TRABAJADOS</th>
                        <th>AUXILIO DE TRANSPORTE</th>
                        <th>DESCUENTO SALUD</th>
                        <th>DESCUENTO PENSION</th>
                        <th>SALARIO NETO</th>
                    </tr>
                    <tr>
                        <%
                       Nomina obj=new Nomina(); 
                       obj=(Nomina)request.getAttribute("respuesta");
                       if(obj!=null){ %>
                        <td><% out.print(obj.getId()); %></td>
                        <td><% out.print(obj.getNombre()); %></td>
                        <td><% out.print("$ "+obj.getSalario()); %></td>
                        <td><% out.print(obj.getDias()); %></td>
                        <td><% out.print("$ "+obj.getAuxilioTransporte()); %></td>
                        <td><% out.print("$ "+obj.getSalud()); %></td>
                        <td><% out.print("$ "+obj.getPension()); %></td>
                        <td><% out.print("$ "+obj.getTotalDev()); %></td>
                        <%}%>
                    </tr>
                </table>
            </div>

        </div>


    </body>
</html>
