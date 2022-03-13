package ma.CRYPTO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class ImperialDecypher_Ma {
	
	public static String Upper1 (String line) {
		String s = "";
		for (int i = 0; i <line.length(); i++) {
			char c = line.charAt(i);
			if (Character.isUpperCase(c) && Character.isLetter(c)) {
				s += line.substring(i,i+1);
			}
		}
		String r = s + "->{" + s.length() + "} ";
		return r;
	}
	
	public static String Lower1 (String line) {
		String s = "";
		for (int i = 0; i <line.length(); i++) {
			char c = line.charAt(i);
			if (Character.isLowerCase(c) && Character.isLetter(c)) {
				s += line.substring(i,i+1);
			}
		}
		String r = s + "->{" + s.length() + "} ";
		return r;
	}
	
	public static String Digit1 (String line) {
		String s = "";
		int sum = 0;
		for (int i = 0; i <line.length(); i++) {
			char c = line.charAt(i);
			if (Character.isDigit(c)) {
				s += line.substring(i,i+1);
				sum += Character.getNumericValue(c);
			}
		}
		String r = s + "->{" + sum + "} ";
		return r;
	}
	
	public static void decypher (String I, String O) throws IOException {
		
		String Ipath = "src/ma/ENCRYPTED_FILES/" + I;
		String Opath = "src/ma/PROCESSED_FILES/" + O;
		BufferedReader BR = new BufferedReader(new FileReader(Ipath));
		BufferedWriter BW = new BufferedWriter(new FileWriter(Opath));
		String line = "";
		while ((line = BR.readLine()) != null) {
			BW.write(Upper1(line));
			BW.write(Lower1(line));
			BW.write(Digit1(line));
			BW.write("\n");
		}		
		BR.close();
		BW.close();
		
		
	}

	public static void main(String[] args) {
		
	}

}
