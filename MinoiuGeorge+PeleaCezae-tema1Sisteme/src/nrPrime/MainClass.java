package nrPrime;
//Minoiu George + Cezar Pelea HomeWork1
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class MainClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How big would you like the array? ");
        int n = scan.nextInt();

        int [] primes = new int [n];


        System.out.println("How Many threads?(k threads)");
        int kThreads = scan.nextInt();  // Create variable 'k'  to handle whatever integer the user specifies.  nextInt() is used for the scanner to expect and Int.

        final NumerePrime[] pThreads = new NumerePrime[kThreads];


        long startTime = System.currentTimeMillis();
        NumerePrime.primeList = new ArrayBlockingQueue<>(primes.length); // Guaranteed to be enough
        int step = primes.length / kThreads + 1;
        for(int i = 0; i<kThreads; i++){
            pThreads[i] = new NumerePrime(i * step, Math.min(primes.length, (i + 1) * step - 1));
            pThreads[i].start();
        }

        try {
            for (int i = 0; i < kThreads; i++)
                pThreads[i].join();
        } catch (InterruptedException e) {
            }

            long stopTime = System.currentTimeMillis();

            long elapsedTime = stopTime - startTime;
            System.out.println("Execution time = : "+  elapsedTime);

            System.out.println("----------------------------------------------------");

            int cores = Runtime.getRuntime().availableProcessors();
            System.out.println("How many Cores this Java Program used: " + cores);

            System.out.println("Array length " + primes.length);



          for ( int i = 0; i < kThreads; i++)
            
             System.out.println("Total prime count: " + NumerePrime.primeList.size()); // Output total amount of primes from the Array List
             System.out.println("\nThe numbers are: ");
             System.out.println(NumerePrime.primeList);

    }
}