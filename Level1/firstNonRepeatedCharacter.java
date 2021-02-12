import java.util.HashMap;
import java.util.Map;

class FirstNonRepeatedCharacter {

	public static Character firstNonRepeatedCharacter(String str) {
		char letters[] = str.toCharArray();

		HashMap<Character, Integer> letterCount = new HashMap<>();

		int count = 1;
		char nonRepeated = letters[0];

		for (int i = 0; i < letters.length; i++) {
			if (!letterCount.containsKey(letters[i])) {
				letterCount.put(letters[i], count);
			} else {
				count++;
				letterCount.put(letters[i], count);
				count--;
			}
		}

		if (letterCount.size() == 1) {
			for (int value : letterCount.values()) {
				if (value > 1) {
					return null;
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
			char c = entry.getKey();
			int value = entry.getValue();
			if (value == 1) {
				nonRepeated = c;
				break;
			}
		}

		return nonRepeated;

	}

	public static void main(String[]args){
		System.out.println(firstNonRepeatedCharacter("aaaa"));
	}
}