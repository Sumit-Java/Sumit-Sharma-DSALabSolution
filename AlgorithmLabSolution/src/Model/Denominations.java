package Model;

import java.io.IOException;

public class Denominations {

	public void Paymentapproach(int[] notes, int amount){
		Denominations d=new Denominations();
		
		int size=notes.length;
		int[] notescounter=new int[size];
		
		//Sorting array containing denominations using merge sort in decreasing order.
		d.sort(notes, 0, notes.length-1);
		
		//linear iteration over notes array using for loop
		for(int i=0; i<notes.length;i++) {
		if(amount>= notes[i]) {
			notescounter[i]= amount/notes[i];
			amount=amount - notescounter[i]*notes[i];
		}
	}
		
	if(amount > 0) 
	{	
		System.out.print("Exact amount can't be given in these denominations");
	}
	else {
		System.out.println("Payment approach in order to give minimum numbers of denominations will be: ");
			
		for(int i=0; i<notes.length;i++) {
			if(notescounter[i]!=0) {
				System.out.println(notes[i] + ":"+ notescounter[i]);
				}
			}
		}
}
	
//merge sort implementation in decreasing order to achieve highest denomination at 0th index.
	public void sort(int[] array,int left, int right) {
		if(left<right) {
			int mid= left+(right-left)/2;
			
			sort(array,left,mid);
			sort(array,mid+1,right);
			merge(array,left,mid,right);
		}
	}

	void merge(int[] array, int left, int mid, int right) {
		int l1=mid-left+1;
		int l2=right-mid;
		
		int[] leftarray=new int[l1];
		int[] rightarray =new int[l2];
		
		for(int i=0;i<l1;i++)
			leftarray[i]=array[left+i];
		for(int j=0;j<l2;j++)
			rightarray[j]=array[mid+1+j];
			
		
		int i=0;int j=0;
		int k=left;
	
		while(i<l1 && j<l2) {
			if(leftarray[i]>=rightarray[j]) {
				array[k]=leftarray[i];
				i++;
			}
			else {
				array[k]=rightarray[j];
				j++;
			}
			k++;
		}

		
		while(i<l1) {
		array[k]=leftarray[i];
		i++;
		k++;
		}

		while(j<l2) {
			array[k]=rightarray[j];
			j++;
			k++;
			}

	}	
	
}
