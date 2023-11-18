package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping( value = "/whoami/{username}" )
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s", username);
    }

}
