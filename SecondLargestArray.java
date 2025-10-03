package javaCode;

public class SecondLargestArray {
	
	public static void main(String[] args) 
	{
		int a[]= {2,3,54,65,6};
		int max=0;
		int sec_max=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				sec_max=max;
				max=a[i];
			}
			else if(a[i]>sec_max)
			{
				sec_max=a[i];
			}
		}
		System.out.println(max);
		System.out.println(sec_max);

	}


}
