 public class SumCountDivisibleBy5 
 {
 public static void main(String args[])
 {
 int sum = 0, count = 0;
 for (int i = 41; i < 250; i++)
 {
     if (i % 5 == 0)
     {
         sum = sum + i;
         count++;
     }
 }
 System.out.println("The Sum of the number between 40 to 250 which are divisible by 5 is: "+sum);
 System.out.println("Total numbers between 40 to 250 which are divisible by 5 is: "+count);
 }
 } 