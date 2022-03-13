package ma.SUPPORTING;

import ma.COLLECTOR.ParticleCollector;
import ma.EXTRACTOR.ParticleExtractor;
import ma.GENERATOR.Part_AGenerator;
import ma.GENERATOR.Part_BGenerator;
import ma.GENERATOR.Part_CGenerator;
import ma.REFINER.ParticleRefiner;

public class ParticleProcessing {
	
	
	public static void processParticles() {
		Part_AGenerator aGen = new Part_AGenerator("AGEN-1",new Location("Alpha",10,10));
		Part_BGenerator bGen = new Part_BGenerator("BGEN-1",new Location("Beta",30,20));
		Part_CGenerator cGen = new Part_CGenerator("CGEN-1",new Location("Gamma",50,30));
		ParticleCollector pCol = new ParticleCollector( "PCOLLECT", new Location("Lambda", 70, 40));
		ParticleExtractor pExt = new ParticleExtractor("PEXTRACT",new Location("Sigma",90,50));
		ParticleRefiner pRef = new ParticleRefiner("PREFINE","PX",new Location("Tau",120,60));
		for(int i = 0; i < 10; i++){
			pCol.collectParticle(aGen.generateParticle());
			pCol.collectParticle(bGen.generateParticle());
			pCol.collectParticle(cGen.generateParticle());
		}
		pExt.extractParticles(pCol);
		pRef.emptyExtractor(pExt);
		pRef.displayinfo();
		System.out.println();
		pRef.sampleParticles(3);		
	}
	
	public static void main(String[] args) {
		processParticles();
	}

}
