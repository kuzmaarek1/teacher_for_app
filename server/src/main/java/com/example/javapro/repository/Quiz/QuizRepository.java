package com.example.javapro.repository.Quiz;

import com.example.javapro.repository.Quiz.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.javapro.model.Quiz.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{
    List<Question> findAllBy();
}