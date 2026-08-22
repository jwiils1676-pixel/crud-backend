package com.backend.crud.excepcionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.backend.crud.errors.userNotFound;



//SE DEFINE LA CLASE PARA ESCUCHAR ERRORES GLOBALES
@RestControllerAdvice
public class globalExcepcionHandler {


//SI EL ERROR PROVIENE DE VALID ENTONCES HARA MATCH CON
//MethodArgumentNotValidException.class




    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> manejarValidacion(MethodArgumentNotValidException ex) {
        

             System.out.println("EXEPCION EJECUTADA");

        //CREAR UN OBJETO ESCALABLE 
     Map<String,String> errores = new HashMap<>();
     

     //ACCEDER A EX OSEA EL ERROR QUE ATRAPO  DE METHODARGUMENTNOTVALID.CLASS 
     //POR QUE EFECTIVAMENTE EL ERROR HIZO MATCH
     //CON METODARGUMENTNOTVALIREXCEPCION
     ex.getBindingResult().getFieldErrors().forEach(error -> {
        errores.put(error.getField(), error.getDefaultMessage());

     });
                  System.out.println(errores);






     //USAMOS LA PLATILLA RESPONSE ENTITY HTTPM Y USAMOS EL ESTADO
     //BADREQUEST PARA DEFINIRLA COMO UNA RESPUESTA DE ERROR ACOMPLAMOS 
     //EL ERROR EN BODY  Y LE AÑADIMOS LOS ERRORES
        return new ResponseEntity<>(errores,HttpStatus.BAD_REQUEST);

    }


    @ExceptionHandler(userNotFound.class)
    ResponseEntity<Object> errorNotFoundExcepcion(userNotFound ex) {

        HashMap<String, Object> error = new HashMap<>();

        error.put("Error", ex.getMessage());
        error.put("IdError", ex.getId());
        
             return  new ResponseEntity<>(error, HttpStatus.NOT_FOUND);


    }


   
      


// 



}
