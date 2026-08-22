package com.backend.crud.dto;

import jakarta.validation.constraints.*;

public class userValidationDTOPost {

    @Size(min = 3, message = "Minimo 3 caracteres")
    @Size(max = 10, message = "Maximo 10 caracteres")
    @NotNull
    private String nombre;

    @Size(min = 3, message = "Minimo 3 caracteres")
    @Size(max = 10, message = "Maximo 10 caracteres")
    @NotNull
    private String apellido;

    @Min(value = 18, message = "Minimo de edad 18 años")
    @NotNull
    private long edad;


    @Size(min = 10, max = 10,  message = "min 10 caracteres y maximo 10 caracteres")
    private String numero;



    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    void setEdad(long edad) {
        this.edad = edad;
    }

    public Long getEdad() {
        return this.edad;
    }

    void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

}
