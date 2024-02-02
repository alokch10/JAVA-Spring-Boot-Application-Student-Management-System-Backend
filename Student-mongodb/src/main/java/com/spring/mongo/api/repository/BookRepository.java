package com.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Student;

public interface BookRepository extends MongoRepository<Student, Integer>{

}
