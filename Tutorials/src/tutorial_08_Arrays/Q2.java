package tutorial_08_Arrays;

public class Q2 {

	public static void main(String[] args) {
		int i;
		int a[] = { 5, 2, 3, 1, 1, 0, 2, 1, 0, 1 };
		for (i = 0; (i < a.length); i++) {
			if (a[i] == 0)
				break;
			if (i % 3 == 0)
				continue;
			System.out.print(a[i]);
		}
	}
}
// i = 5
// 231
