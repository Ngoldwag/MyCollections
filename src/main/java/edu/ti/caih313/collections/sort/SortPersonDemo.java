package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class SortPersonDemo {
    public static void main(String... args) {
        Person personArray[] = {
                new Person(new Name("James", "Bond"), MALE, LocalDate.of(1978, Month.MARCH, 15)),
                new Person(new Name("Jones", "Truman"),MALE , LocalDate.of(1988, Month.MAY, 15)),
                new Person(new Name("Donald", "Trump"), MALE, LocalDate.of(1878, Month.OCTOBER, 15)),
                new Person(new Name("Michelle", "Obama"), FEMALE,LocalDate.of(1978, Month.NOVEMBER, 15)),
                new Person(new Name("Tracy", "Cooper"), FEMALE,LocalDate.of(1973, Month.MARCH, 15)),
                new Person(new Name("Joe", "Frank"), MALE,LocalDate.of(1948, Month.FEBRUARY, 15)),
                new Person(new Name("Jill", "Jackswife"), FEMALE,LocalDate.of(1976, Month.DECEMBER, 15)),
                new Person(new Name("Gilly", "Gillis"), FEMALE,LocalDate.of(1993, Month.SEPTEMBER, 15)),
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

