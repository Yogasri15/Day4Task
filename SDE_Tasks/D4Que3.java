package SDE_Tasks;
import java.util.*;
public class D4Que3 {
	private Stack<Integer> s1;
	 public D4Que3()
	 {
		 s1=new Stack<Integer>();
	 }
	 public void push(int x)
	 {
		 Stack<Integer> s2=new Stack<>();
		 while(!s1.isEmpty())
			 s2.push(s1.pop());
		 s1.push(x);
		 while(!s2.isEmpty())
			 s1.push(s2.pop());
	 }
	 public int pop()
	 {
		 return s1.pop();
	 }
	 public int peek()
	 {
		 return s1.peek();
	 }
	 public boolean empty()
	 {
		 return s1.isEmpty();
	 }
	 public static void main(String args[])
	 {
		 D4Que3 q=new D4Que3();
		 q.push(1);
		 q.push(3);
		 System.out.println(q.peek());
		 System.out.println(q.pop());
		 System.out.println(q.empty());
	 }
}
