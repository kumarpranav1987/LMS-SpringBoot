package com.livetechstudy.lms.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livetechstudy.lms.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
