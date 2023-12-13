//to read first n natural numbers



import java.util.Scanner;

public class  multi

{
   public static void main(String arg[])
   {
     System.out.println("enter the total numbers :");
     Scanner reader =new Scanner(System.in);
     int n= reader.nextInt();
     for(int i=1;i<n;i++)
     {
       System.out.println(i);
      }
   }
}