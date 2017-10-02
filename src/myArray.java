import java.util.Arrays;

public class myArray {

	private int[] a;
	private int n, i;
	private int[] b;
	private int L;
	private int U;

	myArray() {
		n = 7;
		a = new int[n];
		b = new int[n - 1];

		i = 0;
	}

	public void insert(int x) {
		if (i > a.length) {
			return;
		} else {
			a[i] = x;
			i++;
		}
	}

	public void delete(int x) {

		for (int k = x; k < i; k++)
			if (k < n - 1) {
				a[k] = a[k + 1];
			}
		i--;
		for (int f = 0; f < b.length; f++) {

			b[f] = a[f];

		}
		a = b;
		n = a.length;
	}

	public void display() {

		System.out.print("{");
		for (int c = 0; c < a.length; c++)

			System.out.print(a[c] + " , ");

		System.out.println("}");

	}

	public void search(int key) {
		L = 0;
		U = n - 1;

		while (L <= U) {
			int m = L + U;
			m = m / 2;
			if (a[m] == key) {
				System.out.println("index is : " + m);
				return;
			} else if (key < a[m])
				U = m - 1;
			else

				L = m + 1;

		}
	}

	public void selectionSort() {
		int l = a.length;
		int i, j, k = 0;
		for (i = 0; i < l - 1; i++) {
			k = i;
			for (j = i + 1; j < l; j++) {
				if (a[j] < a[k])
					k = j;
			}
			int Temp = a[i];
			a[i] = a[k];
			a[k] = Temp;
		}

	}

	public void insertion() {
		int n = a.length;
		for (int i = 1; i < n; i++) {

			int min = a[i];
			int j = i - 1;
			while (min < a[j]) {
				a[j + 1] = a[j];
				j--;
				if (j < 0)
					break;
			}
			// j=j-1;																			
			a[j + 1] = min;
		}
	}

	public void bubble() {
		int n = a.length;
		int temp;
		for (int k = 0; k < n - 1; k++) {
			for (int i = 0; i < n - 1; i++) { //i<n-k-1
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}

	}

}
