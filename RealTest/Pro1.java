public class Pro1 {
    public static void main(String[] args) {
        String[][] answer = { { "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
                { "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
                { "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
                { "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" } };
        String[] correctAnswer = { "D", "D", "D", "C", "C", "D", "A", "E", "A", "D" };
        int[] count = { 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 9; j++) {
                if (answer[i][j] == correctAnswer[j]) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i <= 7; i++) {
            System.out.printf("Student %d's correct count is %d\n", i, count[i]);
        }
    }
}