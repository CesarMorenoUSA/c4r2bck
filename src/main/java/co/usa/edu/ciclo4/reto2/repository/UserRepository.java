/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.ciclo4.reto2.repository;

import co.usa.edu.ciclo4.reto2.model.User;
import co.usa.edu.ciclo4.reto2.repository.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository repo;
    public List<User> getAll() {
        return (List<User>) repo.findAll();
    }

    public Optional<User> getUser(int id) {
        return repo.findById(id);
    }

    public User create(User user) {
        return repo.save(user);
    }
    
    public void update(User user) {
        repo.save(user);
    }
    
    public void delete(User user) {
        repo.delete(user);
    }

    public boolean emailExists(String email) {
        Optional<User> usuario = repo.findByEmail(email);        
        return !usuario.isEmpty();
    }
    
    public Optional<User> authenticateUser(String email, String password) {
        return repo.findByEmailAndPassword(email, password);
    }  
}
