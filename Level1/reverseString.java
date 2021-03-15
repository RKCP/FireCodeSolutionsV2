public class reverseString {

	public static String reverse(String str) {

		StringBuilder outputString = new StringBuilder();

		if (str == null) {
			return null;
		} else {
			for (int i = str.length()-1; i >= 0; i--) {
				outputString.append(str.charAt(i));
			}
		}
		return outputString.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("raphael"));
	}
}
