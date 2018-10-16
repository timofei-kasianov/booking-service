package com.chisw.timofei.booking.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author timofei.kasianov 10/2/18
 */
@RestController
@RequestMapping("/users")
public class UsersRestService {

    @GetMapping("/")
    public ResponseEntity list() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") long userId) {
        return null;
    }

    @PostMapping("/")
    public ResponseEntity create(@RequestBody Object createUserRequest) {
        return null;
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long userId) {

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long userId) {

    }

}
