class SumFrom1oN
{
	public void sum(int n) 
	{
		int res = 0;
		while (n > 0) 
		{
			res += n;
			n--;
		}
		System.out.println(res);
	}
}