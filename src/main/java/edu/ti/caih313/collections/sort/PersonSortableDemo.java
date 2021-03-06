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

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class PersonSortableDemo {
        public static void main(String... args) {

                Person jamesBond = new Person(new Name("James", "Bond"), MALE, LocalDate.of(1978, Month.MARCH, 15));
                jamesBond.EmailAddress(SCHOOL, "james.bond@ti.htc.edu");
                jamesBond.EmailAddress(WORK, "james.bond@work");

                Person jonesTruman= new Person(new Name("Jones", "Truman"),MALE , LocalDate.of(1948, Month.JANUARY, 3));
                jonesTruman.EmailAddress(SCHOOL, "jones.truman@ti.htc.edu");
                jonesTruman.EmailAddress(HOME, "jones.truman@work");

                Person donaldTrump = new Person(new Name("Donald", "Trump"), MALE, LocalDate.of(1998, Month.MAY, 13));
                donaldTrump.EmailAddress(HOME, "donald.trump@theWhiteHouse");
                donaldTrump.EmailAddress(WORK, "donald.trump@workWorkWork");

                Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
                michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
                michelleObama.EmailAddress(WORK, "michelle.obama@workWorkWork");
                michelleObama.EmailAddress(SCHOOL, "michelle.obama@ti.htc.edu");


                Person tracyCooman = new Person(new Name("Tracy", "Cooman"), FEMALE, LocalDate.of(2007, Month.APRIL, 1));
                tracyCooman.EmailAddress(HOME, "tracy.Cooman@myHouse");
                tracyCooman.EmailAddress(WORK, "tracy.Cooman@workWorkWork");
                tracyCooman.EmailAddress(SCHOOL, "tracy.Cooman@ti.htc.edu");

                Person joeFrank = new Person(new Name("Joe", "Fraank"), MALE,LocalDate.of(1993, Month.OCTOBER, 30));
                joeFrank.EmailAddress(HOME, "joeFrank@myHouse");
                joeFrank.EmailAddress(WORK, "joeFrank@workWorkWork");
                joeFrank.EmailAddress(SCHOOL, "joeFrank@ti.htc.edu");

                Person jillJacksWife = new Person(new Name("Jill", "JacksWife"), FEMALE,LocalDate.of(1968, Month.JULY, 16));
                jillJacksWife.EmailAddress(HOME, "jillJacksWife@myHouse");
                jillJacksWife.EmailAddress(WORK, "jillJacksWife@workWorkWork");
                jillJacksWife.EmailAddress(SCHOOL, "jillJacksWife@ti.htc.edu");

                Person GillyGillis = new Person(new Name("Gilly", "Gillis"), FEMALE,LocalDate.of(1624, Month.FEBRUARY, 23));
                GillyGillis.EmailAddress(HOME, "GillyGillis@myHouse");
                GillyGillis.EmailAddress(WORK, "GillyGillis@workWorkWork");
                GillyGillis.EmailAddress(SCHOOL, "GillyGillis@ti.htc.edu");

                Person personArray[] = {jamesBond,jonesTruman,donaldTrump,michelleObama,tracyCooman,joeFrank,jillJacksWife,GillyGillis};



        List<Person> personList = Arrays.asList(personArray);
        PrintGeneric<Person> personSortDemo = new PrintGeneric<>();
        personSortDemo.printCollection(personList);
        Comparator<Person> compareAgeGenderName= new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
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
        Collections.sort(personList, compareAgeGenderName);
        System.out.print("\n");
        System.out.println("Print sorted by age, gender and name. printed sorted personList.");
                personSortDemo.printCollection(personList);
    }
}
