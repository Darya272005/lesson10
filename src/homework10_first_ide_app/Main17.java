package homework10_first_ide_app;

public class Main17 {

	public static void main(String[] args) {

		int n = 8; 
		int[][] matrix = new int[n][n];

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
