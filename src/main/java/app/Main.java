package app;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe");

        Address address = new Address("Bratislava", "Main Street", 12);

        user.setAddress(address);

        user.printAddress();
    }
}
