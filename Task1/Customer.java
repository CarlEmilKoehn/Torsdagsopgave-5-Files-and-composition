package Task1;

public class Customer {
    static int counter = 0;


    private String firstName;
    private String lastName;
    private String username;
    private int id = counter;


    Customer(String firstName, String lastName,  String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.counter++;
    }

    @Override
    public String toString() {
        String s = "First name: " + firstName + "\n"
                    + "Last name: " + lastName + "\n"
                    + "Username: " + username + "\n"
                    + "User ID: " + id;
        return s;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }

    public void setFirstName(String setName){
        this.firstName = setName;
    }

    public void setLastName(String setName){
        this.lastName = setName;
    }

    public void setUsername(String setName){
        this.username = setName;
    }

    public void setId(int setNum){
        this.id = setNum;
    }

}
