package ma.DROIDFACTORY;

import ma.IMPERIALDROID.SentryDroid_C;

public class Sentry_CFactory extends DroidFactory {
	
	public Sentry_CFactory(String iDNumber) {
		super(iDNumber, "Gamma Droids");
	}

	public SentryDroid_C[] buildDroids_C(int count) {
		SentryDroid_C[] dl = new SentryDroid_C[count];
		for (int i = 0; i < count; i++) {
			dl[i] = new SentryDroid_C("x");
		}
		return dl;
	}

	public static void displayDroids(SentryDroid_C[] dl) {
		for (SentryDroid_C i:dl) {
			i.displaySDC();
			System.out.println();
		}
	}

}
