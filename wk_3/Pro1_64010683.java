public class Pro1_64010683 {
    public static void main(String[] args) {
        int count = 0;
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
