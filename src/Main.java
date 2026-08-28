import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int rows = random.nextInt(8) + 3;

		for (int row = 0; row < rows; row++) {
			int stars = random.nextInt(rows) + 1;
			for (int column = 0; column < stars; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
