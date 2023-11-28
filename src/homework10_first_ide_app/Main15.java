package homework10_first_ide_app;

public class Main15 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			mas[i][i] = n - i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
	}
}
