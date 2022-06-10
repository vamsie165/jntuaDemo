package com.eaiesb.studentdata; 

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.validation.annotation.Validated; 

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

@CrossOrigin
@RequestMapping("/api/v1")
@Tag(name = "studentData")
@RestController
public class StudentDataController {

     @Autowired
     private StudentDataRepository studentDataRepository; 

     @GetMapping("/studentData")
     public List<StudentData> getAllStudentData() {
            return studentDataRepository.findAll();
     }

     @GetMapping("/studentData/{id}")
     public Optional<StudentData> getStudentDataById(@PathVariable String id) {
            return studentDataRepository.findById(id);
     }

     @PostMapping("/studentData")
     public StudentData createStudentData(@Valid @RequestBody StudentData studentData) {
            return studentDataRepository.save(studentData);
     }

     @PutMapping("/studentData/{id}")
     public StudentData updateStudentDataById(@PathVariable String id, @Validated @RequestBody StudentData studentData) {
            studentData.set_id(id);
             return studentDataRepository.save(studentData);
     }

     @DeleteMapping("/studentData/{id}")
     public void deleteStudentDataById(@PathVariable String id) {
            studentDataRepository.deleteById(id);
     }

}

