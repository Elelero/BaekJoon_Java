import java.util.Arrays; 
import java.util.Scanner;


class Olympic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); //테스트 케이스 수

		//테스트케이스 수만큼 반복
		for(int test=0; test<T; test++) {
			int result = 0; //결과괎을 저장할 변수
			int N = sc.nextInt(); //각 케이스 별 데이터의 수
			int[] A = new int[N+1]; //A[0] 데이터는 사용 안함, 인덱스를  1부터 N까지(포함) 사용
			
			sc.nextLine(); //빈 줄바꿈 Skip하기 위함. 데이터의 개수(N) 입력 뒤 엔터를 없애기 위함
			
			/*//내가 한 방식
			for(int j=1; j<N; j++) {
				A[j] = sc.nextInt();
			}*/

			String str = sc.nextLine();
			String [] dataStr = str.split(" ");
			for(int i=1; i<=N; i++) {
				A[i] = Integer.parseInt(dataStr[i-1]);
			}
			System.out.println(Arrays.toString(A));
			
			//알고리즘 작성
			int total_score = 0; //팀의 가장 큰 점수를 모두 더하기 위한 변수
			for(int i=1; i<=N; i++) {
				int team_score_max = -2147483648; //i번째 선수를 포함한 팀들 중 가장 큰 점수 (int에서 가장 작은 수를 이용하여 max값 구함 )
				for(int s=1; s<=i; s++) {
					for(int t=i; t<=N; t++) {
						int min_score = 10001; //가장 작은 값을 저장할 변수. 가장 작은 값을 구해야하므로, 가장 큰 값보다 +1 큰거를 넣어주면 됨
						int team_score = 0; //팀 전체의 점수
						for(int j=s; j<=t; j++) {
							team_score += A[j];
							if(j!=i && A[j]<min_score) {
								//i번째 선수를 제외한 가장 작은 점수(선수)를 저장
								min_score = A[j];
							}
						}
						if(min_score < 0) { //팀의 점수 중 가장 작은 값이 음수이면,
							team_score -= min_score; // 그 수를 다시 빼줌
						}
						if(team_score > team_score_max) {
							team_score_max = team_score; //팀의 점수 중 가장 큰 점수를 저장
						}
						if(team_score_max < 0) {
							team_score_max *= -1; //음수일 경우 양수로 만듬
						}
					} // end t = 1..i
				} // end s = i..N
				total_score += team_score_max;
			} // end i = i..N
			
			result = total_score % 1000000007;
			//결과를 출력
			System.out.println("#"+ (test+1) +" "+ result);
		}
		sc.close();
		
	}
}
