package com.count;
//import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;



class CountOfWordsTest {
	@Test
	public void ifWordsAreGivenShouldReturnTheCountOfEachWord() throws FileNotFoundException
	{
//		Map<String, Integer> words = new HashMap<String, Integer>();
//		
//		Map<String, Integer> vwords=new HashMap<String, Integer>();
//		
//		vwords.put("How", 1);
//		vwords.put("Hi,", 1);
//		vwords.put("are", 2);
//		vwords.put("you.", 1);
//		vwords.put("fine.", 1);
//		vwords.put("Hope", 1);
//		vwords.put("you", 1);
//		
//		CountOfWords.CountEachWords("C:\\Users\\Nimmy\\OneDrive\\Desktop\\Java Program\\demo.txt",words);
//		
//		assertThat(vwords, is(words));
		
		
		//updated
		
		
		Map<String, Long> words = new HashMap<String, Long>();
		
		List<String> list = new ArrayList<String>(Arrays.asList("Hi,","How","are","you.","Hope","you","are","fine."));
		
		Map<String, Long> vwords=new HashMap<String, Long>();
		
		vwords.put("Hi,", 1L);
		vwords.put("How", 1L);
		vwords.put("are", 2L);
		vwords.put("you.", 1L);
		vwords.put("Hope", 1L);
		vwords.put("you", 1L);
		vwords.put("fine.", 1L);
		
		words=CountOfWords.CountEachWords(list);
		
		assertThat(vwords, is(words));
		
//		vwords.equals(new File("C:\\Users\\Nimmy\\OneDrive\\Desktop\\Java Program\\demo.txt"));  
	


}
}
