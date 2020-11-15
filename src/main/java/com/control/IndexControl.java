package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControl {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }
}
