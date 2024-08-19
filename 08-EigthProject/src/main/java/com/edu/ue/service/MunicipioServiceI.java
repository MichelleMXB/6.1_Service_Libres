package com.edu.ue.service;

import java.util.List;

import com.edu.ue.model.Municipio;

public interface MunicipioServiceI {
    List<Municipio> listMunicipios();
    List<Municipio> searchDepartamento(String depart);   
}
