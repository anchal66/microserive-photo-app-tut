package com.anchal.photoappapiusers.model.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CreateUserRequestModel {
    @NotNull(message = "first name pls include")
    private String firstName;
    @NotNull(message = "first name pls include")
    private String lastName;
    @NotNull(message = "first name pls include")
    @Email
    private String email;
    @NotNull(message = "first name pls include")
    @Size(min = 6, message = "Size > 6")
    private String password;
}
