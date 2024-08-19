package com.edu.ue.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edu.ue.model.Municipio;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class MunicipioService implements MunicipioServiceI {

    final String URL = "https://www.datos.gov.co/resource/xdk5-pm3f.json";
    @Autowired
    RestTemplate template;

    @Override
    public List<Municipio> listMunicipios() {
    	String response= template.getForObject(URL,String.class);
    	Municipio municipio;
    	ObjectMapper mapper=new ObjectMapper();
    	List<Municipio> municipios = new ArrayList<>();
    	ArrayNode array;
    	try {
    		array=(ArrayNode) mapper.readTree(response);
    		for(Object obj:array) {ObjectNode json=(ObjectNode) obj;
    		municipio = new Municipio(json.get("region").asText(),json.get("departamneto").asText(),json.get("municipio").asText(),json.get("c_digo_dane_del_departamento").asInt());
    		municipios.add(municipio);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return municipios;
    }
    @Override
    public List<Municipio> searchDepartamento(String name) {
        return listMunicipios()
        .stream()
        .filter(m->m.getDepartamento().equals(name))
        .collect(Collectors.toList());
        
    }

}
