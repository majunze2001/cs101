package ma.PARTI;

public class PaintBot extends Albot{

	public PaintBot(String BotlD) {
		super(BotlD);
		this.setBotType("Paint");
		this.setBotCost(1000);
	}

	@Override
	public String systemsReport(String s) {
		String t = "Bot System are " + s;
		return t;
	}
}
