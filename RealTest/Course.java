public class Course {
    private String courseName;
    private int numberOfStudents;
    private String[] students = new String[100];

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        String[] temp = new String[numberOfStudents];
        System.arraycopy(students, 0, temp, 0, numberOfStudents);
        numberOfStudents++;
        students = new String[numberOfStudents];
        students[numberOfStudents - 1] = student;
        System.arraycopy(temp, 0, students, 0, numberOfStudents - 1);
        System.out.printf("Student added : %s\n", student);
    }

    public String[] getStudent() {
        return students;
    }

    public int getStudentsNumber() {
        return numberOfStudents;

    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String name) {
        System.out.printf("Student dropped : %s\n", name);
        for (int i = 0; i < numberOfStudents; i++) {
            if (name == students[i]) {
                System.arraycopy(students, i + 1, students, i, numberOfStudents - (i + 1));
                numberOfStudents--;
                students[numberOfStudents] = null;
            }
        }
    }

    public void clear() {
        numberOfStudents = 0;
        students = new String[100];
        System.out.println("Course cleared");
    }
}
