package com.vanguard.questionmicroservice.repository;

import com.vanguard.questionmicroservice.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
