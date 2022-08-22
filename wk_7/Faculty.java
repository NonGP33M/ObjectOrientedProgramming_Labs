public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String newName, String newAddress, String newPhone, String newEmail, String newOffice,
            double newSalary,
            int newOfficeHours, String newRank) {
        super(newName, newAddress, newPhone, newEmail, newOffice, newSalary);
        officeHours = newOfficeHours;
        rank = newRank;

    }

    public int getOfficeHours() {
        return officeHours;

    }

    public String getRank() {
        return rank;

    }

    public void setOfficeHours(int newHours) {
        officeHours = newHours;

    }

    public void setRank(String newRank) {
        rank = newRank;

    }

    public String toString() {
        return super.toString() + String.format("\tFaculty{officeHours=%d, rank=%s}\n",
                getOfficeHours(), getRank());

    }
}