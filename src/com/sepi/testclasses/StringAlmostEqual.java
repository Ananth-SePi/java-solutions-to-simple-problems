package com.sepi.testclasses;

/**
 * You are given two strings s1 and s2 of equal length. 
 * A string swap is an operation where you choose two indices in a string (not necessarily different) 
 * and swap the characters at these indices.
 * Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. 
 * Otherwise, return false.
 * 	
 * @author Ananth-SePi
 */

public class StringAlmostEqual {

	public static void main(String[] args) {
		// Case: equal after one swap
		System.out.println(areAlmostEqual("bank", "bnak"));
		// Case: equal without swapping
		System.out.println(areAlmostEqual("admin", "admin"));
		// Case: requires more than one swap and so returns false
		System.out.println(areAlmostEqual("user", "erus"));
	}

	public static boolean areAlmostEqual(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		if (s1.equals(s2))
			return true;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				StringBuilder sb1 = new StringBuilder(s1);
				StringBuilder sb2 = new StringBuilder(s2);
				char temp = sb1.charAt(i);
				sb1.setCharAt(i, sb1.charAt(j));
				sb1.setCharAt(j, temp);
				if (sb1.toString().equals(sb2.toString()))
					return true;
			}
		}

		return false;
	}

}
