import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = 0;
		int b = 0;
    
		while(sc.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b +"\n");
		}
    
		bw.flush();  
		bw.close();
		sc.close();
	} 
}

/*-------------------------------------------------------------------------------------*/
//이클립스에서 에러없이 출력을 하기 위해서는 아래와 같이 while문 안에 if문을 작성하여야함
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = 0;
		int b = 0;
    
		while(sc.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			if(st.countTokens()==0) break; // 이 코드가 있어야 토큰이 없을때, while문에서 벗어날 수 있음 (에러방지)
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b +"\n");
		}
    
		bw.flush();  
		bw.close();
		sc.close();
	} 
}
