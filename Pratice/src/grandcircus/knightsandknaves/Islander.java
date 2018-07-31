package grandcircus.knightsandknaves;

public abstract class Islander {

	private String name;

	public Islander(String name) {
		this.name = name;
	}

	public Islander() {
	}

	public String getName(String name) {
		return name;
	}

	public abstract boolean isKnight(Islander fanny);

	public abstract boolean isKnave(Islander george);

}
