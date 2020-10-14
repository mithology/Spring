package com.example.restapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mitesh on 14/10/20.
 */
@RestController
public class GreetingsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greetings")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }
}