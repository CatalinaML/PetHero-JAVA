
package Models;

import java.util.Date;

public class Duenio extends User {

    public Duenio() {
    }

    public Duenio(int idUser) {
        super(idUser);
    }

    public Duenio(String userName, String password, String nombre, String apellido, String nacimiento, String email, String ciudad) {
        super(userName, password, nombre, apellido, nacimiento, email, ciudad);
    }

    public Duenio(int idUser, String userName, String password, String nombre, String apellido, String nacimiento, String email, String ciudad) {
        super(idUser, userName, password, nombre, apellido, nacimiento, email, ciudad);
    }
    
}
