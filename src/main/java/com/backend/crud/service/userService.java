package com.backend.crud.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.crud.userRepository.userRepository;
import com.backend.crud.models.User;
import com.backend.crud.service.userService;
import com.backend.crud.dto.userValidationDTOPost;
import com.backend.crud.dto.userValidationDTOPut;
import com.backend.crud.errors.userNotFound;



@Service
public class userService {
    @Autowired
    private userRepository saveVariable;



    public void saveUser(userValidationDTOPost user) {

        User user2 = new User();

        user2.setApellido(user.getApellido());
        user2.setNombre(user.getNombre());
        user2.setNumero(user.getNumero());
        user2.setEdad(user.getEdad());
        saveVariable.save(user2);
    }



    

    public User getUsersModi(userValidationDTOPut userGet, Integer id) {

        User userFinId = saveVariable.findById(id)
                .orElseThrow(() -> new userNotFound(id));

        if (userGet.getApellido() != null) {

            userFinId.setApellido(userGet.getApellido());
        }

        if (userGet.getEdad() != null) {
            userFinId.setEdad(userGet.getEdad());
        }

        if (userGet.getNombre() != null) {
            userFinId.setNombre(userGet.getNombre());
        }

           if (userGet.getNumero() != null) {
            userFinId.setNumero(userGet.getNumero());
        }

        saveVariable.save(userFinId);
        return userFinId;

    }

}
