public class Launcher {

	private static int[][] pascal;

	public static void main(String[] args) {
		int rows = 10;
		pascal = new int[rows][rows];
		for (int i = 0; i < rows; i++) {
			fill(i);
		}
		print(rows);
	}

	private static void print(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + pascal[i][j]);
			}
			System.out.println();
		}
	}

	private static void fill(int rowNumber) {
		for (int i = 0; i <= rowNumber; i++) {
			if (i == 0 || i == rowNumber) {
				pascal[rowNumber][i] = 1;
			} else {
				pascal[rowNumber][i] = pascal[rowNumber - 1][i - 1]
						+ pascal[rowNumber - 1][i];
			}
		}
	}

}
