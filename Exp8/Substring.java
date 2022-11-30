import java.io.*;
import java.util.Scanner; 
import java.util.*;
class Substring
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
String str = sc.nextLine();
System.out.println("Enter a SubString to search");
String sub = sc.nextLine();
int firstIndex = str.indexOf(sub);
System.out.println("First occurrence of " +sub+" is found at : " + firstIndex);
int lastIndex = str.lastIndexOf(sub);
System.out.println("Last occurrence of " +sub+ " is found at : " + lastIndex);
}
}
