package com.nanal.backend.domain.auth.controller;

import com.nanal.backend.domain.auth.dto.req.ReqSignUpDto;
import com.nanal.backend.domain.auth.service.AuthService;
import com.nanal.backend.global.security.jwt.Token;
import com.nanal.backend.global.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestController
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth/signup")
    public CommonResponse<?> signUp(@RequestBody ReqSignUpDto reqSignUpDto) {

        // 최초 로그인 - 회원가입 후 토큰 발행.
        // 기존 유저 - 토큰 발행.
        Token token = authService.signUp(reqSignUpDto);

        return new CommonResponse<>(token);
    }

    @GetMapping("/auth/reissue")
    public CommonResponse<Token> reissue(HttpServletRequest request) {

        // 헤더로부터 RefreshToken 추출.
        String token = request.getHeader("RefreshToken");
        // 토큰 재발행
        Token newToken = authService.reissue(token);

        return new CommonResponse<>(newToken);
    }
}
