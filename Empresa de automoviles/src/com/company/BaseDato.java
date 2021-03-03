package com.company;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BaseDato {
    private  ObjectMapper mapper = new ObjectMapper();
    private  File file = new File("Vehiculos.Json");


    public BaseDato(){};
    public void writerEnArchivoJSON( ArrayList<Vehiculo> vehiculos) throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(file,vehiculos);
    }
    public void leerArchivoJson() throws JsonParseException ,JsonMappingException , IOException {
       List<Vehiculo> vehiculos = mapper.readValue(file,List.class);
      System.out.println(vehiculos.toString());
    }
}
