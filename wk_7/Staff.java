public class Staff extends Employee {
    private String title;

    public Staff(String newName, String newAddress, String newPhone, String newEmail, String newOffice,
            double newSalary, String newTitle) {
        super(newName, newAddress, newPhone, newEmail, newOffice, newSalary);
        title = newTitle;

    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String newTitle) {
        title = newTitle;

    }

    public String toString() {
        return super.toString() + String.format("\tStaff{title=%s}\n", this.getTitle());
    }
}