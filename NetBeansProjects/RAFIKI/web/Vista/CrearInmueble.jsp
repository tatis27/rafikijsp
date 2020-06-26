<%-- 
    Document   : CrearInmueble
    Created on : 15-jun-2020, 0:07:54
    Author     : tatianagomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/CrearInmueble.css">
    <title>CrearInmueble</title>
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
                        <li><a href="Ingreso.html">tgomez88</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="contenedorimagen">
        <div class="imagen" style="position: absolute;">
                <div class="formulario" style="position: relative;">
                        <form action="#">
                                <h2>Crear Inmueble</h2>
                                <hr>
                                <br>
                                Nombre:<input type="text" name="" placeholder="Nombre" required size="40">
                                <br>
                                Dirección: 
                                <input colspan="3" type="text" name="" placeholder="Dirección" required size="38">
                                <div class="text-size">
                                    <label for="Tipo de Alojamiento">Tipo de Alojamiento:</label>
                                    <select name="Tipo" id="Tipo">
                                    <option value="S"> Seleccionar </option>
                                    <option value="C"> Cabaña </option>
                                    <option value="F"> Finca </option>
                                    <option value="Apto"> Apartamento </option>
                                    <option value="CQ"> Casa Quinta </option>
                                    </select>
                                </div>
                                Valor Alojamiento:
                                <input colspan="3" type="text" name="" placeholder="" required size="28">
                                <br>
                                Número de Personas:
                                <input colspan="3" type="text" name="" placeholder="" required size="23">
                                <br>
                                Número de Baños:
                                <input colspan="3" type="text" name="" placeholder="" required size="27">
                                <br>
                                Número de Habitaciones:
                                <input colspan="3" type="text" name="" placeholder="" required size="19">
                                <br>
                                Ubicacion:
                                <input colspan="3" type="text" name="" placeholder="" required size="19">
                                <div class="text-small">
                                    <label for="Cocina">Cocina:</label>
                                    <select name="documento" id="documento">
                                    <option value="S"> Seleccionar </option>
                                    <option value="true">   Si   </option>
                                    <option value="false">   No   </option>
                                    </select>
                                    <br>
                                    <label for="Aire Acondicionado">Aire Acondicionado:</label>
                                    <select name="documento" id="documento">
                                    <option value="S"> Seleccionar </option>
                                    <option value="true">   Si   </option>
                                    <option value="false">   No   </option>
                                    </select>
                                    <br>
                                    <label for="Piscina">Piscina:</label>
                                    <select name="documento" id="documento">
                                    <option value="S"> Seleccionar </option>
                                    <option value="true">   Si   </option>
                                    <option value="false">   No   </option>
                                    </select>
                                </div>
                                Documentos:
                                <input type="file" name="archivo">
                                <br>
                                 <input type="submit" value="Enviar">
                                 <input type="submit" value="Cancelar">
                                <br>
                        </form>
                </div>
        </div>
        
    </div>