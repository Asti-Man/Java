class MyName
{
public static void main(String[] args)
{
String str = "Khushi Srivastava";
int len = str.length();
System.out.println("Name is : " +str);
System.out.println("Length of the name is : " +len);
int c = 0;
for(int i = 0; i<len ; i++)
{
if(str.charAt(i) == 'a')
c++;
}

System.out.println("Number of 'a' in my name " +str+ " is : " +c);
}
}
