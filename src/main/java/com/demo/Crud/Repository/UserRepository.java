package com.demo.Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Crud.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
