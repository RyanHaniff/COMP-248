package tutorial_08_Arrays;

public class Q3 {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 11, 15 };
		int sum = 0;
		for (int i = 1; i < data.length; ++i) {
			sum = sum + data[i] - data[i - 1];
			System.out.println("sum = " + sum);
		}

	}

}

// sum = 14
// i = 6

// sum = 2
// sum = 4
// sum = 7
// sum = 10
// sum = 14