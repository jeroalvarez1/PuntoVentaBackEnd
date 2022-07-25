package app.jer.puntoVenta.services;

import app.jer.puntoVenta.entities.User;
import app.jer.puntoVenta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public String login(User user) {
        String val = "";
        for (User dato : getAll()) {
            if(dato.getUsername() == user.getUsername()){
                if (dato.getPassword() == user.getPassword()){
                    val = "NC-PC";
                } else {
                    val = "NC-PI";
                }
            } else {
                val = "NI";
            }
        }
        return val;
    }


}
