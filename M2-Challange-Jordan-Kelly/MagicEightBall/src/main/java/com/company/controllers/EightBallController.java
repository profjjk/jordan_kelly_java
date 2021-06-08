package com.company.controllers;

import com.company.model.EightBall;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EightBallController {

    private static int idCounter = 1;

    private static final List<String> answerList = new ArrayList<>(Arrays.asList(
            // Positive answers
            "It is certain", "Without a doubt", "You may rely on it", "Yes, definitely", "It is decidedly so",
            "As I see it, yes", "Most likely", "Yes", "Outlook is good", "Sign point to yes",
            // Neutral answers
            "Reply hazy, try again", "Better not tell you now", "Ask again later", "Cannot predict now",
            "Concentrate and ask again",
            // Negative answers
            "Don't count on it", "Outlook not so good", "My sources say no", "Very doubtful", "No"
    ));

    private static final List<EightBall> questions = new ArrayList<>();

    @PostMapping("/magic")
    @ResponseStatus(HttpStatus.CREATED)
    public String getAnswerAndSave(@RequestBody(required=false) String question) {
        int randomNumber = (int)Math.floor(Math.random() * (answerList.size() - 1));
        String answer = answerList.get(randomNumber);
        EightBall questionAndAnswer = new EightBall(idCounter++, question, answer);
        questions.add(questionAndAnswer);
        return questionAndAnswer.getAnswer();
    }

    @GetMapping("/magic")
    @ResponseStatus(HttpStatus.OK)
    public String getAnswer() {
        int randomNumber = (int)Math.floor(Math.random() * (answerList.size() - 1));
        return answerList.get(randomNumber);
    }

    @GetMapping("/magic/all")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getAllAnswers() {
        return answerList;
    }

    @GetMapping("/magic/history")
    @ResponseStatus(HttpStatus.OK)
    public List<EightBall> getHistory() {
        return questions;
    }
}
