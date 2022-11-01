package org.example.dao;

import org.example.etity.Person;


public interface PersonDao {

    void createTables();

    void savePerson(Person person);

    void deletePersonById(Long id);




}
