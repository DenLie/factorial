	static Scanner in = new Scanner(System.in);
    static int f(int n) {
        int x;
        if (n <= 1)
            return 1;
       x = f(n - 1) * n;
        return x;
    }

	public static void main (String[] args){
		int n;
		n = in.nextInt();
		System.out.println(f(n));
	}
