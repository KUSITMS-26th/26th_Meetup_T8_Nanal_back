package com.nanal.backend.domain.diary.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class KeywordDto {
    private String keyword;

    private List<KeywordEmotionDto> keywordEmotions;

}
