class Even implements Runnable
{
public void run()
{
for(int i = 0; i<=10 ; i++)
{
if(i%2 == 0)
System.out.print(i + "  " );
}
System.out.println("");
}
}

class Odd implements Runnable
{
public void run()
{
for(int i = 0; i<=10 ; i++)
{
if(i%2 != 0)
System.out.print(i + "  " );
}
System.out.println("");
}
}

class Generate
{
public static void main (String[] args)
{
Runnable odd = new Odd();
Thread todd = new Thread(odd);
todd.start();
Runnable even = new Even();
Thread teven = new Thread(even);
teven.start();
}
}
