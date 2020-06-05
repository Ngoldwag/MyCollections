
package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.HOME;
import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static org.junit.Assert.assertEquals;

public class PersonTest {


    @Test
    public void testToStringInPerson() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
        michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
        assertEquals("Person{" +"\n"+
                "name=Obama, Michelle\ngender=FEMALE\nage=0\n, birthDate=2003-05-13\nemail=<HOME:michelle.obama@theWhiteHouse>\n}"
        ,michelleObama.toString());

    }

    @Test
    public void testToGetAgeFromBirthDate() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
        int michellesAge = michelleObama.getAge();
        assertEquals(17,michellesAge );
    }
    @Test
    public void testToGetFormattedBirthday() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
        michelleObama.getFormattedBday();
    }

}