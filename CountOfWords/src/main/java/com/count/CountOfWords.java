package com.count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWords {
//	static Map<String,Integer> CountEachWords(String filename, Map<String, Integer> words) throws FileNotFoundException {
//		Scanner file = new Scanner(new File(filename));
//		while (file.hasNext()) {
//			String word = file.next();
//			Integer count = words.get(word);
//			if (count != null)
//				count++;
//			else
//				count = 1;
//			words.put(word, count);
//		}
//		file.close();
//		
//		return words;
//	}
	
	//updated
	
	static Map<String,Long> CountEachWords(List<String> list) throws FileNotFoundException {
		Map<String,Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) throws FileNotFoundException {
//		Map<String, Integer> words = new HashMap<String, Integer>();
//		CountEachWords("C:\\Users\\Nimmy\\OneDrive\\Desktop\\Java Program\\demo.txt", words);
//		System.out.println(words);
		
		//updated
		
		Scanner s = new Scanner(new File("C:\\Users\\Nimmy\\OneDrive\\Desktop\\Java Program\\demo.txt"));
		List<String> list = new ArrayList<String>();
		while (s.hasNext())
		{
			list.add(s.next());
		}
		s.close();
		CountEachWords(list);
	}
}

