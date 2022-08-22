public class Course {
    private int size = 0;
    private String[] students = new String[size];

    public Course() {
    }

    public void addStudent(String name) {
        String[] temp = new String[size];
        System.arraycopy(students, 0, temp, 0, size);
        size++;
        students = new String[size];
        students[size - 1] = name;
        System.arraycopy(temp, 0, students, 0, size - 1);

    }

    public void dropStudent(String name) {
        for (int i = 0; i < size; i++) {
            if (name == students[i]) {
                System.arraycopy(students, i + 1, students, i, size - (i + 1));
                size--;
                students[size] = null;

            }
        }
    }

    public void getStudentName() {
        System.out.println("== Students in the course ==");
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + " " + students[i]);

        }
    }

    public int getStudentsNumber() {
        return size;

    }

    public void clear() {
        size = 0;
        students = new String[size];

    }
}
