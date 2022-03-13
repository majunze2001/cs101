package ma.MAIN;

import ma.PARTI.*;
import ma.PARTII.Part2;

public class test {
	
	public static void displayArray(int[] v) {
		for(int i = 0; i < v.length;i++) {
			System.out.println(v[i]);
		}
		System.out.println();
	}
	
	public static void displayArray(String[] v) {
		for(int i = 0; i < v.length;i++) {
			System.out.println(v[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		PaintBot pb = new PaintBot("LP-1");
		CleanBot cb = new CleanBot("LC-1");
		pb.displayBotSpecs();
		System.out.println(cb.systemsReport("Very Likeable"));
		System.out.println();
		String[][] A = {{"Me","You","Ever","Home","Some"},
				{"Better","Him","Her","Last","First"}};
		displayArray(Part2.bigSmallWord(A));
		int[][] B = {{1,1,2,1,1},{2,1,2,2,2},{2,1,1,1,2}};
		displayArray(Part2.sumOddEven(B));

	}

}

