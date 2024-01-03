package com.vanguard.questionmicroservice.service;

import com.vanguard.questionmicroservice.models.Question;
import com.vanguard.questionmicroservice.models.QuestionRequest;

public interface QuestionService {
    Question cresteQuestion(QuestionRequest questionRequest);

}
