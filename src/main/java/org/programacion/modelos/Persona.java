package org.programacion.modelos;

import com.google.gson.annotations.SerializedName;

public class Persona {
    private String nombre;
    private String telefono;
    private String correo;
    @SerializedName("fecha_creacion")
    private String fechaCrecion;

    public Persona(String nombre, String telefono, String correo, String fechaCrecion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaCrecion = fechaCrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaCrecion() {
        return fechaCrecion;
    }

    public void setFechaCrecion(String fechaCrecion) {
        this.fechaCrecion = fechaCrecion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaCrecion='" + fechaCrecion + '\'' +
                '}';
    }
}
