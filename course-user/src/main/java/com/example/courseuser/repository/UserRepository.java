package com.example.courseuser.repository;

import com.example.courseuser.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser getUserByUsername(String username);
}
