package com.IV_Guider.ivguider;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/steps")
@CrossOrigin(origins = "http://localhost:3000")
public class StepController {
    @Autowired
    private StepService stepService;
    @GetMapping
    public ResponseEntity<List<Step>> Steps(){
        return new ResponseEntity<List<Step>>(stepService.AllSteps(),HttpStatus.OK);
    }
    @GetMapping("/{step}")
    public ResponseEntity<Optional<Step>> getSingleStep(@PathVariable String step){
        return new ResponseEntity<Optional<Step>>(stepService.singleStep(step),HttpStatus.OK);
    }
}
