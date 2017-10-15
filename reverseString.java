import java.util.*;
class RevereString
{
   public static void main(string args[])
   {      
          System.out.println("Enter the string\n");
          Scanner sr=new Scanner(System.in);
         string s=sr.nextLine();
         string[] word=s.split("\\s");
         for(int i=0;i<word.length();i++)
      {
           string s1=new string(" ");
           int n=word[i].length();
           for(int j=n-1;j>-1;j--)
            {
               s1+=s.charAt(j);
            }
             System.out.print(s1);
     }
    }
}