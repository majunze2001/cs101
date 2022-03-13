package ma.MAIN;

import java.io.IOException;
import java.util.ArrayList;

import ma.PART1.*;
import ma.PART2.*;

public class MaFinal {
	
	public static void main(String[] args) throws IOException{
		Assaulttrooper A = new Assaulttrooper("ASLT-1","A-001");
		A.displayTrooper();
		A.move();
		ArrayList<Scouttrooper> S = Part2.buildScouts(3);
		Part2.compareTroopers(S.get(0), S.get(1));
		Part2.writeScoutDataToFile(S);
		System.out.println();
		String s = "/Ma_FinalPracticeB/src/ma/PART2/STData";
		Part2.writeScoutDataToConsole(s);

	}

}
