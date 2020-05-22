package edu.ti.caih313.collections.dataobj;
import java.util.Objects;

public class Email {
   public String HOME;
   public String WORK;
   public String SCHOOL;

    public Email(){
        HOME = "fillerCuzNoEmailGiven";
    }
    public Email(String HOME){
        if (HOME == null) {
            throw new IllegalArgumentException("At lease one email must be specified.");
        }
        this.HOME = HOME;
    }
    public Email(String HOME, String WORK){
        this.HOME = HOME;
        this.WORK = WORK;
    }
    public Email(String HOME, String WORK, String SCHOOL) {
        this.HOME = HOME;
        this.WORK = WORK;
        this.SCHOOL = SCHOOL;
    }

    public String getHomeEmail() {
        return HOME;
    }
    public String getWorkEmail() {
        return WORK;
    }
    public String getSchoolEmail() {
        return SCHOOL;
    }
    public String getPrimaryEmail(){ return HOME; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
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

