package com.example.javabeanvalidation.service;

import com.example.javabeanvalidation.entity.Person;
import com.example.javabeanvalidation.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public Person getPerson(Long id){
        return personRepository.findById(id).get();
    }


    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }



}
