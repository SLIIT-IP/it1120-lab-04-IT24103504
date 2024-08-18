import java.util.Scanner;
 public class IT24103504Lab4Q2{
 public static void main(String[] args){
 
 Scanner input=new Scanner(System.in);
 double exmarks;
 double labs;
 double exam_per;
 double lab_per;
 double finalmarks;
 
System.out.println("please enter exam marks(out of 100): ");
exmarks=input.nextDouble();

if(exmarks<0 || exmarks>100)
 System.out.println("Invalid input for exam marks");

System.out.println("please enter lab subbmission(out of 100): ");
labs=input.nextDouble();

if(labs<0 || labs>100)
System.out.println("Invalid input for lab subbmission");


System.out.print("please enter the perecentage given for exam: ");
 exam_per=input.nextDouble();

if(exam_per < 0 || exam_per > 100)
System.out.print("Invalid input. Percentage taken from the exam marks should be between 0 and 100.");

 System.out.print("Enter the percentage taken from the lab submission marks (0 to 100): ");
 lab_per =input.nextDouble();

 if (lab_per < 0 || lab_per > 100)
 System.out.print("Invalid input. Percentage taken from the lab submission marks should be between 0 and 100.");
 

if (exam_per + lab_per != 100)
  System.out.print("Error: The percentages must  add up to 100.");

finalmarks=(exmarks * exam_per / 100) + (labs * lab_per / 100);
 System.out.println("Final exam marks is: "+finalmarks);
}
}


