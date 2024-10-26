package org.programacion;

import org.programacion.service.PersonaService;

public class Main {
    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();
        personaService.menu();
    }
}