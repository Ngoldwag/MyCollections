package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static org.junit.Assert.*;

public class EmailAddressTest {

    @Test
    public void getEmailAddressWhenThereAreThree() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
        michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
        michelleObama.EmailAddress(WORK, "michelle.obama@workWorkWork");
        michelleObama.EmailAddress(SCHOOL, "michelle.obama@ti.htc.edu");
        assertEquals("<HOME:michelle.obama@theWhiteHouse, WORK:michelle.obama@workWorkWork, SCHOOL:michelle.obama@ti.htc.edu>",michelleObama.emailAddress.toString());
    }

    @Test
    public void getEmailAddressWhenThereIsOne() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
        michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
        assertEquals("<HOME:michelle.obama@theWhiteHouse>",michelleObama.emailAddress.toString());
    }

    @Test
    public void testGetEmailAddressWhenThereAreNone() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE, LocalDate.of(2003, Month.MAY, 13));
        assertEquals("<no email address available>",michelleObama.emailAddress.toString());
    }
}