package edu.ti.caih313.collections.dataobj;

public class Person {
    private Name name;
    private Gender gender;
    private int age;
    //private String emailAddress;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age=age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}