package hello;

public class Customer {
    private String name;
    private Integer age;
    private String emailAddress;
    private String phoneNumber;
    private Address address;

    public Customer() {

    }
    public Customer(String name, Integer age, String emailAddress, String phoneNumber, Address address) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}
