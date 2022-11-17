package com.nanal.backend.domain.retrospect.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class ReqEditRetroDto {

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime editDate;

    private String answer;

    private int week;

    private int index;

}