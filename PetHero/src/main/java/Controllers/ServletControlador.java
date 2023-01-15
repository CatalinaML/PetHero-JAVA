package Controllers;

import DAO.DuenioDAO;
import Models.Duenio;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.util.Date;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("redireccion");
        resp.sendRedirect("inicio.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "login":

                    break;
                case "registrarDuenio":
                    this.registrarDuenio(req, resp);
                    break;
                default:
                    resp.sendRedirect("inicio.jsp");
            }
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) {

    }

    private void registrarDuenio(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String username = req.getParameter("username");
        String pass = req.getParameter("password");
        String email = req.getParameter("email");
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String nacimiento = req.getParameter("fechaNacimiento");
        String ciudad = req.getParameter("ciudad");

        Duenio duenio = new Duenio(username, pass, nombre, apellido, nacimiento, email, ciudad);

        //agregar a bdd
        DuenioDAO duenioDao = new DuenioDAO();
        int registrosInsertados = duenioDao.insertar(duenio);
        System.out.println("registrosInsertados = " + registrosInsertados);

        if (registrosInsertados == 1) {
            //redirige a la pagina principal
            HttpSession sesion = req.getSession();
            sesion.setAttribute("idSesion", duenio.getIdUser());
            resp.sendRedirect("paginaPrincipalDuenio.jsp");
        } else if (registrosInsertados == 0) {//esta parte es la que todavia no me sale
            //alert y redirigir a la misma página
            req.setAttribute("alerta", "Usuario invalido");
            System.out.println((String) req.getAttribute("alerta"));
            req.getRequestDispatcher("inicio.jsp").forward(req, resp);
        }
    }

}
