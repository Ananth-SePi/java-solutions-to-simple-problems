package com.sepi.testclasses;

/**
 * @author Ananth-SePi
 * Problem statement: This restaurant's customers behave very consistently: the i-th customer to arrive (counting starting from 1)
 * always orders i pancakes. When the i-th customer places their order of i pancakes, you take i pancakes 
 * from the stack that has the most pancakes remaining (or from the left stack if both have the same amount). 
 * If neither stack has at least i pancakes, the restaurant closes and the i-th customer does not get served any 
 * pancakes. You never complete an order using pancakes from both stacks.
 * Output: For each test case, output one line containing Case #x: n l r, where x is the test case number 
 * (starting from 1), n is the number of customers who will be served, and l and r are the numbers of pancakes 
 * that will remain in the left and right stacks, respectively, when the restaurant closes.
 * Eg: Input:
 * 1
 * 1 2
 * Output: Case #1: 1 1 1
 */

import java.util.Scanner;

public class IncrementalHouseOfPancakes {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCaseSize = scanner.nextInt();
		for (Integer i = 0; i < testCaseSize; i++) {
			Integer left = scanner.nextInt();
			Integer right = scanner.nextInt();
			Integer pancakeCount = 1;
			Integer customerCount = 0;
			while (left >= pancakeCount || right >= pancakeCount) {
				if (right > left) {
					right = right - pancakeCount;
				} else {
					left = left - pancakeCount;
				}
				pancakeCount++;
				customerCount++;
			}
			System.out.println("Case #" + (i + 1) + ": " + customerCount + " " + left + " " + right);
		}
		scanner.close();
	}

}
