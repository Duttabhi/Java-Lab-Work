//program that parses string using scanner class and identify the number of different primitive datatatypes in the given string 
import java.util.*; 
public class Exp3 {
	public static void main(String args[]) {
		String str = "Abhishek 2 3.14 5 true";
		Scanner scn = new Scanner(str);
		int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
		while(scn.hasNext()) {
			if(scn.hasNextInt()) {
				System.out.print("[" + scn.nextInt() + "] ");
				cnt1++;
			}
			else if(scn.hasNextDouble()) { 
				System.out.print("[" + scn.nextDouble() + "] ");
				cnt2++;
			}
			else if(scn.hasNextBoolean()) { 
				System.out.print("[" + scn.nextBoolean() + "] ");
				cnt3++;
			}
			else {
				System.out.print("[" + scn.next() + "] ");
				cnt4++;
			}
	       }
	       System.out.println("The counts are...\nIntegers: " + cnt1 + " Double: " + cnt2 + " Boolean: " + cnt3 + " Strings: " + cnt4);					
	}
}