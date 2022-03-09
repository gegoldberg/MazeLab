import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MiniMaze {

	public static void main(String[] args) {
		int[] numbers = new int[8];

		boolean same = true;

		int user = 0;
		int winSpot = 0;
		while (same) {
			Random random = new Random();
			user = random.nextInt(7);
			winSpot = random.nextInt(7);

			if (user == winSpot) {
				// System.out.println("Error. Try again.");
			} else {
				same = false;
			}
		}

		numbers[user] = 2;
		numbers[winSpot] = 1;

		boolean game = true;
		while (game) {
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();

			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to go left or right?");
			String direction = sc.nextLine();

			if (direction.equalsIgnoreCase("left")) {
				numbers[user] = 0;
				user = user - 1;
				numbers[user] = 2;
			} else if (direction.equalsIgnoreCase("right")) {
				numbers[user] = 0;
				user = user + 1;
				numbers[user] = 2;
			} else {
				System.out.println("That is not a valid input.");
			}

			if (user == winSpot) {
				System.out.println("You have won. Congratulations.");
				game = false;
			}
		}

	}

}
