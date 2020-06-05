package edu.ti.caih313.collections.aggregate;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Stream;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.HOME;
import static edu.ti.caih313.collections.dataobj.Person.Gender.*;

public class AgeAndGenderFilter {
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
        System.out.println("Histogram of last names is ");
        Stream<String> lastNames = Arrays.stream(personArray)
                .map(p -> p.getName().getLastName());

        ArrayList<String> lastNamesArray = new ArrayList<String>();

        lastNames.forEach(p -> lastNamesArray.add(p));

        HashMap<String, Integer> histogramFamMembers = new HashMap<>();

        for(int i=0;i<lastNamesArray.size();i++) {
            if (histogramFamMembers.containsKey(lastNamesArray.get(i))){
                histogramFamMembers.put(lastNamesArray.get(i), histogramFamMembers.get(lastNamesArray.get(i))+1);
            }else{
                histogramFamMembers.put(lastNamesArray.get(i),1);
            }
        }
        System.out.println(histogramFamMembers);

}}
