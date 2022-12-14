package com.nanal.backend.domain.retrospect.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class ReqGetInfoDto {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Schema(description = "현재 날짜" , example = "2022-11-19T05:33:42.387Z")
    private LocalDateTime currentDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Schema(description = "선택된 날짜" , example = "2022-11-13T05:33:42.387Z")
    private LocalDateTime selectDate;
}
