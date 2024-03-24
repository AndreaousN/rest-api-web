package com.spring.runnerz;

import org.springframework.stereotype.Component;

// @Component makes this class available to Spring
@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Welcome to the Spring boot Application!";
    }
}
