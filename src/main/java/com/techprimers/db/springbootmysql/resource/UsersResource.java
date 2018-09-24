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

//    @GetMapping("/user/{id}")
//    public Users getUser(@PathVariable Integer id) {
//        return usersRepository.findOne(id);
//    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users){
        usersRepository.save(users);
        return usersRepository.findAll();
    }

//    @DeleteMapping("/user/{id}")
//    public boolean deleteUser(@PathVariable Integer id) {
//        usersRepository.delete(id);
//        return true;
//    }


//    annotation???
//    public void deleteById(ID id)

}
