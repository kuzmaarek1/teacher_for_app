package com.example.javapro.services.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.Quiz.Quiz;
import com.example.javapro.repository.Quiz.QuizRepository;

@Component
public class QuizServices {
    @Autowired
    private QuizRepository quizRepository;
    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
        /*
        Integer countList = new File("img/quiz").listFiles().length;

        List <File> file = new ArrayList<File>();
        List <byte[]> picInBytes = new ArrayList<byte[]>();
        List <FileInputStream> fileInputStream  = new ArrayList<FileInputStream>();
        for (int i = 0; i < countList; i++) {
            file.add(new File("img/quiz/0"+i+".png"));

            picInBytes.add(new byte[(int) file.get(i).length()]);
            fileInputStream.add(new FileInputStream(file.get(i)));
            fileInputStream.get(i).read(picInBytes.get(i));
            fileInputStream.get(i).close();
        }


        List <Quiz> quiz = new ArrayList<Quiz>();
        quiz.add(new Quiz("Pakiet biblioteki Swing ?",
                "java.swing",
                "java.awt",
                "javax.swing",
                "javax.awt",
                "answerC0",
                null));
        quiz.add(new Quiz("Która technologia jest związana z JavaFX ?",
                "JSP",
                "FXML",
                "JSF",
                "EJB",
                "answerB1",
                null));

        quiz.add(new Quiz("Który pakiet związany jest z serwletami ?",
                "javax.servlet",
                "java.servlet",
                "javaee.servlet",
                "javae.servlet",
                "answerA2",
                null));


        quiz.add(new Quiz(" Który pakiet związany jest z platformą Android ?",
                "javax.android",
                "java.android",
                "android.java",
                "android.app",
                "answerD3",
                null));

        quiz.add(new Quiz(" Która technologia jest bezpośrednio związana z obsługą transakcji ?",
                "JDBC",
                "EJB",
                "JTA",
                "JPA",
                "answerC4",
                null));
        quiz.add(new Quiz("Co zwróci następujący skrypt języka JavaScript?",
                "Audi Q5 Error",
                "Audi Q5 false",
                "Audi Q5 true",
                "3 x Error",
                "answerA5",
                picInBytes.get(0)));
        quiz.add(new Quiz("Wykonanie poniższego kodu języka Java powoduje wyświetlenie na konsoli",
                "AC",
                "BC",
                "BD",
                "AD",
                "answerA6",
                picInBytes.get(1)));

        for(int i=0;i<quiz.size();i++){
            this.quizRepository.save(quiz.get(i));
        }
         */
    }
}