package com.company.quotedefinitionanswer.controller;

import com.company.quotedefinitionanswer.model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DefinitionController {
    private static int idCounter = 1;

    private static List<Definition> wordList = new ArrayList<>(Arrays.asList(
            new Definition(idCounter++, "solipsism", "a theory holding that the self can know nothing but its own modifications and that the self is the only existent thing"),
            new Definition(idCounter++, "glean", "to gather (something, such as information) bit by bit"),
            new Definition(idCounter++, "didactic", "intended to convey instruction and information as well as pleasure and entertainment"),
            new Definition(idCounter++, "rigmarole", "confused or meaningless talk"),
            new Definition(idCounter++, "loquacious", "tending to talk a great deal"),
            new Definition(idCounter++, "nettle", "to arouse to sharp but transitory annoyance or anger"),
            new Definition(idCounter++, "lymphatic", "lacking physical or mental energy"),
            new Definition(idCounter++, "truculent", "easily annoyed and always ready to argue or fight"),
            new Definition(idCounter++, "blithesome", "with lightheartedness or unconcern"),
            new Definition(idCounter++, "gadfly", "a person who stimulates or annoys other people especially by persistent criticism")
    ));

    @GetMapping("/words")
    @ResponseStatus(HttpStatus.OK)
    public List<Definition> getAllWords() {
        return wordList;
    }

    @GetMapping("/word")
    @ResponseStatus(HttpStatus.OK)
    public Definition getDailyWord() {
        int randomNumber = (int)Math.floor(Math.random() * 10);
        return wordList.get(randomNumber);
    }
}
