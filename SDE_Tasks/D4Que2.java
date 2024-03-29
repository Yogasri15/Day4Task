package SDE_Tasks;
import java.util.*;
public class D4Que2 {
  private Queue<Integer> q1;
	//static Queue<Integer> q2;
  public  D4Que2()
  {
	  q1=new LinkedList<Integer>();
	  //q2=new LinkedList<Integer>();
  }
  public void push(int x)
  {
	  q1.add(x);
	  for(int i=0;i<q1.size()-1;i++)
	  {
		  q1.add(q1.poll());
	  }
  }
  public int pop()
  {
	  return q1.poll();
  }
  public int top()
  {
	  return q1.peek();
  }
  public boolean empty()
  {
	  return q1.isEmpty();
  }
  public static void main(String args[])
  {
	  D4Que2 q=new D4Que2();
	  q.push(1);
	  q.push(2);
	  System.out.println(q.top());
	  System.out.println(q.pop());
	  System.out.println(q.empty());
  }
}
