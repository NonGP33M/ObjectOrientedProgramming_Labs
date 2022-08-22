public class Pro3_64010683 {
    public static void main(String[] args) {
        Person person = new Person("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
                "somsak@mymail.com");
        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
                "somsak@mymail.com", 2);
        Employee employee = new Employee("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
                "somsak@mymail.com", "OFFICE", 5000);
        Faculty faculty = new Faculty("Somsak", "1 Chalxongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
                "somsak@mymail.com", "OFFICE", 5000, 6, "Assistant Professor");
        Staff staff = new Staff("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789",
                "somsak@mymail.com", "OFFICE", 5000, "Security Guard");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
