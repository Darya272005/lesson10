package homework10_first_ide_app;

public class Main16 {

	public static void main(String[] args) {

		int n = 8;
		int[][] mas = init(n);
		print(mas);
	}

	public static int[][] init(int n) {
		int[][] mas = new int[n][n];
		int num = 1;
		for (int i = 0; i < n; i++) {
			mas[i][i] = num * (num + 1);
			num++;
		}
		return mas;
	}

	public static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
