package com.esource.interview.playingwithnumbers.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class NumbersService {

	private static Set<Integer> numbersSet = new HashSet<>(); // initializing hashset
	
	
	
	static {
		
		IntStream.range(0, 51)
		  .forEach(number -> {
			  numbersSet.add(number);
		  });
		
		
	}
	
	public Set<Integer> getAvailableNumbers(int[] arr1, int[] arr2, int[] arr3) throws Exception {
		
		Set<Integer> availableNumbers = new HashSet<>();
		
		HashSet<Integer> providedNumbers = new HashSet<>();
		
		try {
			
			Arrays.stream(arr1).forEach(num -> {
				providedNumbers.add(num);
			});
			
			Arrays.stream(arr2).forEach(num -> {
				providedNumbers.add(num);
			});
			
			Arrays.stream(arr3).forEach(num -> {
				providedNumbers.add(num);
			});
			
			populateIfNotPresent(providedNumbers,availableNumbers);

			return availableNumbers;

		} 
		
		catch(NullPointerException ne) {
			throw new Exception("::NumbersService.java::getAvailableNumbers()::null pointer exception occured, make sure input arrays are not null::" + ne.getMessage());
		}
		catch (Exception e) {
			throw new Exception("::NumbersService.java::getAvailableNumbers()::" + e.getMessage());
		}

	}
	
	private void populateIfNotPresent(Set<Integer> provided, Set<Integer> availableNumbers) throws Exception {
		
		try {
			for(int num:numbersSet) {
				if(!provided.contains(num)) {
					availableNumbers.add(num);
				} 
			}
		} 
		
		catch(NullPointerException ne) {
			throw new Exception("::Null pointer at populateIfNotPresent(), make sure the arguments are not null::"+ne.getMessage());
		}
		catch (Exception e) {
			throw new Exception("::populateIfNotPresent()::"+e.getMessage());
		} 
		
	}
	
	
	
	
	
	

	
}



