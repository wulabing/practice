import java.util.Scanner;
public class test4_11 {
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.print("Please input a number");
		int a = input.nextInt();
		if(a >= 0 && a <= 15){
			if(a >= 10 ){
				char ch = (char)(a - 10 + 'A');
				System.out.println(ch);
				
				
			}
			else{
				System.out.println(a);
			}
		}
		else {
			System.out.println("Error");
		}
	}

}
                                                                                                                                                                                                        