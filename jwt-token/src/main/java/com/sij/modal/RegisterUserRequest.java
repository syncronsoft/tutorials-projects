package com.sij.modal;

import com.sij.entity.Role;

public class RegisterUserRequest {
    private String email;
    private String password;
    private String fullName;
    private Role role;

    public String getEmail() {
        return email;
    }

    public RegisterUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public RegisterUserRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public RegisterUserRequest setRole(Role role) {
        this.role = role;
        return this;
    }

    @Override
    public String toString() {
        return "RegisterUserRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}