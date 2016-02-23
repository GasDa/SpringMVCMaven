package com.dainiak.test.dao;

/**
 * Created by Alan on 23.02.2016.
 */
import java.util.List;

public interface PersonDAO {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public Person getPersonByName(String name);
    public void removePerson(int id);
}
