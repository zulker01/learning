package com.example.sql_server_crud.sql_server_crud.repository;


import com.example.sql_server_crud.sql_server_crud.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
}
