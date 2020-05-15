package edu.ti.caih313.collections.dataobj;

public class Name {
    private  final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) throws IllegalAccessException {
        if (firstName==null||lastName==null){
            throw new IllegalAccessException("Both first name and last name must be specified");
        }
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        return lastName+ ", "+firstName;
    }
}
