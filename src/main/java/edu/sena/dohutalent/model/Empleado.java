package edu.sena.dohutalent.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Seguridad Social
    private String fondoPension;
    private String fondoSalud;

    // Información Bancaria
    private String cuentaBancaria;
    private String banco;
    private String numeroCuenta;
    private String tipoCuenta;

    // Documentos (aquí podrías considerar cambiar a una relación OneToMany si son múltiples archivos)
    private String identificacion;
    private String contratos;
    private String diplomas;
    private String examenesMedicos;
    private String evaluacionDesempeno;
    private String polizas;
    private String otrosDocumentos;

    // Auditoría
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(String fondoPension) {
        this.fondoPension = fondoPension;
    }

    public String getFondoSalud() {
        return fondoSalud;
    }

    public void setFondoSalud(String fondoSalud) {
        this.fondoSalud = fondoSalud;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getContratos() {
        return contratos;
    }

    public void setContratos(String contratos) {
        this.contratos = contratos;
    }

    public String getDiplomas() {
        return diplomas;
    }

    public void setDiplomas(String diplomas) {
        this.diplomas = diplomas;
    }

    public String getExamenesMedicos() {
        return examenesMedicos;
    }

    public void setExamenesMedicos(String examenesMedicos) {
        this.examenesMedicos = examenesMedicos;
    }

    public String getEvaluacionDesempeno() {
        return evaluacionDesempeno;
    }

    public void setEvaluacionDesempeno(String evaluacionDesempeno) {
        this.evaluacionDesempeno = evaluacionDesempeno;
    }

    public String getPolizas() {
        return polizas;
    }

    public void setPolizas(String polizas) {
        this.polizas = polizas;
    }

    public String getOtrosDocumentos() {
        return otrosDocumentos;
    }

    public void setOtrosDocumentos(String otrosDocumentos) {
        this.otrosDocumentos = otrosDocumentos;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}