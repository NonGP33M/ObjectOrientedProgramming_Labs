public class Student extends Person {
    private String STATUS[] = { "Freshman", "Sophomore", "Junior", "Senior" };
    private int status = 0;

    Student() {
    }

    Student(String newName, String newAddress, String newPhone, String newEmail, int newStatus) {
        super(newName, newAddress, newPhone, newEmail);
        status = newStatus;

    }

    public void setStatus(int newStatus) {
        status = newStatus;

    }

    public String getStatus() {
        return STATUS[status];

    }

    public String toString() {
        return super.toString() + String.format("\tStudent{status=%s}\n", this.getStatus());

    }
}