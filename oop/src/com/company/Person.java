package com.company;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private LocalDate birthday;

    public Person() {
    }

    //TODO
    public Boolean isAdult(int age)
    {
        if(age >= 18) {
            return true;
        }
        else
        {
            System.out.println("Age < 18");
            return false;
        }
    }

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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
