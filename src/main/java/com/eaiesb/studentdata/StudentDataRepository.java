package com.eaiesb.studentdata;

import org.springframework.data.mongodb.repository.MongoRepository; 

public interface StudentDataRepository extends MongoRepository <StudentData, String> { 

}