package com.backend.crud.dto;

import jakarta.validation.constraints.*; // Importas las validaciones

public class userValidationDTOPut {

    @Size(max = 10, message = "No puedes escribir mas de 10 caracteres")
    @Size(min = 4, message = "ERROR: El nombre debe tener al menos 3 caracteres")
    private String nombre;




    @Size(max = 10, message = "No puedes escribir mas de 10 caracteres")
    @Size(min = 4, message = "ERROR: El apellido debe tener al menos 3 caracteres")
    private String apellido;




    @Max(value = 150, message = "No puede ser mayor de 150")
    @Min(value = 18, message = "ERROR: No puede ser menor de 18 años")
    private Long edad;

    @Size(max = 10, min = 10,  message = "No puedes escribir mas de 10 caracteres ni menos de 10")
    private String numero;

    @PositiveOrZero(message = "ERROR: No se permiten numeros negativos")
    private Integer id;

    // GETTERS Y SETTERS NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Integer id) {

        this.id = (id == 0)  ? null : id;
        
    }

    public Integer getId(Integer id) {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    // GETTERS Y SETTERS APELLIDO

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    // GETTERS Y SETTERS EDAD

    public void setEdad(long edad) {

        this.edad = (edad == 0) ? null : edad;
    }

    public Long getEdad() {
        return this.edad;
    }

    // GETTERS Y SETTERS NUMERO

    public void setNumero(String numero) {

        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

}
