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
