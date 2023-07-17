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
				// 스택에 num이랑 같아질때까지 +
				if(num >= cnt) {
					stack.push(cnt);
					sb.append("+\n");
					cnt++;
				}
				
				//입력된 숫자랑 스택 앞 숫자가 같으면 -
				if(stack.peek() == num) {
					stack.pop();
					sb.append("-\n");
					break;
				}
				// 스택 제일 앞 숫자가 num보다 클 경우 성립이 안됨, 스택이 비어있을경우 성립안됨
				else if(stack.peek() > num || stack.empty()) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.print(sb);
	}
}
