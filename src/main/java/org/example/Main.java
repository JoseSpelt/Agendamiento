package org.example;

import org.example.Infraestructure.Models.PersonaModels;
import org.example.Services.Contactos.PersonaService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService("postgres", "Invocador1998", "localhost", "5432", "Optativo 2");
        PersonaModels persona = new PersonaModels();
        persona.Nombre = "Juan";
        persona.Apellido = "Lopez";
        persona.TipoDocumento = "CI";
        persona.NroDocumento = "5729790";
        persona.Direccion = "Avda Von Grutter";
        persona.Celular = "09941141128";
        persona.Email = "josespelt6@gmail.com";
        persona.FechaNacimiento = "10/05/1998";
        persona.estado = "Soltero";
        personaService.registrarPersona(persona);
    }
}