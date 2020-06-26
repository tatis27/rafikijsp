<%-- 
    Document   : Ingreso
    Created on : 11-jun-2020, 23:32:39
    Author     : tatianagomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/IngresarCuenta.css">
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
                        <li><a href="Ingreso.html">Ingresar</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="contenedorimagen">
        <div class="imagen" style="position: absolute;">
                <div class="formulario" style="position: relative;">
                        <form action="Final.html">
                                <h2>Ingreso</h2>
                                <hr>
                                <br>
                                Correo: <input type="text" name="" placeholder="Correo" required size="40">
                                <br>
                                Asunto: <input type="password" name="" placeholder="" required size="40">
                                <br>
                                <a href="Contraseña.html">Olvidó su Contraseña</a>
                                <br>
                                 <input type="submit" value="Enviar">
                                 <input type="submit" value="Cancelar">
                                <br>
                        </form>
                </div>
        </div>
        
    </div>
