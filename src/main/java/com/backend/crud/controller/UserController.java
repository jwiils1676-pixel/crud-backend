package com.backend.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.backend.crud.models.User;
import com.backend.crud.service.userService;
import com.backend.crud.userRepository.userRepository;
import jakarta.validation.Valid;
import com.backend.crud.dto.userValidationDTOPost;
import com.backend.crud.dto.userValidationDTOPut;


@CrossOrigin(origins = "http://localhost:4200", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })

@RestController
public class UserController {

    @Autowired
    userService SaveData;
    @Autowired
    userRepository repo;

    @PostMapping("/addUsers")
    public void putUser(@Valid @RequestBody userValidationDTOPost user) {
        SaveData.saveUser(user);
    }



    
    @GetMapping("/callUsers")
    public List<User> getUsers() {
        return repo.findAll();
    }




    @DeleteMapping("/deleteAllUsers")
    public void DeleteUsers() {
        repo.deleteAll();
    }




    @PutMapping("/{id}")
    public User ModiUsers(@PathVariable Integer id, @Valid  @RequestBody userValidationDTOPut dto) {

        //  repo.findById(id).orElseThrow(()-> new userNotFound(id));

        System.out.println(dto.getEdad());    
        System.out.println(dto.getNombre());
        
        
         User data = SaveData.getUsersModi(dto,id);

         return data;
    }
    

    @DeleteMapping("/deleteById/{id}")
    public Void deleteUserById(@PathVariable Integer id) {

        System.out.println(id);

                  repo.deleteById(id);
                  return null;
    }
 
}
