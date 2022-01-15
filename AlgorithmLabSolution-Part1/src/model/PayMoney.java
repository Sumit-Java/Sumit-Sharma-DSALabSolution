package model;

import java.util.Scanner;

public class PayMoney {

	public void targetstatus(long[] transactions) {
		
		int nooftargets;
		int flag=0;		
		
		System.out.print("Enter the total no of targets that needs to be achieved: ");
		Scanner input=new Scanner(System.in);
		nooftargets=input.nextInt();
		
		while(nooftargets-- !=0) {	
			long target=0;
						
				System.out.println("Enter the value of target: ");
				target=input.nextInt();
			
			long sum=0;	
			
			//Linear iteration over transactions array to get the sum of daily transactions.
			for(int i=0;i<transactions.length;i++) {
				sum+=transactions[i];
			
			if(sum >= target) {
				System.out.println(" Targets of " + target+ " is Achieved after "+ (i+1)+" Transaction");
				System.out.println();
				flag=1;	
				break;
			}
			
		}
			if(flag==0) {
					System.out.println(" Given Target is Not Achieved");
				}
			
		}

	input.close();
	}
	

}
