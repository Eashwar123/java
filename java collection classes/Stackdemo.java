import java.util.*;

class program
{
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		st.push(540);
		st.push(4389);
		st.push(329);
		System.out.println(st.peek());
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
	}

}