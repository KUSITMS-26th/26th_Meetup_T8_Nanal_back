package com.nanal.backend.domain.retrospect.repository;

import com.nanal.backend.domain.retrospect.entity.RetrospectContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetrospectContentRepository extends JpaRepository<RetrospectContent, Long> {
}
