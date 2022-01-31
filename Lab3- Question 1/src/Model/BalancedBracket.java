package Model;

import java.util.Stack;

public class BalancedBracket {

	public boolean isBalanced(String exp) {
		//Declaration of inbuilt Stack of character type to store every character of the expression.
		Stack<Character> brackets=new Stack<>();
		
		char character;
		
		//Iterating over the expression to access every single character .
		for(int i=0; i<exp.length(); i++) {
			character=exp.charAt(i);
		
			
		//adding to the stack the below condition satisfies	
		if(character== '(' || character=='[' ||character=='{')	
			{
			brackets.push(character);
			continue;
			}
		//In case if nothing adds to the stack than return false.
		if( brackets.isEmpty()) 
		{
		 return false;	
		}
		
		// Evaluating condition using Switch case statement by fetching TOS element
		// using built in pop function
		char ch;
		
		switch(character) {
		
		case ')':   ch=brackets.pop();
					if( ch=='{' || ch =='[')
					return false;
					break;
					
		case '}': 	ch=brackets.pop();
					if( ch=='(' || ch =='[')
					return false;
					break;
					
		case ']': 	ch=brackets.pop();
					if( ch=='(' || ch =='{')
					return false;
					break;
		   }
	  }	
		
 		return (brackets.isEmpty());
  }
}
