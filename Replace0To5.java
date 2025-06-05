package Practice;

public class Replace0To5 {
	
	public static int replace(int n)
	{
		if(n==0)
			return 5;
		
		int factor=1,ans=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==0)
			{
				ans=ans+(5*factor);
			}
			else
			{
				ans=ans+(rem*factor);
			}
			n=n/10;
			factor=factor*10;
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		int n=1004;
		System.out.println(replace(n));
	}

}
