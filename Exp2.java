//program that parses string using split method of string class. The delimeter is underscore.
public class Exp2 {
	public static void main(String args[]) {
		String str = "Abhishek_Dutta_CSE_7th";
		String words[] = str.split("_");
		for(String w : words) {
			System.out.print("[" + w + "] ");
		}
	}
}