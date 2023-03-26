import java.util.Scanner;
public class Solution 
{
     public static String timeInWords(int h, int m) 
    {
    // Write your code here
        String[] number={"", "one","two","three","four","five","six","seven","eight","nine","tex","eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two", "twenty three","twenty four"};
        String time="";
        if(m==0)
            time=number[h]+" o' clock";
        else if(m<=30)
        {
            if(m==15)
            {
                time="quarter past "+number[h];  
            }
            else if(m==30)
            {
                time="half past "+number[h];
            }
            else
            {
                time=number[m]+" minute"+(m==1?"":"s")+" past "+number[h];
            }
        }
        else
        {
            if(m==45)
            {
                time="quarter to "+number[h+1];
            }
            else
            {
                time=number[60-m]+" minute"+(m==59?"":"s")+" to "+number[h+1];
            }
        }
        return time;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(timeInWords(h, m));
        
    }
}
