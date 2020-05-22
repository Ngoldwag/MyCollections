package edu.ti.caih313.collections.dataobj;
import java.util.Map;
import java.util.Objects;

public class EmailAddress {
    public EmailType emailType;
    public String email;
    public static  enum EmailType{ WORK, HOME, SCHOOL};
    private Map<EmailType, String> emailMap;

    public EmailAddress(EmailType emailType, String email){
        this.emailType=emailType;
        this.email=email;
    }
    public Map<EmailType, String> getEmailMap() {
        return emailMap;
    }
    public EmailType getEmailType() {
        return emailType;
    }
    public String getEmail(EmailType emailType) {
        return email;
    }

    public String getPrimaryEmail() {
        if (emailMap.containsKey(HOME)) {
            return emailMap.getEmail(HOME);
        }





    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddress email = (EmailAddress) o;
        return HOME.equals(email.HOME) &&
                WORK.equals(email.WORK)&&
                SCHOOL.equals(email.SCHOOL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HOME, WORK, SCHOOL);
    }

    @Override
    public String toString() {
        return HOME + ", " + WORK + ", " + SCHOOL;
    }
}

