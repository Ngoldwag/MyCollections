package edu.ti.caih313.collections.aggregate;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.util.*;
import java.util.stream.Stream;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.HOME;
import static edu.ti.caih313.collections.dataobj.Person.Gender.*;

public class AgeAndGenderFilter {
    public static void main(String... args) {

        Person jamesFrank = new Person(new Name("James", "Frank"), MALE, 23);
        jamesFrank.EmailAddress(SCHOOL, "james.frank@ti.htc.edu");
        jamesFrank.EmailAddress(WORK, "james.frank@work");

        Person jonesSmith = new Person(new Name("Jones", "Smith"), MALE, 33);
        jonesSmith.EmailAddress(SCHOOL, "jones.smith@ti.htc.edu");
        jonesSmith.EmailAddress(HOME, "jones.smith@work");

        Person donaldTrump = new Person(new Name("Donald", "Trump"), MALE, 13);
        donaldTrump.EmailAddress(HOME, "donald.trump@theWhiteHouse");
        donaldTrump.EmailAddress(WORK, "donald.trump@workWorkWork");

        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, 26);
        michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
        michelleObama.EmailAddress(WORK, "michelle.obama@workWorkWork");
        michelleObama.EmailAddress(SCHOOL, "michelle.obama@ti.htc.edu");


        Person tracyCooman = new Person(new Name("Tracy", "Cooman"), FEMALE, 56);
        tracyCooman.EmailAddress(HOME, "tracy.Cooman@myHouse");
        tracyCooman.EmailAddress(WORK, "tracy.Cooman@workWorkWork");
        tracyCooman.EmailAddress(SCHOOL, "tracy.Cooman@ti.htc.edu");

        Person joeFrank = new Person(new Name("Joe", "Frank"), MALE, 26);
        joeFrank.EmailAddress(HOME, "joeFrank@myHouse");
        joeFrank.EmailAddress(WORK, "joeFrank@workWorkWork");
        joeFrank.EmailAddress(SCHOOL, "joeFrank@ti.htc.edu");

        Person jillJacksWife = new Person(new Name("Jill", "JacksWife"), FEMALE, 206);
        jillJacksWife.EmailAddress(HOME, "jillJacksWife@myHouse");
        jillJacksWife.EmailAddress(WORK, "jillJacksWife@workWorkWork");
        jillJacksWife.EmailAddress(SCHOOL, "jillJacksWife@ti.htc.edu");

        Person GillySmith = new Person(new Name("Gilly", "Smith"), FEMALE, 26);
        GillySmith.EmailAddress(HOME, "GillyGillis@myHouse");
        GillySmith.EmailAddress(WORK, "GillyGillis@workWorkWork");
        GillySmith.EmailAddress(SCHOOL, "GillyGillis@ti.htc.edu");

        Person personArray[] = {jamesFrank, jonesSmith, donaldTrump, michelleObama, tracyCooman, joeFrank, jillJacksWife, GillySmith};

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
