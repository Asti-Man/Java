import java.util.Scanner;
class SquareSum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int Arr[] = new int[10];
for(int i = 0; i<10; i++)
{
System.out.println("Enter a Number");
Arr[i] = sc.nextInt();
}
int sum = 0;
System.out.println("Original Number\tSquare Of Numbers");
for(int i = 0; i<10; i++)
{
int sq = Arr[i] * Arr[i];
System.out.println(Arr[i]+"\t\t"+sq);
sum += sq;
}

System.out.println("Sum of Square of all elements : " + sum);
}
}