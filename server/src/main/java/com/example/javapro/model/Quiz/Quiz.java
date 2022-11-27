package com.example.javapro.model.Quiz;

import javax.persistence.*;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "question")
    private String question;

    @Column(name = "answerA")
    private String answerA;

    @Column(name = "answerB")
    private String answerB;

    @Column(name = "answerC")
    private String answerC;

    @Column(name = "answerD")
    private String answerD;

    @Column(name = "correctAnswer")
    private String correctAnswer;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "image")
    private byte[] image;

    public Quiz() {

    }

    public Quiz(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer, byte[] image) {
        super();
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.image = image;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswerA() {
        return answerA;
    }
    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }
    public String getAnswerB() {
        return answerB;
    }
    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }
    public String getAnswerC() {
        return answerC;
    }
    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }
    public String getAnswerD() {
        return answerD;
    }
    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
}