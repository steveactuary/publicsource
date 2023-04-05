package com.esource.interview.playingwithnumbers;

import java.util.*;
import com.esource.interview.playingwithnumbers.primeNumberService.PrimeNumberService;
import com.esource.interview.playingwithnumbers.service.NumbersService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbersService numberService = new NumbersService();
		PrimeNumberService primeService = new PrimeNumberService();

		try {
			int[] array1 = generateRandomArray(15);
			int[] array2 = generateRandomArray(15);
			int[] array3 = generateRandomArray(15);
			Set<Integer> availableNumers = numberService.getAvailableNumbers(array1, array2,array3); 
			int largestPrimeNumber = primeService.LargestPrimeNumber(availableNumers);
			System.out.println(availableNumers);
			
			System.out.println(largestPrimeNumber);
			
			
			
		} catch (Exception e) {
			System.out.println("Exception occured in application:: Error detail::" + e.getMessage());
		}

	}

	private static int[] generateRandomArray(int size) {
		int[] arr = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(51);
		}
		return arr;
	}

}
