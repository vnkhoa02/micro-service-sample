package com.micro.audioservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("audio")
public class AudioController {

    @GetMapping("")
    private String hello() {
        return "hello from audio-service";
    }
}
