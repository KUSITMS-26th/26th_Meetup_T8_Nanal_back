package com.nanal.backend.domain.retrospect.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class ReqGetRetroDto {

    //선택한 월
    @Schema(description = "" , example = "2022-10-17T05:33:42.387Z")
    private LocalDateTime selectDate;

    @Schema(description = "week" , example = "3")
    private int week;
}
