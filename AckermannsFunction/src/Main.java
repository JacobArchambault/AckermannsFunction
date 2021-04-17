
public class Main {

	static int ackermann(final int m, final int n) {
		if (m == 0) {
			return n + 1;
		}
		if (n == 0) {
			return Main.ackermann(m - 1, 1);
		} else {
			return Main.ackermann(m - 1, Main.ackermann(m, n - 1));
		}
	}

	public static void main(final String[] args) {
		System.out.println("ackermann(0, 0) = " + Main.ackermann(0, 0));
		System.out.println("ackermann(0, 1) = " + Main.ackermann(0, 1));
		System.out.println("ackermann(1, 1) = " + Main.ackermann(1, 1));
		System.out.println("ackermann(1, 2) = " + Main.ackermann(1, 2));
		System.out.println("ackermann(1, 3) = " + Main.ackermann(1, 3));
		System.out.println("ackermann(2, 2) = " + Main.ackermann(2, 2));
		System.out.println("ackermann(3, 2) = " + Main.ackermann(3, 2));
	}
}
