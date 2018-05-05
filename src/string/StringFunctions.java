package string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFunctions objStringFunctions = new StringFunctions();
		objStringFunctions.duplicateWords("Bread butter and bread");
		 
		objStringFunctions.duplicateWords("Java is java again java");
 
		objStringFunctions.duplicateWords("Super Man Bat Man Spider Man");

	}
	
	
	
	public void duplicateWords(String inputString)
    {
        //Splitting inputString into words
 
        String[] words = inputString.split(" ");
 
        //Creating one HashMap with words as key and their count as value
 
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
 
        //Checking each word
 
        for (String word : words)
        {
            //whether it is present in wordCount
 
            if(wordCount.containsKey(word.toLowerCase()))
            {
                //If it is present, incrementing it's count by 1
 
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }
            else
            {
                //If it is not present, put that word into wordCount with 1 as it's value
 
                wordCount.put(word.toLowerCase(), 1);
            }
        }
 
        //Extracting all keys of wordCount
 
        Set<String> wordsInString = wordCount.keySet();
 
        //Iterating through all words in wordCount
 
        for (String word : wordsInString)
        {
            //if word count is greater than 1
 
            if(wordCount.get(word) > 1)
            {
                //Printing that word and it's count
 
                System.out.println(word+" : "+wordCount.get(word));
            }
        }
    }
 
	public void countTheWords(String sentence){
        String[] words = sentence.trim().split(" "); 
        System.out.println("Number of words in the string = "+words.length);
	}
	
	public void stringReverseIterative(String str){
		
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     //Output : avaJyM
		}
	}
	
	public String stringReverseRecursive(String str){
		if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }	 
	     return stringReverseRecursive(str.substring(1)) + str.charAt(0);
	}
	
	public String stringConcatenation(String s1, String s2){
		String strConcat = s1+s2;
		String finalConcat ="Check";
		return strConcat.concat(finalConcat);
	}
	
	public void stringConcatDiffDataType(){
		int i = 5000;
		 
        double d = 6000.0006;
 
        String s = "Java";
 
        System.out.println(i+d+s);      //Output : 11000.0006Java
 
        System.out.println(s+i+d);      //Output : Java50006000.0006
 
        System.out.println(i+s+d);      //Output : 5000Java6000.0006
	}
	
	public void stringSubString(){
		String s = "Java Concept Of The Day";
		 
        String subString1 = s.substring(11);     
 
        System.out.println(subString1);           //Output : t Of The Day
 
        String subString2 = s.substring(5, 15);
 
        System.out.println(subString2);         //Output : Concept Of
	}

}
