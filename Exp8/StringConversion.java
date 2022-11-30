public class StringConversion
{ 
public static void main(String[] args) 
{ 
StringBuffer str = new StringBuffer("Khushi Srivastava"); 
char[] sc = new char[str.length()]; 
str.getChars(0, str.length(), sc, 0); 
for (int i = 0; i < str.length(); i++) 
{ 
if ((int)sc[i] >= 97 && (int)sc[i] <= 129) 
{ 
sc[i] = (char) ((int) sc[i] - 32); 
} 
} 
System.out.println("Original String : " +str);
System.out.print("New String : " );
for (int i = 0; i < str.length(); i++) 
System.out.print(sc[i]);
}
}
