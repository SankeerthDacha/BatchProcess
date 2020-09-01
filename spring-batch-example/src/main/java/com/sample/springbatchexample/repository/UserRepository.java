package com.sample.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
