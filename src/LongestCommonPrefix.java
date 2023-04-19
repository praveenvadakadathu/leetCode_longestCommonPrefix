public class LongestCommonPrefix {

	public static void main(String[] args) {

		System.out.println(longestCommonPrefix(new String[] { "dog", "doggy", "dodge" }));
	}

	/**
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		String result = "";
		String first = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(first) != 0) {
				first = first.substring(0, first.length() - 1);
			}

		}
		if (first.isEmpty()) {
			return "no matches";
		}
		return first;
	}

}
