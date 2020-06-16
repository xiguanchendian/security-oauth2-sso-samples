package com.xgcd.sso.authserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/serverUser")
public class AuthServerUserController {

    @GetMapping("/currentUser")
    public Principal getCurrentUser(Principal principal) {
        return principal;
    }
}
