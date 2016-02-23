package com.dainiak.test.service;

/**
 * Created by Alan on 23.02.2016.
 */
import java.util.List;

import com.dainiak.test.dao.Person;

public interface PersonService {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public Person getPersonByName(String name);
    public void removePerson(int id);

}
