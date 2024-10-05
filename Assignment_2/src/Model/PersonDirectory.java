/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author mansi kamble
 */
public class PersonDirectory {
    
    private ArrayList<Person> people;
    
    public PersonDirectory() {
        this.people = new ArrayList<Person>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
    
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    
    public Person addPerson() {
        Person person = new Person();
        people.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        people.remove(person);
    }
    
    public Person search(String searchInput) {
        //search code 
        return null;
    }
}
