package ma.DROIDFACTORY;

import ma.IMPERIALDROID.SentryDroid_A;

public class Sentry_AFactory extends DroidFactory {

	public Sentry_AFactory(String iDNumber) {
		super(iDNumber, "Alpha Droids");
	}

	public SentryDroid_A[] buildDroids_A(int count) {
		SentryDroid_A[] dl = new SentryDroid_A[count];
		for (int i = 0; i < count; i++) {
			dl[i] = new SentryDroid_A("x");
		}
		return dl;
	}

	public static void displayDroids(SentryDroid_A[] dl) {
		for (SentryDroid_A i:dl) {
			i.displaySDA();
			System.out.println();
		}

	}

}
