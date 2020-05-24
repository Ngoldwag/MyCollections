package edu.ti.caih313.collections.aggregate;

import edu.ti.caih313.collections.dataobj.EmailAddress;
import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.HOME;
import static edu.ti.caih313.collections.dataobj.Person.Gender.*;

public class PeopleFilterDemo {
    public static void main(String... args) {

        Person jamesBond = new Person(new Name("James", "Bond"), MALE, 23);
        jamesBond.EmailAddress(SCHOOL, "james.bond@ti.htc.edu");
        jamesBond.EmailAddress(WORK, "james.bond@work");

        Person jonesTruman= new Person(new Name("Jones", "Truman"),MALE , 33);
        jonesTruman.EmailAddress(SCHOOL, "jones.truman@ti.htc.edu");
        jonesTruman.EmailAddress(HOME, "jones.truman@work");

        Person donaldTrump = new Person(new Name("Donald", "Trump"), MALE, 13);
        donaldTrump.EmailAddress(HOME, "donald.trump@theWhiteHouse");
        donaldTrump.EmailAddress(WORK, "donald.trump@workWorkWork");

        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE,26);
        michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
        michelleObama.EmailAddress(WORK, "michelle.obama@workWorkWork");
        michelleObama.EmailAddress(SCHOOL, "michelle.obama@ti.htc.edu");


        Person tracyCooman = new Person(new Name("Tracy", "Cooman"), FEMALE,56);
        tracyCooman.EmailAddress(HOME, "tracy.Cooman@myHouse");
        tracyCooman.EmailAddress(WORK, "tracy.Cooman@workWorkWork");
        tracyCooman.EmailAddress(SCHOOL, "tracy.Cooman@ti.htc.edu");

        Person joeFrank = new Person(new Name("Joe", "Fraank"), MALE,26);
        joeFrank.EmailAddress(HOME, "joeFrank@myHouse");
        joeFrank.EmailAddress(WORK, "joeFrank@workWorkWork");
        joeFrank.EmailAddress(SCHOOL, "joeFrank@ti.htc.edu");

        Person jillJacksWife = new Person(new Name("Jill", "JacksWife"), FEMALE,206);
        jillJacksWife.EmailAddress(HOME, "jillJacksWife@myHouse");
        jillJacksWife.EmailAddress(WORK, "jillJacksWife@workWorkWork");
        jillJacksWife.EmailAddress(SCHOOL, "jillJacksWife@ti.htc.edu");

        Person GillyGillis = new Person(new Name("Gilly", "Gillis"), FEMALE,26);
        GillyGillis.EmailAddress(HOME, "GillyGillis@myHouse");
        GillyGillis.EmailAddress(WORK, "GillyGillis@workWorkWork");
        GillyGillis.EmailAddress(SCHOOL, "GillyGillis@ti.htc.edu");

        Person personArray[] = {jamesBond,jonesTruman,donaldTrump,michelleObama,tracyCooman,joeFrank,jillJacksWife,GillyGillis};

        System.out.println("All persons");
        Arrays.stream(personArray).forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        long numOver20 = Arrays.stream(personArray).filter(p -> p.getAge() > 20).count();
        System.out.println("Number of persons older than 20: " + numOver20);

        System.out.print("\n");
        System.out.println("All persons older than 20");
        Arrays.stream(personArray)
                .filter(p -> p.getAge()>20)
                .forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        System.out.println("All " + MALE + " persons");
        Arrays.stream(personArray)
                .filter(p -> p.getGender()==MALE)
                .forEach(p -> System.out.println(p.getName()));

        System.out.print("\n");
        System.out.println("All emails for people over the age of 20:");
        Arrays.stream(personArray)
                .filter(p -> p.getAge()>20)
                .forEach(p -> System.out.println(p.getEmailMap()));

        System.out.print("\n");
        System.out.println("All school emails" );
        Arrays.stream(personArray)
                .forEach(e -> System.out.println(e.getEmailMap().get(EmailAddress.EmailType.SCHOOL)));


        System.out.print("\n");
        OptionalDouble averageFemaleAge =
                Arrays.stream(personArray)
                .filter(p -> p.getGender()==FEMALE)
                .mapToInt(Person::getAge) // <=> mapToInt(p -> p.getAge())
                .average();
        if (averageFemaleAge.isPresent()) {
            System.out.println("Average age of  "
                    + FEMALE + " persons = "
                    + averageFemaleAge.getAsDouble());
        } else {
            System.out.println("Average age of  "
                    + FEMALE + " persons is not available.");
        }


        System.out.print("\n");
        System.out.println("All persons in age order");
        Arrays.stream(personArray)
                .sorted((p1,p2) -> (p1.getAge() - p2.getAge()))
                .forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        System.out.println("First four last names uppercases.");
        Stream<String> fourLastNamesUpperStream =
                Arrays.stream(personArray)
                .map(p -> p.getName().getLastName().toUpperCase())
                .sorted()
                .limit(4);
        fourLastNamesUpperStream.forEach(s -> System.out.print(s + ", "));
    }
}
