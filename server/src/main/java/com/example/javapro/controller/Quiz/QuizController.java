package com.example.javapro.controller.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.repository.Quiz.QuizRepository;
import com.example.javapro.repository.Quiz.Question;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("quiz/")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("questions")
    public List<Question> getQuiz() {
        return this.quizRepository.findAllBy();
    }

    @PostMapping("result")
    public Long getAnswers(@RequestBody String[] answers){
        long correct = 0;
        for(long i=0; i<this.quizRepository.findAllBy().size(); i++){
            String b = answers[(int) i];
            correct += this.quizRepository.findById(i + 1).stream().filter(e -> e.getCorrectAnswer().equals(b)).count();
        }
        return correct;
    }
}