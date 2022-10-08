import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			//공백 for문
			for(int j=i+1; j<n; j++) {
				bw.write(" ");
			}
			//별 for문
			for(int k=0; k<i+1; k++) {
				bw.write("*");
			}
			//줄 바꿈
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
