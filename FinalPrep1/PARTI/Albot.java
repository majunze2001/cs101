package ma.PARTI;

public abstract class Albot implements BotServices {
	private String BotID;
	private String BotType;
	private int BotCost;

	public Albot(String botlD) {
		super();
		BotID = botlD;
	}

	public Albot(String botlD, String botType, int botCost) {
		super();
		BotID = botlD;
		BotType = botType;
		BotCost = botCost;
	}

	public String getBotlD() {
		return BotID;
	}

	public void setBotlD(String botlD) {
		BotID = botlD;
	}

	public String getBotType() {
		return BotType;
	}

	public void setBotType(String botType) {
		BotType = botType;
	}

	public int getBotCost() {
		return BotCost;
	}

	public void setBotCost(int botCost) {
		BotCost = botCost;
	}

	@Override
	public String toString() {
		return "Albot:"
				+ "\nBotlD: " + BotID 
				+ "\nBotType: " + BotType 
				+ "\nBotCost: " + BotCost;
	}

	public void displayBotSpecs() {
		System.out.println(this.toString());
	}

}
