package grandcircus.knightsandknaves;

public class KnightsAndKnavesApp {

	public static void main(String[] args) {
		Islander george = new Knight("George"); // Or bonus… = Islander.getRandom("George")
		Islander fanny = new Knave("Fanny"); // Or bonus… = Islander.getRandom("Knave")

		System.out.println("George says fanny is a knight? " + george.isKnight(fanny));
		System.out.println("George says he is a knave? " + george.isKnave(george));
		System.out.println("Fanny says George is a knave? " + fanny.isKnave(george));
		System.out.println("Fanny says she is a knight? " + fanny.isKnight(fanny));

		System.out.println("Spoilers: George is a " + george.getClass().getName());
		System.out.println("Spoilers: Fanny is a " + fanny.getClass().getName());
	}
}
