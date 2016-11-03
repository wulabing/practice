import java.util.Scanner;
public class test5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the string");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int start = 0 ;
		int end = str.length() - 1 ;
		boolean ishuiwen = true;
		while(start <= end){
			if(str.charAt(start) != str.charAt(end)){
				ishuiwen = false;
			}
			start++;
			end--;
		}
		if(ishuiwen){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
