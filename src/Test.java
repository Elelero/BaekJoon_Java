import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt(); //test case 개수
		System.out.println(T); //3
		
		for(int test=0; test<T; test++) {
			int result = 0;
			
			int N1 = scan.nextInt();
			int N2 = scan.nextInt();
			System.out.println(N1); //2
			System.out.println(N2); //3
		
			scan.nextLine(); //숫자가 아닌 문자일 경우를 위해 nextLine()으로 줄바꿈 읽음
			
			int[] A = new int[N1*N2+1]; // new int[N1*N2] 이렇게 작성해도 무방하지만 인덱스값을 1로 주는것이 문제를 보기에도 편함
			String[] dataStr = scan.nextLine().split(" "); //1 2 3 4 5 6
			for(int i=1; i<=N1*N2; i++) {
				A[i] = Integer.parseInt(dataStr[i-1]); //인덱스를 1부터 지정하였기에, -1을 해줘야함!
			}
			System.out.println(Arrays.toString(A));
			System.out.println("#" + (test+1) + " " + "result: " + result);
		}
		
	}
}
