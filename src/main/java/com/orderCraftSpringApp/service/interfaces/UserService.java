package com.orderCraftSpringApp.service.interfaces;

import com.orderCraftSpringApp.model.classes.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User authenticateUser(String email, String password);

    Iterable<User> getAllUsers();

    User getUserById(long id);

    User findByName(String name);

    void saveUser(User user);

    User updateUser(User user);


    void deleteUserById(Long id);


}
