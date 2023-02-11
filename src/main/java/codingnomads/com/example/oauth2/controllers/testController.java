package codingnomads.com.example.oauth2.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/")
    public String homePage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "/index";
    }

    @GetMapping("/protected")
    public String protectedPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "/index";
    }

    @GetMapping("/error")
    public String errorPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "/error";
    }

    @GetMapping("/expired")
    public String expiredPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "/expired";
    }
}