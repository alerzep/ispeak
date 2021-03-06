package com.ispeak.ispeak.repositories;

import com.ispeak.ispeak.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository <Answer, Long> {
}
