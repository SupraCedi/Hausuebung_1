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

        int[] n_numbers = new int[limit2 + 1];
        int[] p_numbers = new int[limit2 + 1];
        int ncounter = 0;
        int pcounter = 0;


        //----------neu

        //gerade Zahlen finden
        for (int i = 2; i <= limit2; i++) {
            if (i % 2 == 0 && i > 2) {
                for (int j = 0; j < 1; j++) {

                    n_numbers[ncounter] = i;
                    ncounter++;
                }
            }
        }

        //prim Zahlen finden
        int n;
        int counter = 0;
        for (int i = 2; i <= limit2; i++) {

            n = 2;
            while (i % n != 0 && n <= i / 2) {
                // Erhoehe n solange, wie i nicht nurch n teilbar ist und die
                // Obergrenze noch nicht erreicht ist
                n = n + 1;
            }

            // Falls die Schleife bis zur Obergrenze i/2 durchlaufen wurde:
            if (n >= i / 2 + 1 && i != 1) {
                p_numbers[counter] = i;
                counter++;
            }
            System.out.println(i + " ist eine Primzahl.");
        }

            /*for (int j = 2; j < i && isprime; j++) {
                if (i % j == 0) {
                    isprime = false;
                }


                if (isprime == true) {
                    for (int k = 0; k < limit2; k++) {
                        p_numbers[k] = i;
                        System.out.println(i + " ist eine Primzahl!");
                    }
                }
            }*/
    }
}

