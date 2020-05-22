package edu.ti.caih313.collections.aggregate;

import edu.ti.caih313.collections.dataobj.EmailAddress;
import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.util.*;

import static edu.ti.caih313.collections.dataobj.Person.Gender.*;

public class AgeAndGenderFilter {
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


        System.out.print("\n");
        System.out.println("The youngest female");
        Arrays.stream(personArray)
                .filter(p -> p.getGender() == FEMALE)
                .sorted((p1, p2) -> (p1.getAge() - p2.getAge()))
                .limit(1).forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        System.out.println("The oldest male");
        Arrays.stream(personArray)
                .filter(p -> p.getGender() == MALE)
                .sorted((p1, p2) -> (p2.getAge() - p1.getAge()))
                .limit(1).forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        System.out.println("All distinct last names of persons");
        Arrays.stream(personArray)
                .map(p -> p.getName().getLastName())
                .distinct()
                .forEach(p -> System.out.println(p));



        System.out.print("\n");
        System.out.println("Histogram of last names");
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        Map<Integer, Integer> frequency = new HashMap();
        Arrays.stream(personArray)
                .map(input -> input.getName().getLastName())

        while(input!=0) {
            histogram.put(input, 1);
            if (frequency.containsKey(input)) {
                increment(frequency, input);
                increment(histogram, input);
            } else {
                frequency.put(input, 1);
            }
        }
        .forEach(p -> System.out.println(frequency))
        public static<K> void increment(Map<K, Integer> map, K key) {
            map.put(key, map.get(key) + 1);
        }

}
