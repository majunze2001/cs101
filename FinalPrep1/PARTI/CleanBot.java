package ma.PARTI;

public class CleanBot extends Albot{
	
	public CleanBot(String BotlD) {
		super(BotlD);
		this.setBotType("Clean");
		this.setBotCost(1200);
	}

	@Override
	public String systemsReport(String s) {
		String t = "Bot System are " + s;
		return t;
	}
	
	
}
