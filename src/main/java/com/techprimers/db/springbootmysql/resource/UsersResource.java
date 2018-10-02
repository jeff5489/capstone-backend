package com.techprimers.db.springbootmysql.resource;

import com.techprimers.db.springbootmysql.model.Users;
import com.techprimers.db.springbootmysql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users){
        usersRepository.save(users);
        return usersRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Integer id) {
        usersRepository.deleteById(id);
        return true;
    }

//    @CrossOrigin(origins = "http://localhost:3000")
//    @DeleteMapping("/{id}")
//    public boolean updateUser(@PathVariable Integer id) {
//        usersRepository.
//        return true;
//    }
}
