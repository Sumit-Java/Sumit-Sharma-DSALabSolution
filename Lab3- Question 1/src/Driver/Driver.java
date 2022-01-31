package Driver;
import java.util.Scanner;

import Model.BalancedBracket;

public class Driver {

	public static void main(String[] args) {
	
		String expression;
		
		//Accepting input of Expression from user
		System.out.println(" Please enter the Expression");
		Scanner input=new Scanner(System.in);
		expression=input.nextLine();
		
		//Object declaration 
		BalancedBracket BB=new BalancedBracket();
		//Condition check, Function calling to access if the Expression is balanced or not.
		
		if(BB.isBalanced(expression)) 
		{
			System.out.println("Expression of brackets Entered is BALANCED");
		}
		
		else
	        System.out.println("Expression of Brackets Entered is NOT BALANCED");
	
		input.close();
	}

}
