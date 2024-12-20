package org.programacion.service;

import com.google.gson.Gson;
import org.programacion.modelos.Persona;

import java.io.*;

public class PersonaIOService {
    private Gson gson;
    private Persona persona;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private final String PATH_NAME = "src/main/resources/datos/empleados.json";
    public PersonaIOService() {
        gson = new Gson();

    }
    public void escribirJson(Persona persona){
        try{
            fileWriter = new FileWriter(PATH_NAME);
            bufferedWriter = new BufferedWriter(fileWriter);
            String json = gson.toJson(persona);
            bufferedWriter.write(json);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo "+ e.getMessage());
        }

    }
    public Persona leerJson(){
        String archivoLeido = "", linea;
        try {
            fileReader = new FileReader(PATH_NAME);
            bufferedReader = new BufferedReader(fileReader);
            while ((linea = bufferedReader.readLine()) != null){
                archivoLeido += linea;
            }
            persona = gson.fromJson(archivoLeido,Persona.class);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo "+ e.getMessage());
        }

        return persona;
    }
}
