
<div class="modal fade" id="registrarDuenio">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Registrar Dueño</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=registrarDuenio" 
                  method="POST" class="was-validated">
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
                </div>
                <div class="modal-footer">
                    <button class="btn btn-warning" type="submit">Registrar</button>
                </div>
            </form>
        </div>
    </div>
</div>
