package codingnomads.com.example.oauth2.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/")
    public String getIndexPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "/index";
    }

    @GetMapping("/protected")
    public String getProtectedPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "/index";
    }
}