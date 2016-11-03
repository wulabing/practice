import java.util.Scanner;

public class 井字游戏 {

	public static void print(int[][] flag) {

		for (int temp = 0; temp <= 3; temp++) {
			System.out.println("-------------------");
			if (temp <= 2) {
				for (int temp2 = 0; temp2 <= 2; temp2++) {
					if (flag[temp][temp2] != 0) {
						if (flag[temp][temp2] == 1) {
							System.out.print("|  X  ");
						} else {
							System.out.print("|  O  ");
						}
					} else {
						System.out.print("|     ");
					}
				}
				System.out.println("|");

			}
		}

	}

	public static void enter(int player, int[][] flag) {
		Scanner input = new Scanner(System.in);
		int row, column;
		if (player != 0) {
			char ch = player == 1 ? 'X' : 'O';
			System.out.print("Please Enter a row for player " + ch + ":");
			row = input.nextInt();
			System.out.print("Please Enter a row for player " + ch + ":");
			column = input.nextInt();
			if (row > 2 || column > 2) {
				System.out.println("输入数据越界");
				System.exit(1);
			}
			if (flag[row][column] == 0)
				flag[row][column] = player;
			else {
				System.out.println("重复下子");
				System.exit(1);
			}

		}

	}

	public static int ifwin(int[][] flag, int player) {
		if (flag[1][1] != 0) {
			if (flag[0][0] == flag[2][2] && flag[2][2] == flag[1][1]) {
				return player;
			} else if (flag[0][2] == flag[2][0] && flag[2][0] == flag[1][1]) {
				return player;
			}
		} else {
			for (int temp = 0; temp <= 2; temp++) {
				if (flag[temp][0] != 0 && flag[temp][0] == flag[temp][1] && flag[temp][1] == flag[temp][2]) {
					return player;
				}
				if (flag[0][temp] != 0 && flag[0][temp] == flag[1][temp] && flag[1][temp] == flag[2][temp]) {
					return player;
				}

			}
		}
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] flag = new int[3][3];
		int player = 1;
		int win = 0;
		int times = 0;
		while (win == 0) {

			while (times < 9) {
				print(flag);
				enter(player, flag);
				times++;
				if (times >= 5) {
					if (ifwin(flag, player) != 0) {
						char ch = player == 1 ? 'X' : 'O';
						print(flag);
						System.out.println("The winner is " + ch);
						System.exit(0);
					}
				}
				if (player == 1)
					player = 2;
				else
					player = 1;
			}
			print(flag);
			System.out.println("duel");
			System.exit(0);

		}
	}

}
