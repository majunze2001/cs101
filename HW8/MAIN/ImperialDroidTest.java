package ma.MAIN;

import ma.DROIDFACTORY.Sentry_AFactory;
import ma.DROIDFACTORY.Sentry_BFactory;
import ma.DROIDFACTORY.Sentry_CFactory;
import ma.IMPERIALDROID.SentryDroid_A;
import ma.IMPERIALDROID.SentryDroid_B;
import ma.IMPERIALDROID.SentryDroid_C;

public class ImperialDroidTest {

	public static void main(String[] args) {
		Sentry_AFactory AF = new Sentry_AFactory("AF001");
		AF.displayInfo();
		System.out.println();
		SentryDroid_A[] ads = AF.buildDroids_A(2);
		Sentry_AFactory.displayDroids(ads);
		ads[0].runDiagnostic();
		
		System.out.println();
		Sentry_BFactory BF = new Sentry_BFactory("BF001");
		BF.displayInfo();
		System.out.println();
		SentryDroid_B[] bds = BF.buildDroids_B(1);
		Sentry_BFactory.displayDroids(bds);
		bds[0].runDiagnostic();
		
		System.out.println();
		Sentry_CFactory CF = new Sentry_CFactory("CF001");
		CF.displayInfo();
		System.out.println();
		SentryDroid_C[] cds = CF.buildDroids_C(1);
		Sentry_CFactory.displayDroids(cds);
		cds[0].runDiagnostic();
	}
}
