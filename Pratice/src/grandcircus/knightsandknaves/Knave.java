package grandcircus.knightsandknaves;

public class Knave extends Islander {

	public Knave(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isKnight(Islander fanny) {
		if (fanny instanceof Knight) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isKnave(Islander george) {
		// TODO Auto-generated method stub
		return false;
	}
}
