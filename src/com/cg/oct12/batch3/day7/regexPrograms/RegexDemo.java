package com.cg.oct12.batch3.day7.regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String regex = "abc";
		String input = "abcjhsabcjsjsjs";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(matcher.matches());  //check regex with input
		System.out.println(matcher.lookingAt());  //check regex with starting of input
		System.out.println(matcher.find());   //check whether regex present in between in input
	}
}
