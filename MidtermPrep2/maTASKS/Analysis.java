package maTASKS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
//import java.util.Arrays;

import ma.HELPERS.Helper;

public class Analysis {
	
	
	public static void AnalysizeResults (String I, String O) throws IOException {
		
		String Ipath = "src/ma/RESULTS/" + I;
		String Opath = "src/ma/RESULTS/" + O;
		
		String[] data = Helper.readeles(Ipath);
		
		double n = data.length;
		double PP = Helper.countPP(data);
		double NN = Helper.countNN(data);
		double PN = Helper.countPN(data);
		double NP = Helper.countNP(data);
		
		
		double pPP = 100 * (PP/n);
		double pNN = 100 * (NN/n);
		double pNP = 100 * (NP/n);
		double pPN = 100 * (PN/n);
		
		
		DecimalFormat df = new DecimalFormat("00.00");
		DecimalFormat dft = new DecimalFormat("00");
		
		BufferedWriter BW = new BufferedWriter(new FileWriter(Opath));
		
		BW.write("Imperial Network Maleware Detector Validation Results");
		BW.newLine();
		BW.newLine();

		BW.write("Networks Tested: " + dft.format(n));
		BW.newLine();
		BW.newLine();
		
		BW.write("Total Positive Tests: " + dft.format(PP + PN));
		BW.newLine();
		
		BW.write("Total Negative Tests: " + dft.format(NN + NP));
		BW.newLine();
		
		BW.write("\tPositive %: " + df.format(pPP + pPN));
		BW.newLine();
		
		BW.write("\tNegative %: " + df.format(pNN + pNP));
		BW.newLine();
		
		BW.write("True Positive Tests: " + dft.format(PP));
		BW.newLine();
		
		BW.write("True Negative Tests: " + dft.format(NN));
		BW.newLine();
		
		BW.write("\tDetector Correct %: " + dft.format(PP+NN) + " out of " + dft.format(n) + "... " + df.format(pPP + pNN) + "%");
		BW.newLine();
		
		BW.write("False Positive Tests: " + dft.format(NP));
		BW.newLine();
		
		BW.write("False Negative Tests: " + dft.format(PN));
		BW.newLine();
		
		BW.write("\tDetector Correct %: " + dft.format(NP+PN) + " out of " + dft.format(n) + "... " + df.format(pNP + pPN) + "%");
		BW.newLine();
		
		BW.newLine();
		BW.write("_____________________________Analysis Prepared By Jeff Ma");
		
		
		BW.close();	
	}
	
	public static void main(String[] args) throws IOException {
		
		/*String Ipath = "src/ma/RESULTS/Results";
		String[] rawd = Helper.readfile(Ipath);
		
		String raw = "";
		for (String i: rawd) {
			raw += i.trim() + " ";
		}
		
		String[] data = raw.split(" ");
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(data));
		System.out.println(data.length);

		System.out.println(Arrays.toString(a));*/
		

		
		
	}


}
