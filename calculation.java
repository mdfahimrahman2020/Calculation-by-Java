import java.util.Scanner;
public class calculation{
public static void main(String[] args){
System.out.println("\n\n\n\t\tAmerican International University - Bangladesh \n\t\t\t\tGeneral Calculator");

Scanner input = new Scanner(System.in);
String name ;
System.out.print("\n\nEnter your name : ");
name = input.nextLine();
System.out.println("\n\tWELCOME "+name);
System.out.println("\n\tPlease start your calculation");

System.out.println("\n\n\t\t\"Enter two numbers\" ");

Scanner input1 = new Scanner (System.in);
int num1;
System.out.print("\nEnter first number : ");
num1 = input1.nextInt();
System.out.println("1st Number = "+num1);

Scanner input2 = new Scanner(System.in);
int num2;
System.out.print("\nEnter second number : ");
num2 = input2.nextInt();
System.out.println("2nd Number = "+num2);

int res,res1,res2,res4;
res = num1 + num2;
System.out.println("Addition       : "+res);

res1 = num1 - num2;
System.out.println("Subtraction    : "+res1);

res2 = num1 * num2;
System.out.println("Multiplication : "+res2);

double res3 = (double)num1 / num2;
System.out.println("Division       : "+res3);

res4 = num1 % num2;
System.out.println("Remainder      : "+res4);



}


}