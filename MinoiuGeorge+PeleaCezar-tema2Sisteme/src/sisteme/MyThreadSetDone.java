package sisteme;

public class MyThreadSetDone extends Thread {
    private  volatile  boolean done  =  false;
    public  void run() {
        while(!done){  System.out.print("merg ");}
        System.out.println("\n ma opresc");
    }

    public  void setDone()  {done  =  true;}
}
