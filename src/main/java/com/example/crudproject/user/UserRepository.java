package com.example.crudproject.user;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public Long countById(Integer id);
}