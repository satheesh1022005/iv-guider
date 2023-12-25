package com.IV_Guider.ivguider;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "steps")
public class Step {
        @Id
        private ObjectId id;
        private String step;
        private String title;
        private List<Details> details;


}
