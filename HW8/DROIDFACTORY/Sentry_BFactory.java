package ma.DROIDFACTORY;

import ma.IMPERIALDROID.SentryDroid_B;

public class Sentry_BFactory extends DroidFactory {
	
	public Sentry_BFactory(String iDNumber) {
		super(iDNumber, "Beta Droids");
	}

	public SentryDroid_B[] buildDroids_B(int count) {
		SentryDroid_B[] dl = new SentryDroid_B[count];
		for (int i = 0; i < count; i++) {
			dl[i] = new SentryDroid_B("x");
		}
		return dl;
	}

	public static void displayDroids(SentryDroid_B[] dl) {
		for (SentryDroid_B i:dl) {
			i.displaySDB();
			System.out.println();
		}
	}

}
