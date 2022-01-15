package Driver;

import java.util.Scanner;

import model.PayMoney;

public class Driver {
	
	static long[]transactions;//Array Declaration for recording no of daily Transactions

	public static void main(String[] args) {
		int nooftrans;
		PayMoney p=new PayMoney();
		
		System.out.println("Enter the size of transaction array: ");
		Scanner input=new Scanner(System.in);
		nooftrans=input.nextInt();
		transactions=new long[nooftrans];
	
		for( int i=0;i<nooftrans;i++) {
		System.out.println(" Enter the values of " + (i+1) + " Transactions: ");
		transactions[i]=input.nextInt();
		}
		//function calling through object by passing Array as an argument
		p.targetstatus(transactions);
		
	
input.close();
	}
}
