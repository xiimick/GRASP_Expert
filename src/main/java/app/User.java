package app;

public class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAddress() {
        if (address != null) {
            System.out.println("User's address: " + address.toString());
        } else {
            System.out.println("Address not set.");
        }
    }
}