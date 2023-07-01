package com.connect2fly.c2flybacken.repository;

import com.connect2fly.c2flybacken.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByName(String userName);
}
