package app.jer.puntoVenta.controllers;

import app.jer.puntoVenta.entities.User;
import app.jer.puntoVenta.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    /*Get all*/
    public List<User> getAll() {
        return service.getAll();
    }

    /*Post Register*/
    @PostMapping("/api/register")
    public void save(@RequestBody User user) {
        service.save(user);
    }

    /*Post login*/
    @PostMapping("/api/login")
    public String login(@RequestBody User user) {
        return service.login(user);
    }
}
