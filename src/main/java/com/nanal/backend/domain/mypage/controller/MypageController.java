package com.nanal.backend.domain.mypage.controller;

import com.nanal.backend.config.response.CommonResponse;
import com.nanal.backend.config.response.ErrorCode;
import com.nanal.backend.domain.diary.dto.*;
import com.nanal.backend.domain.diary.service.DiaryService;
// import com.nanal.backend.domain.mypage.dto.ReqEditNicknameDto; - 현재 미사용
import com.nanal.backend.domain.mypage.dto.*;
import com.nanal.backend.domain.mypage.service.MypageService;
import com.nanal.backend.domain.oauth.UserDto;
import com.nanal.backend.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RequiredArgsConstructor
@RestController
public class MypageController {

    private final MypageService mypageService;

    /**
     * 마이페이지 정보
     * [GET] /mypage
     * 작성자 : 김유빈
     * 수정일 : 2022-11-16
     */
    @GetMapping("/mypage")
    public CommonResponse<RespGetUserDto> getUser(@AuthenticationPrincipal UserDto userDto, @Valid ReqGetUserDto reqGetUserDto) {

        // 유저 정보 조회
        RespGetUserDto respGetUserDto = mypageService.getUser(userDto.getEmail(), reqGetUserDto);

        return new CommonResponse<>(respGetUserDto);
    }

    /**
     * 닉네임 변경
     * [PUT] /mypage/nickname
     * 작성자 : 김유빈
     * 수정일 : 2022-11-17
     */
    @PutMapping("/mypage/nickname")
    public CommonResponse<RespEditNicknameDto> updateNickname(@AuthenticationPrincipal UserDto userDto, @RequestBody @Valid ReqEditNicknameDto reqEditNickname) {

        // 닉네임 변경
        RespEditNicknameDto respEditNicknameDto = mypageService.updateNickname(userDto, reqEditNickname);

        return new CommonResponse<>(respEditNicknameDto);
    }

    /**
     * 회고요일 변경
     * [PUT] /mypage/day
     * 작성자 : 김유빈
     * 수정일 : 2022-11-17
     */
    @PutMapping("/mypage/day")
    public CommonResponse<RespEditRetrospectDayDto> updateRetrospectDay(@AuthenticationPrincipal UserDto userDto, @RequestBody @Valid ReqEditRetrospectDayDto reqEditRetrospectDayDto) {

        // 회고요일 변경
        RespEditRetrospectDayDto respEditRetrospectDayDto = mypageService.updateRetrospectDay(userDto, reqEditRetrospectDayDto);

        return new CommonResponse<>(respEditRetrospectDayDto);
    }

}
