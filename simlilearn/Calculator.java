package simlilearn;


import java.util.Scanner;

class  Calculator
{
	public static void main(String[] args) 
	{
		char operator;
		Double num1 ,num2 ,result;

		Scanner scan = new Scanner(System.in);

		System.out.println("Choose an operator:- +,-,*,/");
		operator = scan.next().charAt(0);


		System.out.println("Print first num");
		num1 = scan.nextDouble();

		System.out.println("Print Second num");
		num2 = scan.nextDouble();

		switch (operator)
		{
		case '+' :
			result = num1 + num2;
		    System.out.println(num1 + "+" +num2 + "=" + result);
			break;

			case '-' :
			result = num1 - num2;
		    System.out.println(num1 + "-" +num2 + "=" + result);
			break;

			case '*' :
			result = num1 * num2;
		    System.out.println(num1 + "*" +num2 + "=" + result);
			break;

			case '/' :
			result = num1 / num2;
		    System.out.println(num1 + "/" +num2 + "=" + result);
			break;

			default:
				System.out.println("Invalid operator");
			    break;


		
		}
	}
}