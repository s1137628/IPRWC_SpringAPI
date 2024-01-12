package com.example.iprwc_springapi.dao;

import com.example.iprwc_springapi.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

    Optional<User> findByEmail(String email);
}
