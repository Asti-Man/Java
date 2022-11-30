
import java.util.*;
public class CollFrame
{
public static void main(String[] args)
{
int count[] = { 60,50,70,80,40 };
Set<Integer> set = new HashSet<Integer>();
try
{
for(int i = 0; i<5 ; i++)
set.add(count[i]);
 
System.out.println("Original List " + set);
TreeSet<Integer> sortset = new TreeSet<Integer>(set);
System.out.println("Sorted List " + sortset);
System.out.println("First element of the set : " +(Integer)sortset.first());
System.out.println("Last element of the set : " +(Integer)sortset.last());
}
catch(Exception e)
{
System.out.println("Exception Occured");
}

}
}