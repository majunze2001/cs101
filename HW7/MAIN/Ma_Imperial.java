package ma.MAIN;

import java.util.ArrayList;

import ma.ENUMS.Stormtrooper;
import ma.SUPPORT.Location;
import ma.SUPPORT.Position;
import ma.SUPPORT.Target;
import ma.WALKERS.ATAT;

public class Ma_Imperial {
	public static void main(String[] args) {
		ATAT x = new ATAT("Ma Imperial 1");
			Position hoth = new Position("Hoth", new Location(10, 10, 10));
			Position rebelBase = new Position("Rebel Base", new Location(15, 20, 10));
		x.setCurrentPosition(hoth);
		x.displayWalkerSpecs();
		x.moveToPosition(rebelBase);

		System.out.println();
			ArrayList<Stormtrooper> st = new ArrayList<>();
				st.add(Stormtrooper.Standard);
				st.add(Stormtrooper.Assault);
				st.add(Stormtrooper.Scout);
		x.embarkTroopers(st);
		
		System.out.println();
		x.displayWalkerSpecs();

		System.out.println();
		x.disembarkTroopers();
		x.rollCall();
		
		System.out.println();
		Target t = new Target("Tg1");
		t.setPos(new Position(t.getTgt(), new Location(10, 10, 10)));
		x.fireLaserCannons(t);
		x.fireHeavyBlasters(t);
		x.assaultPosition(t.getPos());
	}

}
