package sisteme;
import java.lang.*;

public  class MyThread extends Thread  {
    String  message;
    public MyThread(String  m)  {
        message  =  m;
    }
    public  void run()  {
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            //error handling code
        }
        System.out.println(message);

    }
}