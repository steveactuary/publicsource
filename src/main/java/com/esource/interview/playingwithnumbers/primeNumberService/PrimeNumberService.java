package com.esource.interview.playingwithnumbers.primeNumberService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class PrimeNumberService {
	
	public int LargestPrimeNumber(Set<Integer> arr) {
       
        List<Integer> primeList = new ArrayList<Integer>();
        for (int num : arr) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }

        
        int[] primeArr = new int[primeList.size()];
        for (int i = 0; i < primeArr.length; i++) {
            primeArr[i] = primeList.get(i);
        }
        Arrays.sort(primeArr);

        return primeArr[primeList.size()-1];
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}




