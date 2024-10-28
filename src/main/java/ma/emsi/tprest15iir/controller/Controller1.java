package ma.emsi.tprest15iir.controller;

import ma.emsi.tprest15iir.model.User;
import ma.emsi.tprest15iir.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class Controller1 {
    private service userService;
    @Autowired
    public Controller1(service userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        User user=userService.getUser(id);
        if(user!=null){
            return user;
        }
        return null;
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @DeleteMapping("/supp")
    public void SupprimerUser(@RequestParam Integer id){
        userService.suppUser(id);
}}
