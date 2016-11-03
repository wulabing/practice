import java.util.Scanner;

public class 检测密码 {

	

	public static boolean AtLeastEightCharacter(String password) {
		if (password.length() >= 8) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean OnlyCharacterAndNumber(String password) {
		int temp = password.length();
		boolean only = false;
		for (int i = 0; i < temp; i++) {
			char ch = password.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				only = true;
				break;
			}
		}
		return only;
	}

	public static boolean AtLeastTwoNumber(String password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		if (count < 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the password");
		String password = input.nextLine();
		int error = 0;
		if (AtLeastEightCharacter(password)) {
			System.out.println("密码位数少于8位");
			error = 1;
		}
		if (OnlyCharacterAndNumber(password)) {
			System.out.println("密码包含除字母数字外的其他字符");
			error = 2;
		}
		if (AtLeastTwoNumber(password)) {
			System.out.println("密码包含的数字个数小于2个");
			error = 3;
		}
		if (error == 0) {
			System.out.println("密码符合规范");
		}

	}

}
