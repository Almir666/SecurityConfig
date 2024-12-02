package org.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/home")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/other")
    public String otherPages() {
        return "otherPages";
    }
}
