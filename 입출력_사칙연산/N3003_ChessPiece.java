package BaekJoon_Java;

import java.util.Scanner;

public class N3003_ChessPiece {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int[] chess = {1, 1, 2, 2, 2, 8};
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int[] output = new int[chess.length]; //output배열을 0으로 초기화
        
        for(int i=0; i<output.length; i++){
        	output[i] = chess[i] - Integer.parseInt(arr[i]);
        	System.out.print(output[i]+" ");
        }
	}

}
