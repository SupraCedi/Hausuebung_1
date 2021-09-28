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

        int n;
        for (int i = 2; i <= limit; i++) {

            n = 2;
            while (i % n != 0 && n <= i / 2) {
                // Erhoehe n solange, wie i nicht nurch n teilbar ist und die
                // Obergrenze noch nicht erreicht ist
                n = n + 1;
            }

            // Falls die Schleife bis zur Obergrenze i/2 durchlaufen wurde:
            if (n >= i / 2 + 1 && i != 1) {

                System.out.println(i + " is a Primenumber");

            }
        }
        return false;
    }

    @Override
    public void printPrimes() {
        //?
    }

    public void Algorithm(int limit2) {

        int[] n_numbers = new int[limit2 + 1];
        int[] p_numbers = new int[limit2 + 1];
        int ncounter = 0;
        int pcounter = 0;

        //gerade Zahlen finden
        for (int i = 2; i <= limit2; i++) {
            if (i % 2 == 0 && i > 2) {
                for (int j = 0; j < 1; j++) {

                    n_numbers[ncounter] = i;
                    ncounter++;
                }
            }
        }
        for(int i = 0; i<ncounter;i++) {
            System.out.println(n_numbers[i]);
        }
        //prim Zahlen finden
        int n;
        for (int i = 2; i <= limit2; i++) {

            n = 2;
            while (i % n != 0 && n <= i / 2) {
                // Erhoehe n solange, wie i nicht nurch n teilbar ist und die
                // Obergrenze noch nicht erreicht ist
                n = n + 1;
            }

            // Falls die Schleife bis zur Obergrenze i/2 durchlaufen wurde:
            if (n >= i / 2 + 1 && i != 1) {
                p_numbers[pcounter] = i;
                pcounter++;
            }
        }
        for(int i = 0; i<pcounter;i++) {
            System.out.println(p_numbers[i]);
        }
    }
}

