package me.dio.API.Banco.service;

import me.dio.API.Banco.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
