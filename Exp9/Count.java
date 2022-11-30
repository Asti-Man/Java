class Count
{
static int count = 0;
}

class Increase extends Count implements Runnable
{
Count Obj = this;
Thread t;
Increase()
{
t = new Thread(this);
t.start();
}
public void run()
{
Obj = syn.increment(Obj);
}
}

class syn
{
synchronized static Count increment(Count i)
{
i.count++;
return(i);
}
}

class IncCounter
{
public static void main(String[] args) throws Exception
{
Increase obj1 = new Increase();
Increase obj2 = new Increase();
Increase obj3 = new Increase();
Increase obj4 = new Increase();
Increase obj5 = new Increase();
Increase obj6 = new Increase();
Increase obj7 = new Increase();
Increase obj8 = new Increase();
Increase obj9 = new Increase();
Increase obj10 = new Increase();

System.out.println(obj10.count);
}
}
