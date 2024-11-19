package org.training.user.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUser {

    private String username;

    private String firstName;

    private String lastName;

    private String contactNumber;

    private String emailId;

    private Set<String> role;

    private String password;
}
