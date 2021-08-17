package com.fis.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.users.bean.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findByUsername(String username);

}
