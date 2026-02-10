package com.String;

import java.util.Arrays;

public class ReverseWord {

	public static void main(String[] args) {

		String s = "Welcome to Factum";

		String[] words = s.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			result.append(new StringBuilder(words[i]).reverse());
			if (i < words.length - 1) {
				result.append(" "); // add space except after last word
			}
		}

		System.out.println(result.toString());
		
	}
}
