package edu.ti.caih313.collections.dataobj;

public class Person {
    private Name name;
    private Gender gender;
    private int age;
    private EmailAddress emailAddress;

    public String getLastName() {
        return name.getLastName();
    }

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, int age, EmailAddress email) {
        this.name = name;
        this.gender = gender;
        this.age=age;
        this.emailAddress = email;
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

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age +
                ", email=" + emailAddress +
                '}';
    }

}