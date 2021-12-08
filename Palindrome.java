                 PROGRAM--4
import java.util.*;
import java.lang.*;
class Palindrome
{
   public static void main(String args[])
   {
   String a,b="";
   Scanner sc=new Scanner(System.in);
    a=sc.next();
   int n=a.length();
  for(int i=n-1;i>=0;i--)
   {
   b=b+a.charAt(i);
   }
   if(a.equalsIgnoreCase(b))
   System.out.println("Yes");
   else
   System.out.println("No");
  }
}

OUTPUT:
C:\vyshu>javac Palindrome.java

C:\vyshu>java Palindrome
madam
Yes