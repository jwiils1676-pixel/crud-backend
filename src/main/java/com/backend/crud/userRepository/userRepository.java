package com.backend.crud.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.crud.models.User;

public interface userRepository extends JpaRepository<User, Integer> {

}

