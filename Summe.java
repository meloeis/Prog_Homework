// by Matthias Titze s0563413
// in team with Marvin Grimm: s0564581
// Aufgabe 4.1

public class Summe
{
	public static void main(String[] args)
	{
    	int n = 16;
    	// Ausgabe: Beide Methoden werden 72 als Ergebnis ausgeben.
    	System.out.println("Summe Iteration: " + summeIteration(n));
    	System.out.println("Summe Rekursion: " + summeRekursion(n));
	}

	public static int summeIteration(int n) {

		// Prüfe, ob der initiale Wert für n tatsächlich gerade ist.
		// Dies ist nicht unbedingt nötig, stellt jedoch die Eingabebedingung sicher.
		if (n % 2 != 0)
		{
			// Übergabeparameter n ungerade -> Abbruch
			System.out.println("Error: n was an uneven number!");
			return 0;
		}
		else {
			int sum = 0;
			// Iteriere durch alle natürlichen Zahlen i, die <= n sind.
			for (int i = n; i > 0; i--) {
				// Prüfe via Modulo, ob die Zahl i gerade, d.h. glatt durch 2 teilbar ist.
				if (i % 2 == 0) {
					// Wenn i gerade, dann addiere i zur Summe.
					sum += i;
				}
			}
			// Gib die Summe aller geraden natürlichen Zahlen <= n zurück.
			return sum;
		}
	}

	public static int summeRekursion(int n) {

		if (n == 0) {
			// Wenn n gleich 0 ist, ist die maximale Rekursionstiefe ereicht.
			return 0;
		}
		else if (n % 2 == 0) {
			// Wenn n gerade, dann addiere zum Rückgabewert und steige
			// ... weiter den Rekursionspfad hinab.
			return n + summeRekursion(n - 1);
		}
		else {
			// Wenn n ungerade, dann steige den Rekursionspfad hinab,
			// ... ohne n zur Somme hinzu zu fügen.
			return summeRekursion(n - 1);
		}
	}
}