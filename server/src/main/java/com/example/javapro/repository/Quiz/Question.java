package com.example.javapro.repository.Quiz;

public interface Question {
    Long getId();
    String getQuestion();
    String getAnswerA();
    String getAnswerB();
    String getAnswerC();
    String getAnswerD();
    byte[] getImage();
}