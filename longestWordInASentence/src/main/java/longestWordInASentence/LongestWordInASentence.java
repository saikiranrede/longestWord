package longestWordInASentence;

import java.util.HashMap;

public class LongestWordInASentence {
	
	public static final String keyLen = "length";
	public static final String LongWord = "longest word";
	
	public static void main(String[] args) {
		try {
			String phrase = args[0];
			System.out.println(lengthOfaWordInASentence(phrase).values());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception message: "+ e.getMessage());
			e.printStackTrace();
		}
	}

	public static HashMap<String,Object> lengthOfaWordInASentence(String sentence){
		int wordLen = 0;
		String longestWord = "";
		String[] words = null;
		HashMap<String, Object> hm = new HashMap<String, Object>();
		try {
			words = sentence.split(" ");
			for(String word : words) {
				if(word.length() > wordLen) {
					wordLen = word.length();
					longestWord = word;
				}
			}
			hm.put(keyLen, wordLen);
			hm.put(LongWord, longestWord);
			return hm;
		} catch(NullPointerException e){
			System.out.println("Null pointer exception : "+e.getMessage());
			e.printStackTrace();
		}
		return hm;
	}

}
