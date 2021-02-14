package com.anchal.photoappapiusers.controller;

import com.anchal.photoappapiusers.dto.UserDto;
import com.anchal.photoappapiusers.model.request.CreateUserRequestModel;
import com.anchal.photoappapiusers.model.response.CreateUserResponse;
import com.anchal.photoappapiusers.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/status/check")
    public String status() {
        return "work";
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequestModel createUser) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto = modelMapper.map(createUser, UserDto.class);
        UserDto userRes = userService.createUser(userDto);
        CreateUserResponse createUserResponse = modelMapper.map(userRes, CreateUserResponse.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUserResponse);
    }
}
