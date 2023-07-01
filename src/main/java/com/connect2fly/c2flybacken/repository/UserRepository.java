package com.connect2fly.c2flybacken.repository;

import com.connect2fly.c2flybacken.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
