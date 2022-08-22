public class Pro2 {
    public static void main(String[] args) {
        Course course = new Course("Course");
        course.addStudent("AA");

        System.out.println("=== Student names in this course ===");
        for (int i = 0; i < course.getStudentsNumber(); i++) {
            System.out.println(course.getStudent()[i]);
        }
        System.out.println();

        course.addStudent("BB");

        System.out.println("=== Student names in this course ===");
        for (int i = 0; i < course.getStudentsNumber(); i++) {
            System.out.println(course.getStudent()[i]);
        }
        System.out.println();

        course.addStudent("CC");

        System.out.println("=== Student names in this course ===");
        for (int i = 0; i < course.getStudentsNumber(); i++) {
            System.out.println(course.getStudent()[i]);
        }
        System.out.println();

        course.dropStudent("BB");

        System.out.println("=== Student names in this course ===");
        for (int i = 0; i < course.getStudentsNumber(); i++) {
            System.out.println(course.getStudent()[i]);
        }
        System.out.println();

        course.clear();

        System.out.println("=== Student names in this course ===");
        for (int i = 0; i < course.getStudentsNumber(); i++) {
            System.out.println(course.getStudent()[i]);
        }
        System.out.println();
    }
}
