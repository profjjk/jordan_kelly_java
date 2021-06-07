package com.company.controllers;

import com.company.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(idCounter++,"Seneca", "We suffer more in imagination than in reality."),
            new Quote(idCounter++,"Epictetus", "Don't explain your philosophy. Embody it."),
            new Quote(idCounter++,"Viktor Frankl", "When we are no longer able to change a situation, we are challenged to change ourselves."),
            new Quote(idCounter++,"Marcus Aurelius", "Be tolerant with others and strict with yourself."),
            new Quote(idCounter++,"Anais Nin", "Life shrinks or expands in proportion to one's courage."),
            new Quote(idCounter++,"Abraham Lincoln", "Give me six hours to chop down a tree and I will spend the first four sharpening the axe."),
            new Quote(idCounter++,"Miguel de Cervantes", "Diligence is the mother of good fortune, and idleness, its opposite, never led to good intention's goal."),
            new Quote(idCounter++,"Florence Nightingale", "I attribute my success to this: I never gave nor took any excuse."),
            new Quote(idCounter++,"Jocko Willink", "Discipline equals freedom."),
            new Quote(idCounter++,"Herbert Simon", "A wealth of information creates a poverty of attention.")
    ));

    @GetMapping("/quotes")
    @ResponseStatus(HttpStatus.OK)
    public List<Quote> getAllQuotes() {
        return quoteList;
    }

    @GetMapping("/quote")
    @ResponseStatus(HttpStatus.OK)
    public Quote getDailyQuote() {
        int randomNumber = (int)Math.floor(Math.random() * 10);
        return quoteList.get(randomNumber);
    }
}
