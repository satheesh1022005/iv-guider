package com.IV_Guider.ivguider;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StepService {
    @Autowired
    private StepRepository stepRepository;
    public List<Step> AllSteps(){
        return stepRepository.findAll();
    }
    public Optional<Step> singleStep(String step){
        return stepRepository.findStepByStep(step);
    }
}
