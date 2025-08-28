class Main {
	private static void solve(Kattio io) {
		int n = io.getInt();
		long x[] = new long[n];
		long y[] = new long[n - 1];
		for (int i = 0; i < n; i++) {
			x[i] = io.getLong();
		}
		for (int i = 0; i < n - 1; i++) {
			y[i] = io.getLong();
		}
		for (long xi : x) {
			boolean found = false;
			for (long yi : y) {
				found |= xi == yi;
			}
			if (!found) {
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
