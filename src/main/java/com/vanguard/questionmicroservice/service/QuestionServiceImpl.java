package com.vanguard.questionmicroservice.service;

import com.vanguard.questionmicroservice.models.Question;
import com.vanguard.questionmicroservice.models.QuestionRequest;
import com.vanguard.questionmicroservice.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl  implements  QuestionService{

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question cresteQuestion(QuestionRequest questionRequest) {

        return questionRepository.save(getQustion(questionRequest));
    }

    public Question getQustion(QuestionRequest questionRequest) {

       return new Question(1l,questionRequest.getQuestion());
    }
}
