package homeworks;

public class PrimeNumbers {
    public static void main(String[] args) {
        int factors;

        for (int i = 2; i <= 10000; i++) {
            factors = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0)
                    factors = factors + 1;
            }
            if (factors == 2)
                System.out.print("" + i + " ");
        }
    }
}
