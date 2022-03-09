import java.util.Random;
import java.util.Scanner;

public class BigMaze {

	public static void main(String[] args) {
		int[][] numbers = new int[8][6];

		boolean same = true;

		int user = 0;
		int user2 = 0;
		int winSpot = 0;
		int winSpot2 = 0;
		while (same) {
			Random random = new Random();
			user = random.nextInt(7);
			winSpot = random.nextInt(7);
			user2 = random.nextInt(5);
			winSpot2 = random.nextInt(5);

			if (user == winSpot) {
				// System.out.println("Randomizing...");
			} else {
				same = false;
			}
		}

		numbers[user][user2] = 2;
		numbers[winSpot][winSpot2] = 1;

		boolean game = true;
		while (game) {
			for (int row = 0; row < numbers.length; row++) {
				for (int col = 0; col < numbers[row].length; col++) {
					System.out.print(numbers[row][col] + " ");
				}
				System.out.print("\n");
			}
			System.out.println();

			Scanner sc = new Scanner(System.in);
			System.out.println("Which direction would you like to go? [Left, Right, Up, Down].");
			String direction = sc.nextLine();

			if (direction.equalsIgnoreCase("left")) {
				numbers[user][user2] = 0;
				user2 = user2 - 1;
				numbers[user][user2] = 2;
				System.out.println("Moved left.");
				System.out.println();
			} else if (direction.equalsIgnoreCase("right")) {
				numbers[user][user2] = 0;
				user2 = user2 + 1;
				numbers[user][user2] = 2;
				System.out.println("Moved right.");
				System.out.println();
			} else if (direction.equalsIgnoreCase("up")) {
				numbers[user][user2] = 0;
				user = user - 1;
				numbers[user][user2] = 2;
					System.out.println("Moved upward.");
					System.out.println();
			} else if (direction.equalsIgnoreCase("down")) {
				numbers[user][user2] = 0;
				user = user + 1;
				numbers[user][user2] = 2;
				System.out.println("Moved downward.");
				System.out.println();
			} else {
				System.out.println("That is not a valid input.");
				System.out.println();
			}

			if ((user == winSpot) && (user2 == winSpot2)) {
				System.out.println("You have won. Congratulations.");
				game = false;
			}
		}

	}
}
