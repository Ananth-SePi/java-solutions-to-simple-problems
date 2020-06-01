package com.sepi.testclasses;

/**
 * @author Ananth-SePi
 * Class to get the minimum swap count to make the adjacent characters not repetitive.
 * Example: For the input SRSRRSSR the minimum swap count is 2; char at 4 and 5 needs to be changed
 * to get the no adjacent repetitive characters
 * @created on 01/06/2020
 */

import java.util.Scanner;

public class MinimumSwap {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		Integer sCount = 0, rCount = 0;
		String[] strArray = inputString.split("");
		String[] notationArray = new String[] {"S", "R"};
		Integer length = strArray.length % 2 == 0 ? strArray.length : strArray.length - 1;
		for (Integer index = 0; index < length; index++) {
			// Checks alternative character and adds up the count of its corresponding.
			if (!strArray[index].equals(notationArray[index % 2])) {
				sCount++;
			} else if (!strArray[index].equals(notationArray[(index + 1) % 2])) {
				rCount++;
			}
		}
		System.out.println(sCount > rCount ? rCount : sCount);
		scanner.close();
	}

}
