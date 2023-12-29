package com.orderCraftSpringApp.service.implementations;


import com.orderCraftSpringApp.model.classes.User;
import com.orderCraftSpringApp.repository.UserRepository;
import com.orderCraftSpringApp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    // Existing methods

    @Override
    public User authenticateUser(String email, String password) {

        User user = userRepository.findByEmail(email);

        if (user != null && password != null && password.equals(user.getPassword())) {
            return user; // Authentication successful
        } else {
            return null;
        }
    }
    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        if (userRepository.existsById(user.getUserID())) {
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }



}
