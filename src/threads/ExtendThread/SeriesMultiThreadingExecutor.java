package threads.ExtendThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SeriesMultiThreadingExecutor extends Thread
{
  public void run()
  {
    for (int i = 1; i < 4; i++)
    {
      try
      {
        Thread.sleep(100);
      }
      catch (InterruptedException e)
      {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String args[])
  {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    int i = 0;
    while (i < 5)
    {
      executorService.execute(arg0);
    }
    
    
  }
  
}