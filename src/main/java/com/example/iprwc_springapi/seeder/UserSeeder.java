package com.example.iprwc_springapi.seeder;

import com.example.iprwc_springapi.authentication.Role;
import com.example.iprwc_springapi.dao.UserDAO;
import com.example.iprwc_springapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserSeeder {


    @Autowired
    private UserDAO userDAO;

    private final PasswordEncoder passwordEncoder;

    public UserSeeder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void seed(){
        User admin = new User();
        admin.setEmail("ADMIN@shop.nl");
        admin.setPassword(passwordEncoder.encode("Abcdefg1"));
        admin.setRole(Role.ADMIN);
        userDAO.save(admin);

    }
}