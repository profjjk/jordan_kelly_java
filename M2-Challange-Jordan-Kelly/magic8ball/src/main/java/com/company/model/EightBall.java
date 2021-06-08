package com.company.model;

import java.util.Objects;

public class EightBall {
    // Instance variables
    private int id;
    private String question;
    private String answer;

    // Constructors
    public EightBall() { }

    public EightBall(int id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    // Getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EightBall eightBall = (EightBall) o;
        return id == eightBall.id && Objects.equals(question, eightBall.question) && Objects.equals(answer, eightBall.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }

    @Override
    public String toString() {
        return "EightBall{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
