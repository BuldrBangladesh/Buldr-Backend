package com.example.cse_410_buldr_backend.Service;



import com.example.cse_410_buldr_backend.Entity.User;
import com.example.cse_410_buldr_backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserService {
    @Autowired
    UserRepository userRepo;

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> allUsers=userRepo.findAll();
        return allUsers;
    }
    @RequestMapping(value="/user/{userID}",method = RequestMethod.GET)
    public User getUser(@PathVariable("userID") long id){

        return userRepo.searchByID(id);
    }
    @RequestMapping(value="/user-email/{email}",method = RequestMethod.GET)
    public User getUser(@PathVariable("email") String email){
        return userRepo.searchByEmail(email);
    }
    @RequestMapping(value="/user",method= RequestMethod.POST)
    public User addUser(@RequestBody User newUser){
        userRepo.saveAndFlush(newUser);
        return newUser;
    }

    @RequestMapping(value="/user/{id}",method= RequestMethod.PUT)
    public int updateProduct(@PathVariable("id") long id,@RequestBody User user) {
        try{
            userRepo.updateUser(
                    id,
                    user.getName(),
                    user.getDesignation(),
                    user.getCompany(),
                    user.getEmail(),
                    user.getPhoneNo(),
                    user.getAddress(),
                    user.getPortfolio(),
                    user.getGithub(),
                    user.getLinkedin(),
                    user.getBuldr(),
                    user.getCity(),
                    user.getCountry(),
                    user.getImage(),
                    user.getBio(),
                    user.getScholar_id()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }

    }

}

