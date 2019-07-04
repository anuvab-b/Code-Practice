//1 1 2 5 14 42 132 429 1430 4862 
//sum=cat(i)*cat(n-i-1);
class CatalanDP{
    static int catalan(int n){
        int res = 0; 
		if (n <= 1){ 
			return 1; 
		} 
		for (int i = 0; i < n; i++) { 
			res += catalan(i) * catalan(n - i - 1); 
		} 
		return res;
    }
	static int catalanDP(int n) { 
		int catalan[] = new int[n + 2]; 
		catalan[0] = 1; 
		catalan[1] = 1; 
		for (int i = 2; i <= n; i++) { 
			catalan[i] = 0; 
			for (int j = 0; j < i; j++) { 
				catalan[i] += catalan[j] * catalan[i - j - 1]; 
			} 
		} 
		return catalan[n]; 
	} 
	public static void main(String[] args) { 
		for (int i = 0; i < 10; i++) { 
			System.out.print(catalanDP(i) + " "); 
		} 
	} 
} 
