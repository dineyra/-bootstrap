package ru.itmentor.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

@Repository
public interface UserDao {
    User getUserByEmail(String email);
    void addUser(User user);

    User getUserById(Long id);
    User updateUser(User user);

    void removeUserById(Long id);
    List<User> listUsers();
}