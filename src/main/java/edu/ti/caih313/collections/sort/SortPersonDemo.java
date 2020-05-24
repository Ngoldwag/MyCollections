package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.EmailAddress;
import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.PersonSortable;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.HOME;
import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class SortPersonDemo {
    public static void main(String... args) {
        Person personArray[] = {
                new Person(new Name("James", "Bond"), MALE, 23),
                new Person(new Name("Jones", "Truman"),MALE , 33),
                new Person(new Name("Donald", "Trump"), MALE, 13),
                new Person(new Name("Michelle", "Obama"), FEMALE,26),
                new Person(new Name("Tracy", "Cooper"), FEMALE,56),
                new Person(new Name("Joe", "Frank"), MALE,32),
                new Person(new Name("Jill", "Jackswife"), FEMALE,43),
                new Person(new Name("Gilly", "Gillis"), FEMALE,23),
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

