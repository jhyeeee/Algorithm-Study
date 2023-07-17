package boj_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			while(true) {
				// ���ÿ� num�̶� ������������ +
				if(num >= cnt) {
					stack.push(cnt);
					sb.append("+\n");
					cnt++;
				}
				
				//�Էµ� ���ڶ� ���� �� ���ڰ� ������ -
				if(stack.peek() == num) {
					stack.pop();
					sb.append("-\n");
					break;
				}
				// ���� ���� �� ���ڰ� num���� Ŭ ��� ������ �ȵ�, ������ ���������� �����ȵ�
				else if(stack.peek() > num || stack.empty()) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.print(sb);
	}
}
