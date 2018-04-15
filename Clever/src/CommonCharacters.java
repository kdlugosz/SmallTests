import java.util.HashSet;

/**
 * @author Kate Dlugosz
 *
 */
public class CommonCharacters {
	
	/**
	 * Returns a string of all characters common to both Strings
	 * Includes spaces, ignores case
	 * 
	 * @param a first String
	 * @param b second String
	 * @return 	String containing common characters
	 */
	public static String f(String a, String b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return "";
		}
		
		StringBuilder builder = new StringBuilder();
		HashSet<Character> charSetA = new HashSet<Character>();
		HashSet<Character> charSetB = new HashSet<Character>();
			for (Character c : a.toLowerCase().toCharArray()) {
				charSetA.add(c);
			}
			
			for (Character c : b.toLowerCase().toCharArray()) {
				charSetB.add(c);
			}
		
		for (Character c : charSetA) {
			if (charSetB.contains(c)) {
				builder.append(c);
			}
		}
		
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(f("cat", "attack"));
		System.out.println(f("attack", "cat"));
		System.out.println(f("dog", "cat"));
		System.out.println(f("", ""));
		System.out.println(f(null, null));
		System.out.println(f("Cats are fun.", "Dogs are cool too."));
	}

}
