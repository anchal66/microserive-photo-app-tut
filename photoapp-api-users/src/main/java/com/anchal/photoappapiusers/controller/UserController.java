package com.anchal.photoappapiusers.controller;

import com.anchal.photoappapiusers.model.request.CreateUserRequestModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/status/check")
    public String status(){
        return "work";
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel createUser){

        return "user create";
    }
}
