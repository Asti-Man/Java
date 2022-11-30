import java.util.Scanner;
class OperandModule
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
char op;
try
{
System.out.println("Enter an Operator");
op = sc.next().charAt(0);
if(op == '+')
System.out.println("Addition Operator");
if(op == '-')
System.out.println("Subtraction Operator");
else if(op == '*')
System.out.println("Multiplication Operator");
else if(op == '/')
System.out.println("Division Operator");
else if(op == '%')
System.out.println("Modules Operator");
else throw new Exception("Non-Numeric Operator");
}

catch(Exception e)
{
System.out.println(e);
}

}
}