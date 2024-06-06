package com.rubens.spring_security_jwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubens.spring_security_jwt.security.AuthenticationService;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
  
    @PostMapping("authenticate")
    public String authenticate(
        Authentication authentication) {
      return authenticationService.authenticate(authentication);
    }
}
