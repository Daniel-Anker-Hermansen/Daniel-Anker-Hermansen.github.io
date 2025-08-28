import java.util.HashSet;

class Main2 {
	private static void solve(Kattio io) {
		int n = io.getInt();
		long x[] = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = io.getLong();
		}
		HashSet<Long> y = new HashSet<Long>();
		for (int i = 0; i < n - 1; i++) {
			long t = io.getLong();
			y.add(t);
		}
		for (long xi : x) {
			if (!y.contains(xi)) {
				io.println(xi);
			}
		}
	}

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		solve(io);
		io.close();
	}
}
