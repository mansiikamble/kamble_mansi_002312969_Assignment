/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author mansi kamble
 */
public class Person {
    private String firstName;
    private String lastName;
    
    private int ssn;
    private int age;
    
    private Double salary;
    private Double creditScore;
    
    private Address homeAddress;
    private Address workAddress;
    
    private Date fieldcreationDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getGpa() {
        return salary;
    }

    public void setGpa(Double gpa) {
        this.salary = gpa;
    }

    public Double getWeight() {
        return creditScore;
    }

    public void setWeight(Double weight) {
        this.creditScore = weight;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Date getBirthDate() {
        return fieldcreationDate;
    }

    public void setBirthDate(Date fieldcreationDate) {
        this.fieldcreationDate = fieldcreationDate;
    }
    
    @Override
    public String toString() {
        return firstName;
    }
}
