package com.ispeak.ispeak.repositories;

import com.ispeak.ispeak.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
