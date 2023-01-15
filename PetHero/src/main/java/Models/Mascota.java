
package Models;

import java.io.File;
import java.util.Date;

public class Mascota {
    //Atributos
    private int idMascota;
    private int idDuenio;
    private String tipo;
    private String nombre;
    private double peso;
    private Date nacimiento;
    private String raza;
    private String observaciones;
    private File imagen;
    private File planVacunacion;
    private File video;
    
    //Constructores
    
    public Mascota() {
    }
    
    public Mascota(int idMascota){
        this.idMascota = idMascota;
    }

    public Mascota(int idDuenio, String tipo, String nombre, double peso, Date nacimiento, String raza, String observaciones, File imagen, File planVacunacion, File video) {
        this.idDuenio = idDuenio;
        this.tipo = tipo;
        this.nombre = nombre;
        this.peso = peso;
        this.nacimiento = nacimiento;
        this.raza = raza;
        this.observaciones = observaciones;
        this.imagen = imagen;
        this.planVacunacion = planVacunacion;
        this.video = video;
    }

    public Mascota(int idMascota, int idDuenio, String tipo, String nombre, double peso, Date nacimiento, String raza, String observaciones, File imagen, File planVacunacion, File video) {
        this.idMascota = idMascota;
        this.idDuenio = idDuenio;
        this.tipo = tipo;
        this.nombre = nombre;
        this.peso = peso;
        this.nacimiento = nacimiento;
        this.raza = raza;
        this.observaciones = observaciones;
        this.imagen = imagen;
        this.planVacunacion = planVacunacion;
        this.video = video;
    }
    
    //Getters

    public int getIdMascota() {
        return this.idMascota;
    }

    public int getIdDuenio() {
        return this.idDuenio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPeso() {
        return peso;
    }

    public Date getEdad() {
        return this.nacimiento;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public File getImagen() {
        return this.imagen;
    }

    public File getPlanVacunacion() {
        return this.planVacunacion;
    }

    public File getVideo() {
        return this.video;
    }
    
    //Setters

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public void setPlanVacunacion(File planVacunacion) {
        this.planVacunacion = planVacunacion;
    }

    public void setVideo(File video) {
        this.video = video;
    }
    
}
