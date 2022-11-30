class ThreadCls extends Thread
{
public void run()
{
System.out.println("Thread Execution by Thread Class");
}

public static void main(String[] args)
{
ThreadCls obj = new ThreadCls();
obj.start();
}
}
