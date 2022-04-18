package com.micro.imagesservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("images")
public class ImagesController {

    @GetMapping("")
    private String hello() {
        return "hello from images-service";
    }
}
