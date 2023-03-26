package com.finanzas.finanzasbackend.finanzas.domain.persistence;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
