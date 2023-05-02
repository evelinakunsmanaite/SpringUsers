package com.bbtutorials.users;

import com.bbtutorials.users.controller.UsersController;
import com.bbtutorials.users.entity.Users;
import com.bbtutorials.users.service.UsersService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@SpringBootApplication
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);

	}

}
