package com.example.cassandra.controller;

import com.example.cassandra.model.Person;
import com.example.cassandra.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestEndPoints {
    @Autowired
    PersonRepository personRepository;

    @PostMapping("/person")
    public ResponseEntity<Person> addPerson(@RequestBody  Person person){
        Person p=personRepository.save(person);
        return  ResponseEntity.ok(p);
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") int id){
        Person p=personRepository.findById(id).orElse(null);
        return ResponseEntity.ok().body(p);
    }


    @DeleteMapping("/person/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable("id") int id){
        Person p=personRepository.findById(id).orElse(null);
        String send;
        if(p==null) send= "person not found";
        else {
            personRepository.deleteById(id);
            send = "Deleted";
        }

        return ResponseEntity.ok().body(send);
    }

    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAllPerson(){
        return ResponseEntity.ok().body( personRepository.findAll());
    }
}
