import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the upper Limit!");
        int limit = s.nextInt();
        int p = 0;

        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve(limit);
        eratosthenesPrimeSieve.isPrime(p);
        //eratosthenesPrimeSieve.printPrimes();

        System.out.println("Please enter the second upper Limit!");
        int limit2 = s.nextInt();

        eratosthenesPrimeSieve.Algorithm(limit2);
    }
}
