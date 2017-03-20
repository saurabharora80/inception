package hello;

public class Address {
    private String lineOne;
    private String lineTwo;
    private String city;
    private String postcode;

    public Address() {}

    public Address(String lineOne, String lineTwo, String city, String postcode) {
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.postcode = postcode;
    }

    public String getLineOne() {
        return lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
