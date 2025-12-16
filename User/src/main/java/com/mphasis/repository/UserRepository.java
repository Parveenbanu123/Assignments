package com.mphasis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
