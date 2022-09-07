package testing;
import java.util.*;
public class StringCalculator {
	private final String alphabet="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
	
	private boolean isEmpty(String input) throws Exception
	{
		int len=input.length();
		if(len==0)
		{
			return true;
		}
		return false;
	}
	private int getSum(String[] num) throws Exception
	{
		int sum=0;
	
		HashMap<String, Integer> hash_map=new HashMap<>();
		
		String[] str=alphabet.split(",");
		
		for(int i=0;i<26;i++)
		{
			hash_map.put(str[i], i+1);
		}
				
		for(int i=0;i<num.length;i++)
		{
			if(hash_map.containsKey(num[i]))
			{
				sum=sum+hash_map.get(num[i]);
			}
			else
			{
				if(Integer.parseInt(num[i])<0)
				{
					throw new Exception();
				}
				sum=sum+Integer.parseInt(num[i]);
			}
			}
		return sum;
	}
	
	
	public int add(String input) throws Exception
	{
		String [] num=input.split(",");
		if(isEmpty(input))
		{
			return 0; 
		}
		if(num.length==1)
		{
			return Integer.parseInt(num[0]);
		}
		else
		{
			return getSum(num);
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}

}
