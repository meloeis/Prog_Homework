// by Matthias Titze s0563413
// in team with Marvin Grimm: s0564581
// Aufgabe 4.3

public class GGTeiler
{
	public static void main(String[] args) {

		int testZahlA = 96;
		int testZahlB = 56;

		System.out.println("Größter gemeinsamer Teiler von " + testZahlA + " und " + testZahlB);
		System.out.println("Euklid Rekursion: " + euklidRekursion(testZahlA, testZahlB));
		System.out.println("Euklid Iteration: " + euklidIteration(testZahlA, testZahlB));
	}

	public static int euklidRekursion(int a, int b) {

		if (a == b) {
			return a;
		}
		else if (a < b) {
			return euklidRekursion(a, b - a);
		}
		else {
			return euklidRekursion(a - b, b);
		}
	}

	public static int euklidIteration(int a, int b)
	{
		do {
			if (a < b)
				b = b - a;
			else
				a = a - b;
		}
		while (a != b);

		return a;
	}
}