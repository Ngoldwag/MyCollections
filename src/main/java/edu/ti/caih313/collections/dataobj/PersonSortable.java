package edu.ti.caih313.collections.dataobj;

import java.time.LocalDate;

public class PersonSortable extends Person implements Comparable<PersonSortable> {
    public PersonSortable(Name name, Gender gender, LocalDate birthDate, EmailAddress email) {
        super(name, gender, birthDate);
    }

    @Override
    public int compareTo(PersonSortable otherPersonSortable) {
        int compare;
        if (getAge() == otherPersonSortable.getAge()) {
            compare = 0;
        } else if (getAge() > otherPersonSortable.getAge()) {
            compare = -1;
        } else {
            compare = 1;
        }
        if (compare == 0) {
            if (getGender() == otherPersonSortable.getGender()) {
                compare = 0;
            } else if (getGender().toString().equalsIgnoreCase("Male")) {
                compare = 1;
            } else {
                compare = -1;
            }
        }
        if (compare == 0) {
            compare = getName().toString().compareTo(otherPersonSortable.getName().toString());
        }
        return compare;
    }
}


