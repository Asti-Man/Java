import java.util.Scanner;
class NumberOutOfLimitException extends Exception
{
public NumberOutOfLimitException(String num)
{
System.out.println(num);
}
}

class Number 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter A number greater than 500");
int num = sc.nextInt();
if(num<500) throw new NumberOutOfLimitException("Number entered is less than 500");
else
System.out.println("Number entered is " + num);
}

catch(NumberOutOfLimitException e)
{
System.out.println(e);
}
}
}