package ma.MAIN;

import java.text.DecimalFormat;

public class MaHW1 {
	
	//the method to calculate the distance between two coordinations 
	public static double measure_d(int[] coor1, int[] coor2) {
		double x = coor1[0] - coor2[0]; double y = coor1[1] - coor2[1];
		double square = x * x + y * y;
		double d = Math.sqrt(square);
		return d;
	}
		
	//the method to print d with format
	public static void printd(double d) {
		DecimalFormat dfd = new DecimalFormat("##.## km");
		dfd.setMinimumFractionDigits(2);
		System.out.print(dfd.format(d));
		if (d < 10) {
			//when d < 10, an additional tab is needed to maintain the format
			System.out.print("\t");
		}
	}
	
	//the method to print t with format
	public static void printt(double d) {
		int t = (int) Math.round(20 * d);
		DecimalFormat dft = new DecimalFormat("### mins");
		System.out.print(dft.format(t));
		if (t < 100) {
			//when t < 100, an additional tab is needed to maintain the format
			System.out.print("\t");
		}
	}
	
	//corresponding index of the routes in the array of all destinations
	static int[] route1 = {2, 3, 5, 7};
	static int[] route2 = {1, 4, 6, 8};
	static int[] route3 = {0, 3, 5, 7};
	public static int[] findpath(int x) {
		//find the corresponding path of each stormtrooper
		if ( x == 1) {
			return route1;
		}else if (x == 2) {
			return route2;
		}else if (x == 3) {
			return route3;
		}
		return route1;
	}

		
	public static void main(String[] args) {
		// define the coordinates of Stormtrooper Teams, checkpoints and downed Rebel pilots
		int[] ST1 = {1, 5}; int[] ST2 = {2, 4}; int[] ST3 = {1, 3};
		
		int[] cpa = {3, 1}; int[] cpb = {4, 3}; int[] cpc = {5, 5};
		int[] cpd = {7, 3}; int[] cpe = {6, 1}; int[] cpf = {9, 5};
		int[] cpg = {8, 1};
		
		int[] R1 = {11, 5}; int[] R2 = {10, 1};
		
		//group the arrays
		int[][] listst = {ST1, ST2, ST3};
		int[][] listcp = {cpa, cpb, cpc, cpd, cpe, cpf, cpg};
		int[][] listcpr = {cpa, cpb, cpc, cpd, cpe, cpf, cpg, R1, R2};
		
		
		
		String[] route = {"C to D to F to R1", "B to E to G to R2", "A to D to F to R1"};
		
		//This is to print the Title 
		String[] list1 = {"CP A", "CP B", "CP C", "CP D", "CP E", "CP F", "CP G", "R1", "R2"};
		String[] list2 = {"CP A", "CP B", "CP C", "CP D", "CP E", "CP F", "CP G",};
		
		//TITLE1
		System.out.print("TEAM" + "\t\t\t\t\t\t\t\t"
		+ "DIRECT 2D EUCLIDEAN DISTANCE AND TIME TO");
		
		System.out.print("\n\t");
		
		//print the subtitle of destinations
		for (String name: list1) {
			System.out.print(name + "\t\t");
		}
		System.out.println();
		
		//for (each Stormtrooper)
		//calculate distances and times from (ST1) to check points and print
		int i = 0;
		for (int[] st:listst) {
			//print the subtitles of each Stormtrooper
			i += 1;
			System.out.print("ST " + i + "\t");
			//calculate the distances and print
			for (int[] cp: listcpr) {
				double d = measure_d(st, cp);
				printd(d);
				System.out.print("\t");
			}
			System.out.print("\n\t");
			
			//calculate the times and print	
			for (int[] cp: listcpr) {
				double d = measure_d(st, cp);
				printt(d);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}

		
		//TITLE2
		System.out.print("CHECKPOINT" + "\t\t\t\t\t"
				+ "DIRECT 2D EUCLIDEAN DISTANCE AND MOVEMENT TIME TO");
		System.out.println();
		
		//subtitles of checkpoints
		for (String name: list2) {
			System.out.print("\t\t" + name);
		}
		System.out.println();

		//for (each checkpoint)
		//calculate distances and times and print
		int n = 0;
		for (int[] cp1:listcp) {
			//print the subtitles of each checkpoint
			System.out.print(list2[n] + "\t\t");
			n += 1;
			for (int[] cp2: listcp) {
				//distances
				double d = measure_d(cp1, cp2);
				printd(d);
				System.out.print("\t");
			}
			System.out.print("\n" + "\t\t");
			for (int[] cp2: listcp) {
				//times
				double d = measure_d(cp1, cp2);
				printt(d);
				System.out.print("\t");
			}	
			System.out.println();		
			System.out.println();								
		}
				
		
		//TITLE3
		System.out.print("TEAM\t\tROUTE\t\t\t" + 	
				"TOTAL DISTANCE\t\tTOTAL TIME");
		System.out.println();	
		
		int m = 0;
		//for each stormtrooper
		for (int[] st: listst) {
			//print the name and corresponding route
			m += 1;
			System.out.print("ST" +  m + "\t\t");
			System.out.print(route[m-1]);
			System.out.print("\t");
			
			int[] routex = findpath(m);
			int[] location = st;
			double d = 0;
			//find the route,initialize the location and distance
			for (int k :routex) {
				double D = measure_d(location,listcpr[k]);
				//initial location is replaced repetitively 
				//distance is added 
				d = d + D;
				location = listcpr[k];	
			}
			printd(d);
			System.out.print("\t\t");
			printt(d);
			System.out.println();			
		}

		
	}
			
}



