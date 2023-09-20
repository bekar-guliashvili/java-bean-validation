package com.example.javabeanvalidation.controler;

import com.example.javabeanvalidation.entity.Person;
import com.example.javabeanvalidation.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {


    @Autowired
    private PersonService personService;
    @PostMapping("/save")
    public ResponseEntity<Person> addPerson(@RequestBody @Valid Person person ){
        return new ResponseEntity<>(personService.savePerson(person), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id){
        return ResponseEntity.ok(personService.getPerson(id));
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.getAllPersons());
    }



}
