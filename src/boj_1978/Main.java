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
			// 2���� �Է� ������ ��������
			for(int j = 2; j <= N; j++) {
				// ����� ���� ���·� �Է� ���ڱ��� ������ cnt++
				if(j == N) {
					cnt++;
				}
				// ������ �������� ������ ����� �ִ°Ŵϱ� ����������
				if(N % j == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
