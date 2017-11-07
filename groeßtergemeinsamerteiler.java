
public class groeßtergemeinsamerteiler {

	public static void main(String[] args) {
		teiler(96, 56);
	}

	public static int teiler(int n, int m) {

		if (n != m) {
			if (n > m) {
				n = n - m;
			} else {
				m = m - n;
			}

			teiler(n, m);
			return 0;

		} else

			System.out.println(n);
		return n;

	}

}
