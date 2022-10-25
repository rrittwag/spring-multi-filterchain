package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("alpha")
    public String getAlpha() {
        return "alpha";
    }

    @GetMapping("bravo")
    public String getBravo() {
        return "bravo";
    }
}
