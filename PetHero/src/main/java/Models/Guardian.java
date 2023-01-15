
package Models;

import java.util.Date;

public class Guardian extends User {
    //Atributos
    private double remuneracion;
    private String tamanioCuidar;
    private Date inicioDisponibilidad;
    private Date finDisponibilidad;
    private String rangoHorario;
    
    //Constructores

    public Guardian() {
    }

    public Guardian(int idUser) {
        super(idUser);
    }

    public Guardian(double remuneracion, String tamanioCuidar, Date inicioDisponibilidad, Date finDisponibilidad, String rangoHorario, String userName, String password, String nombre, String apellido, Date nacimiento, String email, String ciudad) {
        super(userName, password, nombre, apellido, nacimiento, email, ciudad);
        this.remuneracion = remuneracion;
        this.tamanioCuidar = tamanioCuidar;
        this.inicioDisponibilidad = inicioDisponibilidad;
        this.finDisponibilidad = finDisponibilidad;
        this.rangoHorario = rangoHorario;
    }

    public Guardian(double remuneracion, String tamanioCuidar, Date inicioDisponibilidad, Date finDisponibilidad, String rangoHorario, int idUser, String userName, String password, String nombre, String apellido, Date nacimiento, String email, String ciudad) {
        super(idUser, userName, password, nombre, apellido, nacimiento, email, ciudad);
        this.remuneracion = remuneracion;
        this.tamanioCuidar = tamanioCuidar;
        this.inicioDisponibilidad = inicioDisponibilidad;
        this.finDisponibilidad = finDisponibilidad;
        this.rangoHorario = rangoHorario;
    }
    
    //Getters

    public double getRemuneracion() {
        return this.remuneracion;
    }

    public String getTamanioCuidar() {
        return this.tamanioCuidar;
    }

    public Date getInicioDisponibilidad() {
        return this.inicioDisponibilidad;
    }

    public Date getFinDisponibilidad() {
        return this.finDisponibilidad;
    }

    public String getRangoHorario() {
        return this.rangoHorario;
    }
    
    //Setters

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void setTamanioCuidar(String tamanioCuidar) {
        this.tamanioCuidar = tamanioCuidar;
    }

    public void setInicioDisponibilidad(Date inicioDisponibilidad) {
        this.inicioDisponibilidad = inicioDisponibilidad;
    }

    public void setFinDisponibilidad(Date finDisponibilidad) {
        this.finDisponibilidad = finDisponibilidad;
    }

    public void setRangoHorario(String rangoHorario) {
        this.rangoHorario = rangoHorario;
    }
    
}
