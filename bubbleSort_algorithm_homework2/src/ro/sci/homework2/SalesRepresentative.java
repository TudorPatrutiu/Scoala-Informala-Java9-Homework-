package ro.sci.homework2;

public class SalesRepresentative {
    //Declaring the needed variables
    private String firstName;
    private String lastName;
    private int numberOfSales;
    private int quota;
    private int revenue = quota * numberOfSales;

    public SalesRepresentative(String firstName, String lastName, int numberOfSales, int quota, int revenue) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.revenue = revenue;
    }

    public SalesRepresentative(SalesRepresentative[] unsortedReps) {

    }

    @Override
    public String toString() {
        return
                firstName + '\'' + " " + lastName + '\'' + " " + numberOfSales + " " + quota + " " + revenue + "\n";
    }


    //Generated getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {

        this.revenue = this.quota * this.numberOfSales;
    }
}



