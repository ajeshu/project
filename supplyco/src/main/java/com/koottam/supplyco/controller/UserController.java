package com.koottam.supplyco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.koottam.supplyco.entity.UserEntity;
import com.koottam.supplyco.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("/Welcome");
		return mav;
	}

	@PostMapping("/user_register")
	public String addUser(@RequestParam String username, @RequestParam String email, @RequestParam String password,
			@RequestParam String usertype) {
		UserEntity userEntity = new UserEntity(username.toLowerCase(), email.toLowerCase(), password, usertype);
		userService.saveUser(userEntity);
		return "Welcome";
	}

	@PostMapping("/login")
	public String userLogin(@RequestParam String email, @RequestParam String password, Model model,
			HttpServletRequest request) {
		String uType = userService.validateUser(email, password);
		UserEntity user = userService.getUserName(email);
		model.addAttribute("user", user);
		request.getSession().setAttribute("user", user);
		if (uType.equals("admin")) {
			return "AdminHome";
		} else if (uType.equals("backOffice")) {
			return "BackOfficeHome";
		} else {
			return "InvalidLogin";
		}

	}

	@GetMapping("/signIn")
	public String signIn() {
		return "Welcome";
	}

	@GetMapping("/invalidLogin")
	public String invalidLogin() {
		return "Welcome";
	}

	@GetMapping("/addUser")
	public String AddUserForm() {
		return "AddUser";
	}

	@PostMapping("/submitUser")
	public String saveUser(@RequestParam String username, @RequestParam String email, @RequestParam String password,
			@RequestParam String usertype, Model model, HttpServletRequest request) {
		UserEntity userEntity = new UserEntity(username.toLowerCase(), email.toLowerCase(), password, usertype);
		userService.saveUser(userEntity);
		UserEntity user = (UserEntity) request.getSession().getAttribute("user");
		model.addAttribute("user", user);
		return "AdminHome";
	}

	@GetMapping("/viewUser")
	public String viewUser(Model model) {
		List<UserEntity> list = userService.getAllUsers();
		model.addAttribute("list", list);
		return "ViewUser";
	}

	@GetMapping("/findUser/{userId}")
	public String getUser(@PathVariable Long userId, Model model) {
		UserEntity user = userService.findUser(userId);
		model.addAttribute("user", user);
		return "EditUser";
	}

	@PostMapping("/saveUser")
	public String saveUser(@RequestParam Long userId, @RequestParam String userName, @RequestParam String userEmail,
			@RequestParam String password, @RequestParam String userTYPE) {
		userService.updateUser(userName, userEmail, password, userTYPE, userId);
		return "redirect:/viewUser";
	}

	@GetMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable Long userId) {
		userService.removeUser(userId);
		return "redirect:/viewUser";
	}

	@GetMapping("/signOut")
	public String signOut(HttpServletRequest request) {
		request.getSession().invalidate();
		return "Welcome";
	}

	@GetMapping("/changePassword/{userId}")
	public String userPassword(@PathVariable Long userId, Model model) {
		model.addAttribute("userId", userId);
		return "ChangePassword";
	}

	@PostMapping("/changePassword")
	public String changePassword(@RequestParam Long userId, @RequestParam String password) {
		userService.updatePassword(userId, password);
		return "BackOfficeHome";
	}

}