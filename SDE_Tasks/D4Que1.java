package SDE_Tasks;
import java.util.*;
public class D4Que1 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String input=sc.nextLine();
	   String splitStr[] = input.split(" ");
	   Stack<String> stack =new Stack<String>();
	   for(String s:splitStr)
	   {
		   if(!stack.isEmpty() && stack.peek().equals(s))
		   {
			   stack.pop();
			   continue;
		   }
		   stack.push(s);
	   }
	   System.out.println(stack.size()); 
   }
}
