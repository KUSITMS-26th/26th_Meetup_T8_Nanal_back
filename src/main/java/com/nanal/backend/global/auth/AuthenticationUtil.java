package com.nanal.backend.global.auth;

import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationUtil {

    public static String getCurrentUserEmail() {
        UserDto userDto = (UserDto)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return userDto.getEmail();
    }
}

