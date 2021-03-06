package edu.ti.caih313.collections.dataobj;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Person {
    public Name name;
    public Gender gender;
    public int age;
    private LocalDate birthDate;
    public EmailAddress emailAddress;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
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

    public Integer getAge() {
        Period ageNow = Period.between(birthDate, LocalDate.now());
        return ageNow.getYears();
    }
    public String getFormattedBday() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy");
        String formattedBday1 = birthDate.format(format);
        String[] temporary = formattedBday1.split(" ");
        return temporary[0] + " " + temporary[1] + ", " + temporary[2] + " CE";
    }


    @Override
    public String toString(){
    return "Person{" +"\n"+
                "name=" + name + "\n"+
                "gender=" + gender + "\n"+
                "age=" + age +"\n"+
                ", birthDate=" + getFormattedBday()+ "\n"+
                "email=" + emailAddress.toString() + "\n"+
                '}';
    }

}