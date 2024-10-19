package org.programacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/datos/empleados.json");
        System.out.println("Existe? " + file.exists());
        System.out.println("Te mide? "+ file.length() + " cm");
        System.out.println("Lo lees mi compa "+ file.canRead());
        System.out.println("Y escribirlo? "+ file.canWrite());
        System.out.println("Es una carpeta o que more "+ file.isDirectory());
        System.out.println("O es un archivo "+ file.isFile());
        System.out.println("Esta de que absoluto? " + file.isAbsolute());
        System.out.println("Esta ocultado? "+ file.isHidden());
        System.out.println("Donde anda "+ file.getAbsolutePath());
        System.out.println("Ultima modificacion "+ new Date(file.lastModified()));

        System.out.println("Escribiendo texto en un archivo");
        try{
//            PrintWriter escribir = new PrintWriter(file);
//            escribir.println("Hola mundo escribir");
//            escribir.println("otro texto");
//            escribir.close();
            Scanner leer = new Scanner(file);
            while (leer.hasNext()){
                System.out.println(leer.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no esxiste :(");
        }
    }
}