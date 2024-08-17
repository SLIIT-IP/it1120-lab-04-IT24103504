import java.util.Scanner;
public class IT24103504Lab4Q3{
public static void main(String[] args){

 int number;
 String status;

Scanner num=new Scanner(System.in);

System.out.print("Enter a number: ");
number=num.nextInt();


status=(number>0)?"The number is: Positive":
       (number<0)?"The number is: Negative":
       "The number is :Zero";

System.out.print(status);
 }
}
