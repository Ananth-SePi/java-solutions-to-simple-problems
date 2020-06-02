package com.sepi.testclasses;

/**
 * @author Ananth-SePi
 * Class to demo string anagram.
 * @created on 02/06/2020
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> dictionary = new ArrayList<>();
		List<String> query = new ArrayList<>();
		Integer dictionarySize = scanner.nextInt();
		Integer index = 0;
		// Iterates up to the size given to fetch the list input.
		for (index = 0; index < dictionarySize; index++) {
			dictionary.add(scanner.next());
		}
		Integer querySize = scanner.nextInt();
		for (index = 0; index < querySize; index++) {
			query.add(scanner.next());
		}
        List<Integer> resultList = new ArrayList<>();
        // Sorts the characters of the string
        for (Integer d1 = 0; d1 < dictionary.size(); d1++) {
        	dictionary.set(d1, Stream.of(dictionary.get(d1).split("")).sorted().collect(Collectors.joining()));
        }
        // Groups the input to map with the count of occurrence.
        Map<String, Long> tempMap = dictionary.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Loop to check the query against the map we generated and to add the count to the resultList.
        for (Integer q1 = 0; q1 < query.size(); q1++) {
        	query.set(q1, Stream.of(query.get(q1).split("")).sorted().collect(Collectors.joining()));
        	resultList.add(tempMap.getOrDefault(query.get(q1), 0l).intValue());
        }
        resultList.forEach(System.out::println);
        scanner.close();
	}

}
