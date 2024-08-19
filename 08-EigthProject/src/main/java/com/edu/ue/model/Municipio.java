package com.edu.ue.model;

public class Municipio {
    private String region;
    private String departamento;
    private String municipio;
    private int codDepartamento;

    
    public Municipio(String region, String departamento, String municipio, int codDepartamento) {
        this.region = region;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codDepartamento = codDepartamento;
    }

    public Municipio() {
        super();
    }


    public String getRegion() {
        return region;
    }


    public void setRegion(String region) {
        this.region = region;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getMunicipio() {
        return municipio;
    }


    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }


    public int getCodDepartamento() {
        return codDepartamento;
    }


    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

}
