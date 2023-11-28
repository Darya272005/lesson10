package homework10_first_ide_app;

public class Main14 {

	public static void main(String[] args) {

		int n = 6;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n - 1; i++) {
			matrix[i][n - i - 2] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			matrix[n - 1][i] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%-3d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
