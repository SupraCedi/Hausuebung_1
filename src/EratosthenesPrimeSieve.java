import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve {

    public static Scanner s = new Scanner(System.in);
    public static int limit;
    public static int count;


    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    //public static boolean[] array = new boolean[limit];


    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i <= limit; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }


        return true;
    }

    @Override
    public void printPrimes() {

    }

}
