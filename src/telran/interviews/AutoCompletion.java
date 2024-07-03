package telran.interviews;

import java.util.ArrayList;
import java.util.List;

public class AutoCompletion {
	private List<String> words = new ArrayList<>();
	 public boolean addWord(String word) {
		
		 // adds new word into auto-completion variants
		 //returns true if added,false otherwise (if given word already exists)
		 boolean res = false;
		 if (!words.contains(word)) {
	            words.add(word);
	           res =true;
	        }
	        return res;
		 
	 }
	 public String [] getVariants(String prefix) {
		
		 //return all words beginning with given prefix
		//Complexity of finding the variants is O[logN]
		  List<String> variants = new ArrayList<>();
	       
	        for (String word : words) {
	            if (word.toLowerCase().startsWith(prefix)) {
	                variants.add(word);
	            }
	        }
	        return variants.toArray(new String[0]);
		 
		
	 }
}
