package edu.ti.caih313.collections.dataobj;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType.HOME;

public class EmailAddress {
    public HashMap<EmailType, String> emailMap;

    public enum EmailType{ WORK, HOME, SCHOOL};

    public String getPrimaryEmail() {
        if (emailMap.containsKey(EmailType.HOME)) {
            return emailMap.get(EmailType.HOME);
        } else if (emailMap.containsKey(EmailType.WORK)) {
            return emailMap.get(EmailType.WORK);
        } else if (emailMap.containsKey(EmailType.SCHOOL)){
            return emailMap.get(EmailType.SCHOOL);
    } else if(emailMap.get(EmailType.HOME)==null&&
                emailMap.get(EmailType.WORK)==null&&
                emailMap.get(EmailType.SCHOOL)==null){
            emailMap.put(HOME, "FillerEmail");
            return emailMap.get(HOME);
        }else
        return "is the primary email address!";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmailAddress email = (EmailAddress) o;
//        return HOME.equals(emailType.HOME) &&
//                WORK.equals(emailType.WORK)&&
//                SCHOOL.equals(emailType.SCHOOL);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(EmailType.HOME, EmailType.WORK, EmailType.SCHOOL);
    }

    @Override
    public String toString() {
        return EmailType.HOME + ", " + EmailType.WORK + ", " + EmailType.SCHOOL;
    }
}

