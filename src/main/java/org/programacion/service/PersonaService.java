package org.programacion.service;

import org.programacion.modelos.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private Persona persona;
    private Scanner sc;
    private PersonaIOService personaIOService;

    public PersonaService() {
        sc = new Scanner(System.in);
        personaIOService = new PersonaIOService();
    }
    public void menu(){
        int opcion;
        do{
            System.out.println("""
                    MENU DE OPCIONES JSON
                    1 -> CREAR PERSONA
                    2 -> VISUALISAR PERSONA
                    INGRESE UNA OPCION
                    """);
            opcion = sc.nextInt();
            switch (opcion){
               case 1 -> crearPersona();
               case 2 -> visualizarPersona();
                default -> opcion = 0;
            }
        }while (opcion != 0);
    }

    private void visualizarPersona() {
        System.out.println("Visualisar persona");
        persona = personaIOService.leerJson();
        System.out.println(persona);
    }

    private void crearPersona() {
        System.out.println("Crear una persona");
        System.out.println("Ingrese Nombre");
        String nombre = sc.next();
        System.out.println("Ingrese correo");
        String correo = sc.next();
        System.out.println("Ingrese telefono");
        String telefono = sc.next();
        String fechaCreacion = new Date().toString();
        persona = new Persona(nombre,correo,telefono,fechaCreacion);
        personaIOService.escribirJson(persona);
    }
}
