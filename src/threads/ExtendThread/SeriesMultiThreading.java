package threads.ExtendThread;

class SeriesMultiThreading extends Thread{  
  public void run(){  
   for(int i=1;i<4;i++){  
     try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}  
     System.out.println(i);  
   }  
  }  
  public static void main(String args[]){  
   SeriesMultiThreading t1=new SeriesMultiThreading();  
   SeriesMultiThreading t2=new SeriesMultiThreading();
   SeriesMultiThreading t3=new SeriesMultiThreading();  
   SeriesMultiThreading t4=new SeriesMultiThreading();  
   SeriesMultiThreading t5=new SeriesMultiThreading();  
   
    
   t1.run();  
   t2.run();  
   t3.run();  
   t4.run();  
   t5.run();  
   
  }  
 }  