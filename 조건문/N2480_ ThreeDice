import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int winMoney = 0;
		
		if(x==y && y==z && z==x) {
			winMoney = 10000+(x*1000);
		} else if(x==y || y==z || z==x) {
			if(x==y || x==z) {
				winMoney = 1000+(x*100);
			} else if(y==z) {
				winMoney = 1000+(y*100);
			}
		} else if(x!=y && y!=z && z!=x) {
			if(x>y&&x>z) {
				winMoney = x*100;
			} else if(y>x&&y>z) {
				winMoney = y*100;
			} else if(z>x&&z>y) {
				winMoney = z*100;
			}
		}
		System.out.print(winMoney);
	}
}
