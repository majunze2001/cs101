package ma.MAIN;

import java.io.IOException;

import ma.FILEMOD.FileModifier;

public class MPrep1_Ma {

	public static void main(String[] args) throws IOException {
		FileModifier.reverseLineOrder("Data1", "MData1");
		FileModifier.lineSorter("Data2", "MData2");
		FileModifier.substituteSortReverse("Data3", "MData3");
		System.out.println("Complete");
	}

}
