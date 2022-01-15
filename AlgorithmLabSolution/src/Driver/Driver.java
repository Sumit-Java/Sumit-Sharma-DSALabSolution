package Driver;

import java.util.Scanner;

import Model.Denominations;

public class Driver {

	public static void main(String[] args) {
		int amount=0;
		Denominations D=new Denominations();
		
		System.out.print("Enter the no of Denominations: ");
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] denominations=new int[size];
		
		System.out.println("Enter the currency denominations value: ");
		for(int i=0;i<size;i++) {
			denominations[i]=input.nextInt();
		}
		System.out.print("Enter the Amount you want to Pay:");
		amount=input.nextInt();
		
		D.Paymentapproach(denominations, amount);
		
		input.close();
		}
		
	}


