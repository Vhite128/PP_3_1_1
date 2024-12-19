package org.springboot.service;

import org.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> displayAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(User user);
}
