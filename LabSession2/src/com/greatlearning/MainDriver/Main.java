package com.greatlearning.MainDriver;

import java.util.Scanner;

import com.greatlearning.Currency.MergeSort;
import com.greatlearning.Currency.NotesCount;

public class Main {
	public static void main(String[] args) {
		 
		MergeSort	 mergesort = new MergeSort();
		NotesCount notesCount = new NotesCount();
	
		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int [size];
		System.out.println("Enter the currency denomination value");
		for (int i=0; i<size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergesort.sort(notes,0,notes.length-1);
		notesCount.calculateNotesCount(notes, amount);
	}

}
