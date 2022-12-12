import java.util.Arrays;
import java.util.Scanner;

public class JanggiPho {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //배열 크기
		scan.nextLine();
		
		char[][] map = new char[N][N]; //장기판 맵 -> 배열로 만듬
		int[] locationPho = new int[2]; //장기판 -> 포의 위치
		boolean findPho = false;
		
		
		for(int i=0; i<N; i++) {
			//장기판에 알 담기
			map[i] = scan.nextLine().replace(" ", "").toCharArray();
			
			//장기판에 알 담는 과정에서 포(X) 위치가 나오면 기억
			if(!findPho) {
				for(int j=0; j<N; j++) {
					if(map[i][j] == 'X') {
						locationPho[0] = i;
						locationPho[1] = j;
						findPho = true;
					}
				}
			}
		}
		
		//1. 수평계산
		//나의 포(X)가 있는 수평줄의 문자열을 구함
		String horizontal = new String(map[locationPho[0]], 0, N);
		int resultH = calc(horizontal); //계산 메소드에 넣음
		
		//2. 수직 계산 
		//나의 포(X)가 있는 수직줄의 문자열을 구함
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(map[i][locationPho[1]]);
		}
		String vertical = sb.toString();
		int resultV = calc(vertical); //계산 메소드에 넣음
		
		//step3. 결과 산출 및 다음 문제를 위한 초기화
		//결과
		int result = resultH + resultV;
		System.out.println("결과는 " + result);
		//초기화
		findPho = false;
		result = 0;
		resultH = 0;
		resultV = 0;
	}
	
	//수평/수직 -> 포 계산
	private static int calc(String line) {
		//step1. 다른 포(Y)를 기준으로 나눔
		String[] target = line.split("Y");
		//step2. 나의 포(X)가 포함된 유효한 구간만 가져옴
		int targetIndex = includingTargetIndex(target);
		//step3. 공백(L)을 제거
		String targetList = target[targetIndex].replace("L", "");
		//step4. 계산을 위해 나의 포(X)를 기준으로 2개의 구간으로 나눔
		String[] splitedTargetList = targetList.split("X");
		
		int target1 = 0;
		int target2 = 0;
		//배열이 존재하지 않을 경우를 위한 예외처리
		try {
			//왼쪽
			target1 = (splitedTargetList[0].isEmpty()) ? 0 : splitedTargetList[0].length()-1;
			//오른쪽
			target2 = (splitedTargetList[1].isEmpty()) ? 0 : splitedTargetList[1].length()-1;
		} catch(Exception e) { }
		
		return target1+target2;
	}
	
	//움직일 수 있는 포 (Y가 있는 행) 
	private static int includingTargetIndex(String[] target) {
		int result = 0;
		
		while(result < target.length) {
			if(target[result].contains("X")) break;
			result++;
		}
		
		return result;
	}
}
