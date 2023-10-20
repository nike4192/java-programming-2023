package tests.test3.book;

public class Publisher {
    private String name;
    private String country;
    private String city;
    private String ISSN;

    public Publisher(String name, String country, String city, String ISSN) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.ISSN = ISSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
