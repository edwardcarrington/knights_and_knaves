package grandcircus.knightsandknaves;

public class Knight extends Islander {

	public boolean knight;

	public Knight(boolean knight) {
		super();
		this.knight = knight;
	}

	public Knight() {
	}

	public Knight(String string) {
		// TODO Auto-generated constructor stub
	}

	public void setKnight(boolean knight) {
		this.knight = knight;
	}

	public boolean isKnight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Knight [knight=" + knight + "]";

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
