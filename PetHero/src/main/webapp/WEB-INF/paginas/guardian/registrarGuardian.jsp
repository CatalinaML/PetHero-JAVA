
<div class="modal fade" id="registrarGuardian">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Registrar Guardian</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=registrarDuenio" 
                  method="post" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="username">Nombre de usuario</label>
                        <input type="text" name="username" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Contraseña</label>
                        <input type="password" name="password" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" name="email" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" name="nombre" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="apellido">Apellido</label>
                        <input type="text" name="apellido" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="fechaNacimiento">Fecha de Nacimiento</label>
                        <input type="date" name="fechaNacimiento" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="ciudad">Ciudad</label>
                        <input type="text" name="ciudad" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="tamanio">Tamaño de mascota a cuidar</label>
                        <select class="form-select" aria-label="Default select example">
                            <option selected>Abre este menú select</option>
                            <option value="pequeño">Pequeño</option>
                            <option value="mediano">Mediano</option>
                            <option value="grande">Grande</option>
                        </select>
                        <input type="text" name="tamanio" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Disponibilidad</label>
                        <div class="row">
                            <div class="col">
                                <input type="date" name="inicDisp" class="form-control" required>
                            </div>
                            <div class="col">
                                <input type="date" name="finDisp" class="form-control" required>
                            </div>
                        </div>                       
                    </div>
                    <div class="form-group">
                        <label>Rango horario</label>
                        <div class="row">
                            <div class="col">
                                <input type="time" name="inicioHorario" class="form-control" required>
                            </div>
                            <div class="col">
                                <input type="time" name="finHorario" class="form-control" required>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-warning" type="submit">Registrar</button>
                </div>
            </form>
        </div>
    </div>
</div>