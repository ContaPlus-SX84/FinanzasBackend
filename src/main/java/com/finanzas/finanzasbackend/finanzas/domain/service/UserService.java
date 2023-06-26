package com.finanzas.finanzasbackend.finanzas.domain.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User authenticate(String username, String password);
    User create(User user);
    ResponseEntity<?> delete(Long id);
}
