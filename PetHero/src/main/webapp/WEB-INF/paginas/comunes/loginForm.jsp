<form action="${pageContext.request.contextPath}/ServletControlador?accion=login"
      method="POST" class="was-validated">

    <section id="details">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            <h4>Inicio de sesión</h4>
                        </div>
                        <div class="card-body">
                            <div class="form-group">
                                <label for="nombre">Nombre de usuario</label>
                                <input type="text" name="nombre" class="form-control" required"/>
                            </div>
                            <div class="form-group">
                                <label for="apellido">Contraseña</label>
                                <input type="password" class="form-control" name="apellido" required/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</form>
      
    <jsp:include page="/WEB-INF/paginas/duenio/registrarDuenio.jsp"/>
    <jsp:include page="/WEB-INF/paginas/guardian/registrarGuardian.jsp"/>
