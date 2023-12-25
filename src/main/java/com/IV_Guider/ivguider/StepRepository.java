package com.IV_Guider.ivguider;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StepRepository extends MongoRepository<Step, ObjectId> {
    Optional<Step> findStepByStep(String step);
}
