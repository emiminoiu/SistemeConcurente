package nrPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NumerePrime extends Thread implements Runnable {
    //public List<Integer> primeList = new ArrayList<>();

    static ArrayBlockingQueue<Integer> primeList;
    int start=1, end;
    

    

    public NumerePrime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    Scanner scan = new Scanner(System.in);
   


   public void run() {
       for (int i = start; i <= end; i++) {
           boolean prime = true;
                  for (int j = 2; j < i; j++) {
                          if (i%j == 0){
                              prime = false;
                              break;
                                }
                  }

                  if(prime && i !=1 && i!=0){   // Added conditions so it does not count 1 or 0 as prime.               
                       
                        primeList.add(i); // we add the prime number (-i) to out "primeList"

                }

          }
   }
}