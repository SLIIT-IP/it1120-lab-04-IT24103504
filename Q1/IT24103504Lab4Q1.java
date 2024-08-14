import java.util.Scanner;
 public class IT24103504Lab4Q1{
 public static void main(String[] args){
 
 Scanner input=new Scanner(System.in);
 int number;
 String status;

 System.out.print("Enter a Number: ");
 number=input.nextInt();
 
if(number==0)
  status="Zero";
else if(number<0)
  status="Negative";
else 
  status="Positive";


 System.out.print("The number is: "+status);
 }
}
