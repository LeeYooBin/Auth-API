package com.example.login_auth_api.entrypoint.dto;

import com.example.login_auth_api.domain.models.User;

public record ResponseDTO(User user, String token) {}
