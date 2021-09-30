import java.util.Scanner;

public class Geek {
	
	private String geeksName;
	private int numQuestions;
	
	public Geek (String name) {
		geeksName = name;
	}
	public String getName() {
		return geeksName;
	}
	public int getNumberOfQuestions() {
		return numQuestions;
	}
	public boolean isOdd (int num) {
		numQuestions++;
		if(num % 2 == 0)
			return false;
		else
			return true;
	}
	public String reverse(String text) {
		numQuestions++;
		int i, length = text.length();
		StringBuilder dest = new StringBuilder(length);
		for (i = (length - 1); i >= 0; i--){
	        dest.append(text.charAt(i));
	    }
	    return dest.toString();
	}
	public int sum (int num1, int num2) {
		numQuestions++;
		int total = 0;
		if (num1 < num2) {
			for (int j = 0; j <= (num2-num1); j++)
				total = total + (num1 + j);
			return total;
		}
		else if (num1 > num2) {
			for (int k = 0; k <= (num1-num2); k++)
				total = total + (num2 + k);
			return total;
		}
		else {
			return num1;
		}
	}
	public boolean sorted(int num1, int num2, int num3) {
		numQuestions++;
		if (num1 < num2) 
			if (num2 < num3) {
				return true;
			}
			else {
				return false;
		}
		else {
			return false;
		}
	}
	public int countSpace(String text) {
		numQuestions++;
		int spaces = 0;
		for (int l = 0; l < text.length(); l++) {
			if (text.charAt(l) == ' ') {
				spaces++;
			}
		}
		return spaces;	
	}
	public int countDigits(int num) {
		numQuestions++;
		int sum = 0;
		while (num > 0) {
			num = num/10;
			sum++;
		}
		return sum;
	}
	
}