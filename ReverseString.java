package javaCode;

public class ReverseString {
	public static void main(String[] args) 
    {
        String s="my name is shailendra";
        String[]words=s.split(" ");
        String reversestring=" ";
        for(String word:words)
        {
            String reverseword=" ";
            for(int i=word.length()-1; i>=0; i--)
            {
                reverseword=reverseword + word.charAt(i);
            }
            reversestring=reversestring + reverseword;
        }
        System.out.println(reversestring);
    }

}
