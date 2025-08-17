package edu.sena.dohutalent.model;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Empleado extends ElementoEmpleado {
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;

    // Constructor vacío requerido por JPA
    public Empleado() {
    }

    // Constructor con todos los campos
    public Empleado(String identificacion, LocalDate fechaNacimiento,
                    String primerApellido, String segundoApellido,
                    String primerNombre) {
        super(identificacion, fechaNacimiento);
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.primerNombre = primerNombre;
    }

    // Getters y Setters
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    // Método toString() para facilitar la visualización
    @Override
    public String toString() {
        return "Empleado{" +
                "identificacion='" + getIdentificacion() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                '}';
    }
}