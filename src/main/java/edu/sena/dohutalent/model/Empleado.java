package edu.sena.dohutalent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Empleado {
    @Id
    private String identificacion;
    private LocalDate fechaNacimiento;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;

    // Constructor vacío (requerido por JPA)
    public Empleado() {
    }

    // Constructor completo
    public Empleado(String identificacion, LocalDate fechaNacimiento,
                    String primerApellido, String segundoApellido,
                    String primerNombre) {
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.primerNombre = primerNombre;
    }

    // Getters y Setters
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

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
}