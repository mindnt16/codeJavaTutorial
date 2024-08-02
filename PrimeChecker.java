import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to test?");
        number = input.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        input.close(); // ปิด Scanner เมื่อใช้งานเสร็จ
    }

    public static boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2) {
            return true;
        }
        if (p % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(p); i += 2) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}