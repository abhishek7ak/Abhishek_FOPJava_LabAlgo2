package com.greatlearning.Currency;

public class Driver {
	public static void main(String[] args) {
		
IntegerSorting sorting = new BubbleSort();
//IntegerSorting sorting = new MergeSort();
NotesCount counting = new NotesCount();
int[] denomination = {1000,5,100,10,20,1,500,2000,2,50};
sorting.sort(denomination);
counting.calculateNotesCount(denomination,13 );
}
}
