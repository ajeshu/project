package com.koottam.supplyco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByUserEmail(String email);

	UserEntity findByuserId(long id);

	@Modifying
	@Query("UPDATE UserEntity u SET u.userName =:name,u.userEmail =:email,u.userPassword =:pass,u.userType =:uType WHERE u.userId = :id")
	void updateUserById(String name, String email, String pass, String uType, Long id);

	void deleteByuserId(Long id);

	@Modifying
	@Query("UPDATE UserEntity u SET u.userPassword = :pass WHERE u.userId = :id")
	void updatePasswordById(String pass, Long id);
}