<%-- 
    Document   : RegistrarPropietario
    Created on : 15-jun-2020, 0:03:53
    Author     : tatianagomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/RegistrarCliente.css">
    <title>Index</title>
</head>
<body>
    <div class="header">
    <div class="contenedorlogo">    
        <div class="logo"></div>
    </div>
        <div class="navegacion">
            <div>
                <nav>
                    <ul>
                        <li><a href="Index.html">Hospedaje</a></li>
                        <li><a href="#">Ofertas</a></li>
                        <li><a href="#">Experiencias</a></li>
                        <li><a href="#">Servicios Generales</a></li>
                        <li><a href="Registro.html">Más</a></li>
                    </ul>
                </nav>
            </div>
        </div>
        <div class="ingresar">
            <div>
                <nav>
                    <ul>
                        <li><a href="Ingreso.html">ingresar</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="contenedorimagen">
        <div class="imagen" style="position: absolute;">
                <div class="formulario" style="position: relative;">
                        <form action="#">
                                <h2>Propietario</h2>
                                <hr>
                                <br>
                                Nombre:<input type="text" name="" placeholder="Nombre" required size="13">
                                Apellidos: <input type="text" name="" placeholder="Apellidos" required size="12">
                                <br>
                                Correo: 
                                <input colspan="3" type="text" name="" placeholder="Correo" required size="40">
                                <br>
                                Cedula:
                                <input colspan="3" type="text" name="" placeholder="" required size="40">
                                <br>
                                <label for="Tipodocumento">Tipo de documento:</label>
                                <select name="documento" id="documento">
                                <option value="CC">   Cedula de Ciudadania   </option>
                                <option value="TI">   Tarjeta de Identidad   </option>
                                <option value="CE">   Cedula de Extrangeria  </option>
                                </select>
                                <br>
                                Password: <input type="password" name="password" value="password" required size="37">
                                <br>
                                 <input type="submit" value="Enviar">
                                 <input type="submit" value="Cancelar">
                                <br>
                        </form>
                </div>
        </div>
        
    </div>

