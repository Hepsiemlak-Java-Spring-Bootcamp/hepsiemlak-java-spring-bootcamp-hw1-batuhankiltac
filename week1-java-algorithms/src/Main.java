import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Long> arr = new ArrayList<>();
    static long total;
    static long max1;
    static long max2;

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {

        for (long i = 10; i <= 100; i++) {
            total = i + reversed(i);
            while (!isPalindrome(total)) {
                total += reversed(total);
                arr.add(total);
            }
            System.out.println("Number = " + i + ", " + " Max Palindrome Value: " + total);
        }
        Collections.sort(arr);
        max1 = arr.get(arr.size() - 1);
        System.out.println("\nMax value in array: " + max1);
        max2 = arr.get(arr.size() - 2);
        System.out.println("Max value in array: " + max2);
    }

    public static long reversed(long number) {
        long reversedNumber = 0;
        long lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(long number) {
        long originalNumber = number;
        long reversedNumber = 0;
        long lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return reversedNumber == originalNumber;
    }
}