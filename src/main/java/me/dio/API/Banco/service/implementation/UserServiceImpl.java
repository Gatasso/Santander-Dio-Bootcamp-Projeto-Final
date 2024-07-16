package me.dio.API.Banco.service.implementation;

import me.dio.API.Banco.domain.model.User;
import me.dio.API.Banco.domain.repository.UserRepository;
import me.dio.API.Banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if ((userToCreate.getUsr_id() != null &&
                repository.existsById(userToCreate.getUsr_id())) ||
                (repository.existsByAccountNumber(userToCreate.getAccount().getNumber()))) {
            throw new IllegalArgumentException("This user ID already exists");
        }
        return repository.save(userToCreate);
    }
}
