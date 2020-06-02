package com.sepi.testclasses;

/**
 * @author Ananth-SePi
 * Class to print the maximum delivery possible with the given 'k' resource.
 * order is the list of items to be delivered.
 * k is the items available.
 * @created on 02/06/2020
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaximumOrderDelivery {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer orderSize = scanner.nextInt();
		List<Integer> order = new ArrayList<>();
		Integer index = 0;
		// Iterates up to the size given to fetch the list input.
		for (index =0; index < orderSize; index++) {
			order.add(scanner.nextInt());
		}
		Integer k = scanner.nextInt();
		Integer sum = 0; // Sums up the orders possible with the resource 'k' given
        
		// Ordering the integer list ascendingly.
        order.sort(Comparator.naturalOrder());
        for (index = 0; index < order.size(); index++) {
            sum += order.get(index);
            if (sum > k) {
                break;
            }
        }
		System.out.println(index + "");
		scanner.close();
	}

}
