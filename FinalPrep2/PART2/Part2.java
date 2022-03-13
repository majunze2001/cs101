package ma.PART2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import ma.PART1.Scouttrooper;
import ma.PART1.Stormtrooper;

public class Part2 {
	
	public static ArrayList<Scouttrooper> buildScouts(int n) {
		ArrayList<Scouttrooper> t = new ArrayList<>();
		for (int i = 1;i <= n; i++) {
			t.add(new Scouttrooper("ST" + i, "S-00" + i));
		}
		return t;
	}

	public static boolean compareTroopers(Stormtrooper s1, Stormtrooper s2) {
		if (s1.getSTID().equals(s2.getSTID())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void writeScoutDataToFile(ArrayList<Scouttrooper> s) throws IOException {
		String out = "src/ma/PART2/STData";
		BufferedWriter bw = new BufferedWriter(new FileWriter(out));
		for (int i = 0; i < s.size(); i++) {
			bw.write(s.get(i).getType() + " ");
			bw.write(s.get(i).getIDNumber() + " ");
			bw.write(s.get(i).getSTID() + "\n");
		}
		bw.close();
	}
	
	public static void writeScoutDataToConsole(String path) throws IOException {
		String in = "src/ma/PART2/STData";
		BufferedReader br = new BufferedReader(new FileReader(in));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.print(line + "...\t");
		}
		br.close();
	}
	
}
