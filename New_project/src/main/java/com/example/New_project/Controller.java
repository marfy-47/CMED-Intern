package com.example.New_project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class Controller {

    @GetMapping("/all")
    private ResponseEntity<String> text_print()
    {
        return ResponseEntity.ok("Hello World");
    }
}
