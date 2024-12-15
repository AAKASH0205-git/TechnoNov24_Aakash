package first_project_1;

/* Return "Upper" if uppercase frequency is higher than lowercase frequency
 * other return "lower". if both having same freqency then return "same".
 */

public class Aakash_Assignment35 {

	public String returnCount(String str) {

		String result = "";
		int upperCaseFreq = 0;
		int lowerCaseFreq = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				lowerCaseFreq++;

			} else if (Character.isUpperCase(ch)) {
				upperCaseFreq++;
			}
		}
		if (lowerCaseFreq == upperCaseFreq) {
			result = "same";

		} else if (lowerCaseFreq > upperCaseFreq) {
			result = "lower";

		} else {
			result = "upper";
		}
		return result;

	}

	public static void main(String[] args) {
		Aakash_Assignment35 a35 = new Aakash_Assignment35();
		String freq = a35.returnCount("teChnOcreDits");
		System.out.println(freq);
	}

}
