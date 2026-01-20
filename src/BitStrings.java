import java.util.Scanner;

public class BitStrings {
    public static void main(String[] args) {
        final int MODULUS = 1_000_000_007;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;

        // Calculate 2^n
        for (int i = 0; i < n; i++) {
            result *= 2;
            result %= MODULUS;
        }

        System.out.println(result);
    }
}
