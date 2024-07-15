package me.dio.API.Banco.domain.repository;

import me.dio.API.Banco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
