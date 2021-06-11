package com.company.quotedefinitionanswer.controller;

import com.company.quotedefinitionanswer.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AnswerController {

    private static int idCounter = 1;

    private static final List<String> answerList = new ArrayList<>(Arrays.asList(
            // Positive answers
            "It is certain", "Without a doubt", "You may rely on it", "Yes, definitely", "It is decidedly so",
            "As I see it, yes", "Most likely", "Yes", "Outlook is good", "Signs point to yes",
            // Neutral answers
            "Reply hazy, try again", "Better not tell you now", "Ask again later", "Cannot predict now",
            "Concentrate and ask again",
            // Negative answers
            "Don't count on it", "Outlook not so good", "My sources say no", "Very doubtful", "No"
    ));

    private static final List<Answer> questions = new ArrayList<>();

    @PostMapping("/magic")
    @ResponseStatus(HttpStatus.CREATED)
    public Answer getAnswerAndSave(@RequestBody Answer question) {
        int randomNumber = (int)Math.floor(Math.random() * (answerList.size() - 1));
        String answer = answerList.get(randomNumber);

        question.setAnswer(answer);
        question.setId(idCounter++);

        questions.add(question);

        return question;
    }

    @GetMapping("/magic/history")
    @ResponseStatus(HttpStatus.OK)
    public List<Answer> getHistory() {
        return questions;
    }
}
