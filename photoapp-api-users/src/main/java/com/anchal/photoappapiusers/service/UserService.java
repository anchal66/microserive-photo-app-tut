package com.anchal.photoappapiusers.service;

import com.anchal.photoappapiusers.dto.UserDto;

import java.util.UUID;

public class UserService {
    UserDto createUser(UserDto userDetails){
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
