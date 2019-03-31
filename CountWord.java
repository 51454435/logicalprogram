package com.general;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		countWord("This is a Laptop is a dell Laptop");
	}

	public static void countWord(String words) {
		Map<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
		String[] value = words.split(" ");

		for (String word : value) {
			if (hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word) + 1);
			} else {
				hashMap.put(word, 1);
			}
		}
		System.out.println(hashMap);

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
