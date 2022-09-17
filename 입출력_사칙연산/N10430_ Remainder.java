import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArr = input.split(" ");
		int A = Integer.parseInt(inputArr[0]);
		int B = Integer.parseInt(inputArr[1]);
		int C = Integer.parseInt(inputArr[2]);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}

}
