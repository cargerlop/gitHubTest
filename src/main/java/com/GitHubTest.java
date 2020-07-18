package com;

import java.util.HashMap;
import java.util.Map;

public class GitHubTest {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("############");
		
		int[] numbers = new int[]{1,5,7,8,9,6}; 
		int target = 9;
		int[] result = twoNumbersFromListToGetTarget(numbers, target);
		System.out.println("1: "+result[0]+" 2: "+result[1]);
	}

	public static int[] twoNumbersFromListToGetTarget(int[] numbers, int target){
		Map<Integer, Integer> processed = new HashMap<>();
		for(int i = 0; i < numbers.length; i++){
			Integer delta = target - numbers[i];
			if(processed.containsKey(delta)){
				return new int[]{processed.get(delta),i};
			}else{
				processed.put(numbers[i], i);
			}
		}
		return new int[]{0,0};
	}
}
