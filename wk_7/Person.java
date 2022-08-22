public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person() {
    }

    public Person(String newName, String newAddress, String newPhone, String newEmail) {
        name = newName;
        address = newAddress;
        phoneNumber = newPhone;
        emailAddress = newEmail;

    }

    public String getName() {
        return name;

    }

    public String getAddress() {
        return address;

    }

    public String getPhone() {
        return phoneNumber;

    }

    public String getEmail() {
        return emailAddress;

    }

    public void setName(String newName) {
        name = newName;

    }

    public void setAddress(String newAddress) {
        address = newAddress;

    }

    public void setPhone(String newPhone) {
        phoneNumber = newPhone;

    }

    public void setEmail(String newEmail) {
        emailAddress = newEmail;

    }

    public String ShowPersonal() {
        return String.format("%s\nName : %s\nAddress : %s\nPhone : %s\nEmail : %s\n",
                getClass().getSimpleName(), getName(), getAddress(), getPhone(), getEmail());
    }

    public String toString() {
        return ShowPersonal() + String.format("\tPerson{name=%s, address={%s}, phone=%s, email=%s}\n",
                getName(), getAddress(), getPhone(), getEmail());
    }
}