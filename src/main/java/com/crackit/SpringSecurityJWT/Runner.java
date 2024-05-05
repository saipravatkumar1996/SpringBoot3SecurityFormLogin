package com.crackit.SpringSecurityJWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.crackit.SpringSecurityJWT.auth.AuthService;
import com.crackit.SpringSecurityJWT.auth.RegisterRequest;
import com.crackit.SpringSecurityJWT.user.Role;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private  AuthService authService;
	
	@Override
	public void run(String... args) throws Exception {
		RegisterRequest registerRequest=new RegisterRequest();
		registerRequest.setEmail("pravat.behera@csm.tech");
		registerRequest.setFirstName("pravat");
		registerRequest.setLastName("Kumar");
		registerRequest.setPassword("pwd1");
		registerRequest.setRole(Role.ADMIN);
		authService.register(registerRequest);

	}

}
