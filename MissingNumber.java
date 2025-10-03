package javaCode;

public class MissingNumber {

    public static void main(String[] args) 
    {
       int a[]={1,2,4,5,6};
       int expe_ele=a.length+1;
       int total_sum=expe_ele*(expe_ele +1)/2;
       int sum=0;
       for(int i=0; i<a.length; i++)
       {
           sum=sum + a[i];
       }
       System.out.println(total_sum-sum);
    }
    
    
}
