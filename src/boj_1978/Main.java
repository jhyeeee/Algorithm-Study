package boj_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(st.nextToken());
			// 2부터 입력 수까지 나눴을때
			for(int j = 2; j <= N; j++) {
				// 약수가 없는 상태로 입력 숫자까지 왔을때 cnt++
				if(j == N) {
					cnt++;
				}
				// 나누다 나머지가 없으면 약수가 있는거니까 빠져나오기
				if(N % j == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
