
package Models;

import java.util.Date;

public class User {
    //Atributos
    private int idUser;
    private String userName;
    private String password;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String email;
    private String ciudad;
    
    //Constructores

    public User() {
    }
    
    public User(int idUser){
        this.idUser = idUser;
    }

    public User(String userName, String password, String nombre, String apellido, Date nacimiento, String email, String ciudad) {
        this.userName = userName;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.email = email;
        this.ciudad = ciudad;
    }   

    public User(int idUser, String userName, String password, String nombre, String apellido, Date nacimiento, String email, String ciudad) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.email = email;
        this.ciudad = ciudad;
    }
    
    //Getters

    public int getIdUser() {
        return this.idUser;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Date getNacimiento() {
        return this.nacimiento;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCiudad() {
        return this.ciudad;
    }
    
    //Setters

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //toString

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", email=" + email + ", ciudad=" + ciudad + '}';
    }
    
}
