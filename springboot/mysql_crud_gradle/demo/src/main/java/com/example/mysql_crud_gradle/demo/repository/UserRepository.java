package com.example.mysql_crud_gradle.demo.repository;

import com.example.mysql_crud_gradle.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
