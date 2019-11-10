package com.kodilla.kodilla.patterns2.facade;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class Authenticator {

    public boolean isAuthenticated(Long urerId) {
        Random random = new Random();
        return random.nextBoolean();
    }

}
