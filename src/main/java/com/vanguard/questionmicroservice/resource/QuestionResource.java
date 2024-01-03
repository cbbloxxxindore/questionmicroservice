package com.vanguard.questionmicroservice.resource;

import com.vanguard.questionmicroservice.models.Question;
import com.vanguard.questionmicroservice.models.QuestionRequest;
import com.vanguard.questionmicroservice.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questions")
public class QuestionResource {

    private QuestionService questionService;

    public QuestionResource(QuestionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping("/saveQuestion")
    public ResponseEntity<Question> createQuestion(@RequestBody  QuestionRequest questionRequest)
    {
        Question question = questionService.cresteQuestion(questionRequest);
        return  new ResponseEntity<Question>(question, HttpStatus.CREATED);
    }
}
