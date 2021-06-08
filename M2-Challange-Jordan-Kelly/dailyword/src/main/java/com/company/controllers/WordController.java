package com.company.controllers;

import com.company.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordController {

    private static int idCounter = 1;

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word(idCounter++, "solipsism", "a theory holding that the self can know nothing but its own modifications and that the self is the only existent thing"),
            new Word(idCounter++, "glean", "to gather (something, such as information) bit by bit"),
            new Word(idCounter++, "didactic", "intended to convey instruction and information as well as pleasure and entertainment"),
            new Word(idCounter++, "rigmarole", "confused or meaningless talk"),
            new Word(idCounter++, "anfractuous", "full of windings and intricate turnings"),
            new Word(idCounter++, "nettle", "to arouse to sharp but transitory annoyance or anger"),
            new Word(idCounter++, "lymphatic", "lacking physical or mental energy"),
            new Word(idCounter++, "flotilla", "a fleet of ships or boats"),
            new Word(idCounter++, "blithesome", "with lightheartedness or unconcern"),
            new Word(idCounter++, "gadfly", "a person who stimulates or annoys other people especially by persistent criticism")
    ));

    @GetMapping("/words")
    @ResponseStatus(HttpStatus.OK)
    public List<Word> getAllWords() {
        return wordList;
    }

    @GetMapping("/word")
    @ResponseStatus(HttpStatus.OK)
    public Word getDailyWord() {
        int randomNumber = (int)Math.floor(Math.random() * 10);
        return wordList.get(randomNumber);
    }
}
