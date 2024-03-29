package SDE_Tasks;
import java.util.*;
public class D4Que5 {
    Queue<Integer> q;
    public D4Que5()
    {
    	q=new LinkedList<>();
    }
    public int ping(int x)
    {
    	q.add(x);
    	while(q.peek()<x-3000)
    	{
    		q.poll();
    	}
    	return q.size();
    }
    public static void main(String args[])
    {
    	D4Que5 d=new D4Que5();
    	System.out.println(d.ping(1));
    	System.out.println(d.ping(100));
    	System.out.println(d.ping(3001));
    	System.out.println(d.ping(3002));
    }
}
