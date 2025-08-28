#include<bits/stdc++.h>

using namespace std;

int main() {
	long long n;
	cin >> n;
	vector<long long> x(n);
	set<long long> y;
	for (long long i = 0; i < n; i++) cin >> x[i];
	for (long long i = 0; i < n - 1; i++) {
		long long yi;
		cin >> yi;
		y.insert(yi);
	}
	for (long long xi : x) if (!y.count(xi)) printf("%lld\n", xi);
	return 0;
}
