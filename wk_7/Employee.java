import java.util.*;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired = new Date();

    Employee(String newName, String newAddress, String newPhone, String newEmail, String newOffice, double newSalary) {
        super(newName, newAddress, newPhone, newEmail);
        office = newOffice;
        salary = newSalary;
        dateHired = new Date();

    }

    public String getOffice() {
        return office;

    }

    public double getSalary() {
        return salary;

    }

    public Date getDateHired() {
        return dateHired;

    }

    public void setOffice(String newOffice) {
        office = newOffice;

    }

    public void setSalary(double newSalary) {
        salary = newSalary;

    }

    public String toString() {
        return super.toString() + String.format("\tEmployee{office=%s, dateHired={%s}, salary=%.2f}\n",
                getOffice(), getDateHired(), getSalary());
    }

}