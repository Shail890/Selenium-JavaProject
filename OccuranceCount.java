package javaCode;

	import java.util.HashMap;

	public class OccuranceCount 
	{

		public static void main(String[] args) 
		{
			String s="abcddef";
			HashMap<Character,Integer> charcount = new HashMap<Character,Integer>();
			for(char ch:s.toCharArray())
			{
				charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
			}
			System.out.println(charcount);

		}

	}



