package com.greatlearning.paymoney;

import java.util.Scanner;

public class TransactionCheck {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of transcation array");
			int transSize = sc.nextInt();
			System.out.println("Enter the value of array");
			int[] transaction = new int [transSize];
			for (int i=0; i<transSize; i++) {
				transaction[i] =sc.nextInt();
			}
			System.out.println("Enter the total no of targets that needs to be achived");
			int targetSize = sc.nextInt();
			for (int i=0; i<transaction.length; i++) {
				System.out.println("Enter the target value");
				int target = sc.nextInt();
				int result = getNoOfTransactionForTarget(transaction, target);
				if (result>0) {
					System.out.println("Target achived after " +result+ "transactions");
				}else {
					System.out.println("Given target is not achived");
				}
}
			sc.close();
		}
        
	}
	private static int getNoOfTransactionForTarget(int[] transaction, int target) {
		int sum= 0;
		for (int i=0; i<transaction.length; i++ ) {
			sum += transaction[i];
			if (sum >= target) {
				return i+1;
			}
		}
		return -1;
	}
}
