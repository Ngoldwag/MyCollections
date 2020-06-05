
package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.*;
import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;

public class PersonTest {




    @Test
    public void testToString() {
        Person michelleObama = new Person(new Name("Michelle", "Obama"), FEMALE,26);
        michelleObama.EmailAddress(HOME, "michelle.obama@theWhiteHouse");
        michelleObama.EmailAddress(WORK, "michelle.obama@workWorkWork");
        michelleObama.EmailAddress(SCHOOL, "michelle.obama@ti.htc.edu");
        System.out.println(michelleObama.toString());
    }
}