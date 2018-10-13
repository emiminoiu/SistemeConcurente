package sisteme;
import java.lang.*;
public class Main {

    /**
     * porneste 8 thread-uri apoi asteapta pana termina toate inainte de a continua pe thread-ul Main
     */
    public static void waitAllToFinish(){
        Thread[]  thread  =  new Thread[8];
        for(int i  =  0;  i  <  thread.length;  i++)  {
            thread[i]  =  new MyThread("Hello  world  from  thread"  +  i);
            /*thread[i].start();
            try{
                thread[i].join();
            }catch(InterruptedException  e)  {
                e.printStackTrace();
            }*/

        }
        for(int i  =  0;  i  <  thread.length;  i++)  {
            thread[i].start();
        }
        for(int i  =  0;  i  < thread.length; i++)  {
            try{
               thread[i].join();
            }catch(InterruptedException  e)  {
                e.printStackTrace();
            }
        }

    }


    /**
     * porneste 8 thread-uri
     */
    public static void startManyThreads(){
        Thread[]  thread  =  new Thread[8];
        for(int i  =  0;  i  <  thread.length;  i++)  {
            thread[i]  =  new MyThread("Hello  world  from  thread"  +  i);
            //thread[i].start();
        }
        for(int i  =  0;  i  <  thread.length;  i++)  {
            //thread[i].start();
       }
    }

    public static void main(String[] args) {

        System.out.println("hello");

        (new MyThread("Hello  world  from  thread")).start();

        (new Thread(new MyRunnableThread())).start();

        System.out.println("________________________multithread demo");
        startManyThreads();

       System.out.println("________________________join demo");
        waitAllToFinish();

        System.out.println("Main  finished");

        //Oprirea unui fir
        MyThreadSetDone done=new MyThreadSetDone();
        done.start();
        try
        {
            Thread.sleep(3);
        }
        catch (Exception e)
        {
            //error handling code
        }
        done.setDone();

        //Counter
        (new MyCounter("The value of n is :")).start();
        (new MyCounter("The value of n is :")).start();
    }


}
