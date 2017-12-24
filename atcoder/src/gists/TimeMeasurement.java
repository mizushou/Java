package gists;

class TimeMeasurement {
	public static void main(String[] args) {
		long start = System.nanoTime();

		// some processing
		int[] a = {1,2,3,4,4,5,6,7,8,9,10};
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		};

		long end = System.nanoTime();
		System.out.println("Time : " + (end - start) / 1000000f + "ms");
	}
}
