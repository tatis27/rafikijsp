<%-- 
    Document   : RegistrarCliente
    Created on : 14-jun-2020, 23:58:08
    Author     : tatianagomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--importacion del framework -->
    <link rel="stylesheet" href="css/estandar.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="javascript/bootstrap.js"></script>
    <!--importacion del framework -->

    <title>Index</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light fondo-verde">
        <a class="navbar-brand" href="#">
            <div class="contenedorlogo">    
                <img class="logo" src="imagen/logo-2.png" alt="">
            </div>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Hospedaje <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Ofertas</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Experiencias</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" onclick="mostrarMensaje();">Mostrar mensaje JS </a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Menu con JS
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Preguntas frecuentes</a>
                <a class="dropdown-item" href="#">Contactenos</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Otros servicios</a>
              </div>
            </li>
        
            
          </ul>
          <form class="form-inline my-2 my-lg-0">
             <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Login</button>
          </form>
        </div>
      </nav>

    </nav>

    <!-- JAVASCRIPT PARA MOSTRAR MENSAJE  -->
    <script>
        function mostrarMensaje(){
            console.log('mostrar mensaje');
            $('#mensajeCovid').show(); 
        }
        function olcularMensaje(){
            console.log('Cerrar mensaje');
            $('#mensajeCovid').hide();
        }
    </script>
    <!-- MENSAJE INFORMATIVO DEL COVID :  -->
    <div id="mensajeCovid" class="alert alert-warning alert-dismissible fade show" role="alert">
        <h4 class="alert-heading">Covid-19 !</h4>
          <!-- JAVASCRIPT PARA OCULTAR MENSAJE  -->
        <button type="button" class="close" onclick="olcularMensaje();">
            <span aria-hidden="true">&times;</span>
        </button>

        <p>Por la contingencia sanitaria estaremos prestando el servicio en una ocupación máxima del 50% de nuestos 
            inmuebles.</p>
        <hr>
        <p class="mb-0">Recuerde tomar las medidas necesarias de bioseguridad al momento del viaje.</p>
    </div>

    <div class="contenedorimagen">
        <div class="imagen" style="position: absolute;">
                <div class="formulario" style="position: relative;">
                        <form action="#" class="row">
                            <div class="col-12	col-sm-12	col-md-12	col-lg-12	col-xl-12 d-flex justify-content-center">
                                <h2>Registro de Usuario</h2>
                            </div>
                                <hr>
                            <div class="col-12	col-sm-12	col-md-12	col-lg-12	col-xl-12 margin-bottom-15">
                                <div class="row">
                                    <div class="col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3">
                                        Nombre:
                                    </div>
                                    <div class="col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 form-group">
                                        <input type="text" class=" form-control" name="" placeholder="Nombre" required size="11">
                                    </div>
                                    <div class="col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3">
                                        Apellidos:
                                    </div>
                                    <div class="col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 form-group">
                                        <input type="text" class="form-control" name="" placeholder="Apellidos" required size="11">
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 margin-bottom-15">
                                Correo: 
                            </div>
                            <div class="col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 margin-bottom-15 form-group">
                                <input colspan="3" type="text" class="form-control" name="" placeholder="Correo" required size="40">
                                <small class="form-text text-muted">Recuerda colocar un correo valido</small>
                            </div>
                            <div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 margin-bottom-15">
                                Cedula:
                            </div>
                            <div class="col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 margin-bottom-15 form-group">
                                <input colspan="3" type="text" class="form-control" name="" placeholder="" required size="40">
                            </div>
                            <div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 margin-bottom-15">
                                <label for="Tipodocumento">Tipo de documento:</label>
                            </div>
                            <div class="col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 margin-bottom-15 form-group">
                                <select class="form-control" name="documento" id="documento">
                                    <option value="CC">   Cedula de Ciudadania   </option>
                                    <option value="TI">   Tarjeta de Identidad   </option>
                                    <option value="CE">   Cedula de Extrangeria  </option>
                                </select>
                            </div>
                            <div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 margin-bottom-15">
                                Password:
                            </div>
                            <div class="col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 margin-bottom-15 form-group">
                                <input type="password" class="form-control" name="password" value="password" required size="37">
                            </div>
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 d-flex justify-content-end">
                                <button class="btn btn-secondary">Cancelar</button>
                            </div>
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 d-flex justify-content-start">
                                <button class="btn btn-primary">Enviar</button>
                            </div>
                            
                    </form>
            </div>
    </div>
    
</div>
                    

                                
                         
                                
                              
                                