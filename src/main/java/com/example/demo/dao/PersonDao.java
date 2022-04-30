package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    // interface = a template can be applied to class. similiar to inhirentance , but specifies what a class has must do .
    // classes can apply more than one interface inheretance is limited to 1 super
    int insertPerson(UUID id , Person person);
    default  int insertPerson (Person person){
        UUID id = UUID.randomUUID();
        return  insertPerson( id, person);
    }
}
