package boj_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int result = ucd(Math.max(a, b), Math.min(a, b));
		
		System.out.println(result);
		System.out.println(a * b / result);
		
	}
	
	public static int ucd(int a, int b) {
		if(b == 0) {
			return a;
		}
		while(true) {
			int n = a % b;
			if(n == 0) {
				return b;
			}else {
				int temp = b;
				b = a % b;
				a = temp;
			}
		}
	}
}
