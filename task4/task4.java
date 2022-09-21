class task4 {

	public static void main(String[] args) {

		fib(1, 1);

	}

	public static void fib(int first, int second) {

		if (first <= 1000) {
			
			System.out.print(first + "\t");
			fib(second, first + second);
		}
		else {
			System.out.println("");
		}
	} 
}