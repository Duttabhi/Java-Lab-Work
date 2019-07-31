//Write a program that parse a string using string tokenizer class and list all the tokens(delimiter is white space).
//StringTokenizer class
//the split() method
//scanner class
//pattern and matcher
import java.util.StringTokenizer;
public class Exp1 {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("Abhishek Dutta CSE 7th", " ");
		while(st.hasMoreTokens()) {
			System.out.print("[" + st.nextToken() + "] ");
		}
	}
}