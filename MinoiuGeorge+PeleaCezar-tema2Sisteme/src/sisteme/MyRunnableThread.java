package sisteme;

/**
 * In Java se nu exista mostenire multipla
 * de aceea a aparut necesitatea unei interfete Runable
 * care sa poata fi implementata in loc sa extindem Thread.
 */
public  class MyRunnableThread implements Runnable  {
    public  void run()  {
        System.out.println("Hello  world  from  runnable  thread");
    }
}