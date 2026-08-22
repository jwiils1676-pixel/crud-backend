package com.backend.crud.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.Data;





@Entity
// @Data //GENERA GETTERS Y SETTERS

@Table(name = "usuarios")


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // ← falta este campo


    String nombre;
    String apellido;
    Long edad;
    String numero;



//ID GETTERS Y SETTERS
    // private void setId(Long id) {
    //     this.id = id;
    // }

    public Integer getId() {
        return this.id;
    }
      public void  setId(Integer id) {
         this.id = id;
    }





//NOMBRE GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }




//APELLIDO GETTERS Y SETTERS
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }





    //EDAD GETTERS Y SETTERS
    public void setEdad(Long edad) {
        this.edad  = edad;
    }


    public Long getEdad() {
        return this.edad;
    }




    

    //NUMERO GETTERS Y SETTERS
    public void setNumero(String numero) {
        this.numero  = numero;
    }

    public String getNumero() {
        return this.numero;
    }

}
