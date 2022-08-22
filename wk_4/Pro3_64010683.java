import java.util.Arrays;

public class Pro3_64010683 {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Double[] elements = new Double[1000];
        Double[] sortedElements = new Double[1000];
        int count = 0;
        System.out.println("Creating a list containing 1000 elements,");
        for (int i = 0; i < 1000; i++) {
            elements[i] = Math.random() * 1000;
            if (i != 10 && (i < 10 || i > 989)) {
                if (count != 4) {
                    System.out.printf("\t%.2f", elements[i]);
                    count++;

                } else if (count == 4) {
                    System.out.printf("\t%.2f\n", elements[i]);
                    count = 0;

                }
            } else if (i == 10) {
                System.out.println("\t...");

            }
        }

        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");

        watch.start();
        sortedElements = elements;
        Arrays.sort(sortedElements);

        for (int i = 0; i < 1000; i++) {
            if (i != 10 && (i < 10 || i > 994)) {
                if (count != 4) {
                    System.out.printf("\t%.2f", sortedElements[i]);
                    count++;

                } else if (count == 4) {
                    System.out.printf("\t%.2f\n", sortedElements[i]);
                    count = 0;

                }
            } else if (i == 10) {
                System.out.println("\t...");

            }
        }

        watch.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n", watch.getElapsedTime());

        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        watch.start();
        System.out.println("Creating 1000 PalindromPrime...");

        count = 0;
        int index = 0;
        int a = 2;

        while (count < 100) {
            if (isPrime(a) && isPalindrome(a)) {
                if (index != 9) {
                    System.out.printf("%d ", a);
                    index++;
                } else {
                    System.out.printf("%d\n", a);
                    index = 0;
                }
                count++;
            }
            a++;
        }

        System.out.println("PalindromePrime created.");
        watch.stop();
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.", watch.getElapsedTime());

    }

    public static boolean isPrime(int number) {
        int n = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                n++;
                break;
            }
        }
        if (n > 0) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int remain = 0;
        int result = 0;

        while (temp != 0) {
            remain = temp % 10;
            result = result * 10 + remain;
            temp /= 10;
        }
        if (number == result) {
            return true;
        } else {
            return false;

        }
    }
}