package ma.MAIN;

import java.text.DecimalFormat;

public class MaHW2 {
	
	//the velocity based on time
	public static double velocity (int t) {
		if (t == 0) {
			return 0.0;
		}else if (t <= 4) {
			return 4.0;
		}else if (t <= 8) {
			return 2.0;
		}else {
			return 1.0;
		}
	}
	
	public static void main(String[] args) {
		
		//print title
		System.out.println("\t\t\t\t\t\t\t    Stormtrooper Movement Calculations Chart");
		System.out.println("\t\t\t\t\t\t\t\tChart Prepared By Jeff (Junze) Ma");
		System.out.println();
		System.out.println("Hour\tCurrent Location\tCurrent Speed\t Distance (Hour)\t"
				+ "Total Distance (Hour)\tDistance Remaining\tWater Consumed\tWater Remaining");
		System.out.println();
		System.out.println("_______________________________________________________________________"
				+ "________________________________________________________________________________");
		
		//calculate sine and cosine for 45 degrees
		double rad = Math.toRadians(45);
		double sin = Math.sin(rad);
		double cos = Math.cos(rad);
		
		//number formatting
		DecimalFormat loc = new DecimalFormat("0.#");
		DecimalFormat vel = new DecimalFormat("0.0 kph");
		DecimalFormat dish = new DecimalFormat("0.0 km");
		DecimalFormat dist = new DecimalFormat("##.# km");
		DecimalFormat disr = new DecimalFormat("##.## km");
		DecimalFormat wa = new DecimalFormat("0.0 l");
		DecimalFormat df = new DecimalFormat("##.##");
		
		
		//initialize the time, the location, the total distance, and the water
		int t = 0; double[] location = {10,10}; double d = 0; double wac = 0; double war = 18; 
			
		while (location[0] < 30) {
			//before the Stormtrooper Squad reaches the destination
			
			System.out.print(t + "\t");
			//print the time column
			
			double v = velocity(t);
			location[0] = location[0] + v * cos;
			location[1] = location[1] + v * sin;
			//calculate the new location
			if (location[0] > 30) {
				location[0] = 30;
				location[1] = 30;
			}
			//in case at last the squad passes the destination
			System.out.print(loc.format(location[0]) + "," + loc.format(location[1]) + "\t\t");
			//print the location column
			String s = loc.format(location[0]);
			if (s.length() == 2) {
				System.out.print("\t");
			}
			//add the additional tab for integer coordinations
			
			System.out.print(vel.format(v) + "\t\t ");
			//print the formatted speed
			System.out.print(dish.format(v) + "\t\t\t");
			//distance per hour = v * 1 (omitted)
			
			d = Math.sqrt((10 - location[0]) * (10 - location[0]) + (10 - location[1]) * (10 - location[0]));
			System.out.print(dist.format(d) + "\t\t\t");
			//calculate the total distance and print
			//I would like to ask why there is no need to add an additional tab here
			
 			double dremain = Math.sqrt((30 - location[0]) * (30 - location[0]) + (30 - location[1]) * (30 - location[0]));
 			System.out.print(disr.format(dremain) + "\t\t");
 			if (dremain < 10) {
 				System.out.print("\t");
 			}
 			//calculate the remaining distance and add the additional tab when printing
 			
 			wac = 1.5 * t;
 			if (wac > 18) {
 				wac = 0;
 			}
 			System.out.print(wa.format(wac) + "\t\t"); 
 			//water consumed is 0 in the last hour
 			
 			war = 18 - 1.5 * t;
 			if (war < 0) {
 				war = 0;
 			}
 			System.out.println(wa.format(war)); 
 			//water remaining is also 0 in the last hour
 			
 			if (location[0] < 30) {
 				t ++;
 			}
 			//when t = 13, the loop is executed and the Stormtrooper Squad arrived
 			//so there is no need to add another 1 to time
			
		}
		System.out.println();
		
		
		System.out.println("The Stormtrooper Squad arrived in " + t
				+ " hours and travelled " + df.format(d) + " kilometers");
		
		double avs = d/t;
		//average speed = total distance / total time
		System.out.print("The Stormtrooper Squad's average speed was "
				+ df.format(avs) + " kph");	

	}

}
