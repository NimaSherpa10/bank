package com.backend.bankingManagmentSystem.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long user_id;
    private String userName;
    private String password;
    private String email;

}
