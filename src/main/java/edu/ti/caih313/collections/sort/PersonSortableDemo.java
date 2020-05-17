package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.NameByLast;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.PersonSortable;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;

public class PersonSortableDemo {
        public static void main(String... args) {
        PersonSortable personArray[] = {
                new PersonSortable(new Name("James", "Bond"), MALE, 23),
                new PersonSortable(new Name("Jones", "Truman"),MALE , 33),
                new PersonSortable(new Name("Donald", "Trump"), MALE, 13),
                new PersonSortable(new Name("Michelle", "Obama"), FEMALE,26),
                new PersonSortable(new Name("Tracy", "Cooper"), FEMALE,56),
                new PersonSortable(new Name("Joe", "Frank"), MALE,32),
                new PersonSortable(new Name("Jill", "Jackswife"), FEMALE,43),
                new PersonSortable(new Name("Gilly", "Gillis"), FEMALE,23)
        };

        List<PersonSortable> personList = Arrays.asList(personArray);
        PrintGeneric<PersonSortable> personSortDemo = new PrintGeneric<>();
        personSortDemo.printCollection(personList);
        Comparator<PersonSortable> compareAgeGenderName= new Comparator<PersonSortable>() {
                @Override
                public int compare(PersonSortable p1, PersonSortable p2) {
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
