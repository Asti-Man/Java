class ThreadRun implements Runnable
{
public void run()
{
System.out.println("Thread Execution by Runnable Interface");
}

public static void main(String[] args)
{
ThreadRun obj = new ThreadRun();
Thread t = new Thread(obj);
t.start();
}
}
