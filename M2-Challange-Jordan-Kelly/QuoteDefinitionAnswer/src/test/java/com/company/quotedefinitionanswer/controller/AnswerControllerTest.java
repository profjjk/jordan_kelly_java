package com.company.quotedefinitionanswer.controller;

import com.company.quotedefinitionanswer.model.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AnswerController.class)
public class AnswerControllerTest {

    @Autowired
    MockMvc mockMvc;

    ObjectMapper mapper = new ObjectMapper();

    private Answer inputAnswer;
    private String inputJson;
    private Answer outputAnswer;
    private String outputJson;

    @Before
    public void setUp() throws Exception {
        inputAnswer = new Answer();
        inputAnswer.setQuestion("Will I get a job with Cognizant?");
        inputJson = mapper.writeValueAsString(inputAnswer);

        outputAnswer = new Answer();
        outputAnswer.setId(1);
        outputAnswer.setQuestion("Will I get a job with Cognizant?");
        outputAnswer.setAnswer("Outlook is good");
        outputJson = mapper.writeValueAsString(outputAnswer);
    }

    @Test
    public void shouldReturnAnswerOnPost() throws Exception {
        mockMvc.perform(post("/magic")
                    .content(inputJson)
                    .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }
}