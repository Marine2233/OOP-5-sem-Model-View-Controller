package model;

public abstract class User {
    private String fName;
    private String name;
    private String lastName;
    
    
    public User(String fName, String name, String lastName) {
        this.fName = fName;
        this.name = name;
        this.lastName = lastName;
    }
    public String getfName() {
        return fName;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return "User [fName=" + fName + ", name=" + name + ", lastName=" + lastName + "]";
    }
}
