package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.EmailAddress;
import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class SortPersonDemo {
    public static void main(String... args) {
        Person personArray[] = {
                new Person(new Name("John", "Smith"), MALE, 42, new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Karl", "Ng"), MALE, 73,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Jeff", "Smith"), MALE, 21,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Tom", "Rich"), MALE, 18,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Bob", "Smith"), MALE, 13,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Jane", "Doe"), FEMALE, 27,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Tony", "Stark"), MALE, 52,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com")),
                new Person(new Name("Bo", "Peep"), FEMALE, 205,new EmailAddress("Homeemail@example.com", "workemail@exxample.com", "schoolemail@example.com"))
        };


        List<Person> personList = Arrays.asList(personArray);
        PrintGeneric<Person> nameSortDemo = new PrintGeneric<>();
        nameSortDemo.printCollection(personList);

        Comparator<Person> sortPersonListComparator = new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                int compare;
                if(p1.getAge() == p2.getAge()) {
                compare = 0;
            }else if(p1.getAge()>p2.getAge()){
                compare = -1;
            }else{compare=1;}
                                if(compare == 0){
                if(p1.getGender()==p2.getGender()){
                    compare=0;
                }else if(p1.getGender().toString().equalsIgnoreCase("Male")){
                    compare = 1;
                }else{compare = -1;}
                return compare;}
                                if (compare == 0){
                compare=p1.getName().toString().compareTo(p2.getName().toString());
            }
                                return compare;
        }

    };
        Collections.sort(personList, sortPersonListComparator);
        System.out.print("\n");
        System.out.println("Print sorted age and gender list now sorted by name and nameList.");
        nameSortDemo.printCollection(personList);

    }
}

