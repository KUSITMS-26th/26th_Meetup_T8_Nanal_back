package com.nanal.backend.domain.retrospect.repository;

import com.nanal.backend.domain.retrospect.entity.RetrospectQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetrospectQuestionRepository extends JpaRepository<RetrospectQuestion, Long> {
}
