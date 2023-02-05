package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.UserEntity;
import com.koottam.supplyco.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;

	public void saveUser(UserEntity userEntity) {

		try {
			userRepository.save(userEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String validateUser(String email, String password) {

		UserEntity user = userRepository.findByUserEmail(email);
		if (user != null && user.getUserPassword().equals(password) && user.getUserType().equals("Admin")) {
			return "admin";
		} else if (user != null && user.getUserPassword().equals(password)
				&& user.getUserType().equals("Back Office")) {
			return "backOffice";
		} else {
			return "invalid";
		}

	}

	public UserEntity getUserName(String email) {
		return userRepository.findByUserEmail(email);
	}

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	public UserEntity findUser(long id) {
		return userRepository.findByuserId(id);
	}

	public void updateUser(String name, String email, String pass, String uType, Long id) {
		userRepository.updateUserById(name, email, pass, uType, id);
	}

	public void removeUser(Long id) {
		userRepository.deleteByuserId(id);
	}

	public void updatePassword(Long id, String pass) {
		userRepository.updatePasswordById(pass, id);
	}

}