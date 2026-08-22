package com.backend.crud.errors;

 public class userNotFound extends RuntimeException {

        Object idReference;


    public userNotFound(Object id) {

        super("Error: no se pudo encontrar el usuario con el id: " + id);
                this.idReference   = id;


    }


    
    public Object getId() {
        return this.idReference;

    }

}
