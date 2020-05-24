package edu.ti.caih313.collections.dataobj;

import java.util.HashMap;

public class Person {
    public Name name;
    public Gender gender;
    public int age;
    public EmailAddress emailAddress;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age=age;
        emailAddress = new EmailAddress();
        emailAddress.emailMap = new HashMap<EmailAddress.EmailType, String>();
    }

    public String getLastName() {
        return name.getLastName();
    }

    public void EmailAddress(EmailAddress.EmailType emailType, String string ){
        emailAddress.emailMap.put(emailType, string); }

   public HashMap<EmailAddress.EmailType, String> getEmailMap(){
        return emailAddress.emailMap;
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





    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age +
                ", email=" + emailAddress.emailMap +
                '}';
    }

}