import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		sc.nextLine(); //개행문자 제거(\n)
		String input2 = sc.nextLine();
		String[] input2Arr = input2.split("");
		int number = 0;
		
		for(int i=input2Arr.length-1; i>=0; i--) {
			number = input1 * Integer.parseInt(input2Arr[i]);
			System.out.println(number);
		}
		
		System.out.println(input1*Integer.parseInt(input2));
	}

}
