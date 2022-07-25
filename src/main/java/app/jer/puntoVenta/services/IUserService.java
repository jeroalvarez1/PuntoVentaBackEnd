package app.jer.puntoVenta.services;

import app.jer.puntoVenta.entities.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    void save(User user);
    String login(User user);
}
