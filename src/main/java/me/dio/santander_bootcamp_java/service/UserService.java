package me.dio.santander_bootcamp_java.service;

import me.dio.santander_bootcamp_java.domain.model.User;

public interface UserService {
    User findbyId(Long id);
    User create(User userToCreate);


}
