//1606032		String Buffer using Switch Case

import java.awt.*;
import java.util.*;
import java.lang.StringBuffer;
public class sbuf
{
public static void main(String args[])
{
	int c;
	String m;
	StringBuffer s=new StringBuffer("pune");
	StringBuffer s1=new StringBuffer("Nashik");
	StringBuffer s2=new StringBuffer("Goa");
	
	System.out.println("1.Set character at \n 2.Append \n 3.Insert \n 4.set length \n 5.Replace \n6.Reverse");
		Scanner ch=new Scanner(System.in);
		c=ch.nextInt();
		
		switch(c)
		{
			case 1:
			s.setCharAt(1,'L');
			System.out.println(s);
			break;
			
			case 2:
			s.append(s1);
			System.out.println(s);		
			break;
			
			case 3:
			s.insert(2,"com");
			System.out.println(s);
			break;

			case 4:
			s.setLength(2);
			System.out.println(s);
			break;

			case 5:
			s.replace(1,3,"omp");
			System.out.println(s);
			break;

			case 6:
			s.reverse();
			System.out.println(s);
			break;

			default:
			System.out.println("Invalid choice");
		}
	
}
}
