// by Matthias Titze s0563413
// in team with Marvin Grimm: s0564581
// Aufgabe 4.2

public class Quersumme
{
	public static void main(String[] args) {

		int testZahl = 569;

		// Für die gegebene Testzahl ist die Quersumme und Ausgabe 20.
		System.out.println(quersumme(testZahl));
	}

	public static int quersumme(int zahl) {

		if (zahl < 10) {
			// Wenn die Zahl kleiner als 10 ist, so haben wir die letzte Ziffer erreicht.
			// Diese kann direkt zurück gegeben werden.
			return zahl;
		} else {
			/* Ist die Zahl größer als 10, so ermitteln wir zunächst die letzte Ziffer.
			Dies ist der Rest einer Ganzzahldivision durch 10 (Modulo 10).
			Anschließend schneiden wir diese lezte Ziffer via Ganzzahldivision durch 10 ab
			und reichen die so verkürzte Zahl erneut (rekursiv) an die Methode weiter.
			Die zuvor ermittelte Endziffer addiert sich zu der Ziffer, die der jeweils
			nächste Methodenaufruf zurück geben wird.
			*/
			return (zahl % 10) + quersumme(zahl / 10);		
		}
	}
}