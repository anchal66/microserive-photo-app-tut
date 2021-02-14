package com.anchal.photoappapiusers.model.response;

import lombok.Data;

@Data
public class CreateUserResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
