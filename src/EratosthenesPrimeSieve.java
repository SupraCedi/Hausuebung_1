import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve {

    public static Scanner s = new Scanner(System.in);
    public static int limit;
    public static int count;
    //private static int limit2;



    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i <= limit; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                return true;
            System.out.println(i);
            break;
        }
        return false;
    }

    @Override
    public void printPrimes() {

    }

    public void Algorithm(int limit2) {

         int[] n_numbers = new int[limit2 -1];
         int[] p_numbers = new int[limit2 -1];

        for (int i = 2; i <= limit2; i++) {
            if (i % 2 == 0) {
                n_numbers[i] = i;

            }

            for (int j = 2; j <= limit; j++) {
                count = 0;
                for (int k = 1; k <= j; k++) {
                    if (j % k == 0)
                        count = count + 1;

                    if (count == 2)
                        p_numbers[j] = j;

                    if (p_numbers[j]+p_numbers[j] == n_numbers[i]){

                    }
                    System.out.println(n_numbers[i] + " sum: " + n_numbers[i] + " = " + p_numbers[j] + " + " + p_numbers[j]);

                }
            }

        }
    }
}
