package edu.ti.caih313.collections.dataobj;

import java.util.HashMap;
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

    StringBuilder emailAddresses = new StringBuilder("");
    @Override
    public String toString() {
        //if all 3 are given
        if ((emailMap.containsKey(EmailType.HOME)) && (emailMap.containsKey(EmailType.WORK)) && (emailMap.containsKey(EmailType.SCHOOL))) {
            emailAddresses.append("<HOME:");
            emailAddresses.append(emailMap.get(EmailType.HOME));
            emailAddresses.append( ", WORK:").append(emailMap.get(EmailType.WORK));
            emailAddresses.append(", SCHOOL:").append(emailMap.get(EmailType.SCHOOL)).append(">");
        }
        //if home and work
        else if ((emailMap.get(EmailType.SCHOOL)==null) &&(emailMap.containsKey(EmailType.HOME)) && (emailMap.containsKey(EmailType.WORK))) {
            emailAddresses.append("<HOME:");
            emailAddresses.append(emailMap.get(EmailType.HOME));
            emailAddresses.append( ", WORK:").append(emailMap.get(EmailType.WORK)).append(">");        }
        //if home and school
        else if ((emailMap.get(EmailType.WORK)==null)&&(emailMap.containsKey(EmailType.HOME)) && (emailMap.containsKey(EmailType.SCHOOL))) {
            emailAddresses.append("<HOME:");
            emailAddresses.append(emailMap.get(EmailType.HOME));
            emailAddresses.append( ", SCHOOL:").append(emailMap.get(EmailType.SCHOOL)).append(">");         }
        //if work and school
        else if ((emailMap.get(EmailType.HOME)==null)&&(emailMap.containsKey(EmailType.WORK)) && (emailMap.containsKey(EmailType.SCHOOL))) {
            emailAddresses.append("<WORK:");
            emailAddresses.append(emailMap.get(EmailType.WORK));
            emailAddresses.append( ", SCHOOL:").append(emailMap.get(EmailType.SCHOOL)).append(">");        }
        //if just home
        else if ((emailMap.containsKey(EmailType.HOME)) && (emailMap.get(EmailType.WORK)==null) && (emailMap.get(EmailType.SCHOOL)==null)) {
            emailAddresses.append("<HOME:");
            emailAddresses.append(emailMap.get(EmailType.HOME)).append(">");        }
        //if just work
        else if ((emailMap.containsKey(EmailType.WORK)) && (emailMap.get(EmailType.HOME)==null) && (emailMap.get(EmailType.SCHOOL)==null)) {
            emailAddresses.append("<WORK:");
            emailAddresses.append(emailMap.get(EmailType.WORK)).append(">");        }
        //if just school
        else if ((emailMap.containsKey(EmailType.SCHOOL)) && (emailMap.get(EmailType.HOME)==null) && (emailMap.get(EmailType.WORK)==null)) {
            emailAddresses.append("<SCHOOL:");
            emailAddresses.append(emailMap.get(EmailType.SCHOOL)).append(">");        }
        //if no emails are given
         else if(emailMap.get(EmailType.HOME)==null&&
                emailMap.get(EmailType.WORK)==null&&
                emailMap.get(EmailType.SCHOOL)==null){
            emailAddresses.append("<no email address available>");
        }
        return emailAddresses.toString();

    }
    @Override
    public int hashCode() {
        return Objects.hash(EmailType.HOME, EmailType.WORK, EmailType.SCHOOL);
    }



}

