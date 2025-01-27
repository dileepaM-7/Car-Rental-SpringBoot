package com.codewithprojects.entity;

import com.codewithprojects.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;

}
