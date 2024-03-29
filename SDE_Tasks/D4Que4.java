package SDE_Tasks;
import java.util.*;
public class D4Que4 {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String input=sc.nextLine();
	  Map<String,Integer> m=new HashMap<>();
	  for(String s:input.split(""))
	  {
		  if(m.containsKey(s))
			  m.put(s, m.get(s)+1);
		  else
			  m.put(s, 1);
	  }
	  for(char s:input.toCharArray())
	  {
		  if(m.get(s+"")==1)
		  {
			  System.out.println(input.indexOf(s));
			  return ;
		  }
	  }
	  System.out.println(-1); 
  }
}
