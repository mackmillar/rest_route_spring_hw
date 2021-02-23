package com.codeclan.example.relationshipsdemo.repositories;

import com.codeclan.example.relationshipsdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
