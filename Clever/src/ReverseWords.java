/**
 * @author Kate Dlugosz
 *
 */
public class ReverseWords {
	
	/**
	 * Reverses the order of words in a String
	 * Returns empty string if sentence is empty or null
	 * 
	 * @param the sentence to be reversed
	 * @return the reversed sentence
	 */
	public static String reverseWords(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return "";
		}
		String[] split = sentence.split("\\s");
		StringBuilder builder = new StringBuilder();
		
		for (int i = split.length - 1; i >= 0; i--) {
			builder.append(split[i] + " ");
		}
		
		String reversed = builder.toString();
		return reversed.trim();
	}

	/** Tests the function
	 * @param args
	 */
	public static void main(String[] args) {
		String test1 = "Hello world";
		String test2 = "";
		String test3 = null;
		String test4 = "Hello world I am testing";
		
		System.out.println(reverseWords(test1).equals("world Hello"));
		System.out.println(reverseWords(test2).equals(""));
		System.out.println(reverseWords(test3).equals(""));
		System.out.println(reverseWords(test4).equals("testing am I world Hello"));

	}

}
