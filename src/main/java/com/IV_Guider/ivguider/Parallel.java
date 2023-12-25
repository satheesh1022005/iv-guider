package com.IV_Guider.ivguider;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parallel {
        @Id
        private ObjectId id;
        private String sub_sub_step;
        private String title;
        private String description;

}
