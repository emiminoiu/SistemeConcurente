package sisteme;

public class MyCounter  extends Thread {
    public static int n=0;
    public static int temp;
    public static int Nr = 10;
    String  message;
    public MyCounter(String  m)  {
        message  =  m;
    }
    public  void run()  {
        while(Nr > 0)
        {
        	temp = n;
        	n = temp + 1;
        	Nr--;
        }
        System.out.println(message+" " + n);

    }
}
