package com.nanal.backend.domain.retrospect.entity;

import com.nanal.backend.global.config.BaseTime;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "retrospectquestion")
@Entity
public class RetrospectQuestion extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "retrospect_question_id")
    private Long retrospectQuestionId;

    @Column(length = 200, nullable = false)
    private String question;

    @Column(length = 500, nullable = false)
    private String help;
}
