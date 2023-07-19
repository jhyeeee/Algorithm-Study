package boj_17413;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine() + '\n';
		boolean open = false;
		
		for(int i = 0; i < str.length(); i++) {
			// 괄호일경우
			if(str.charAt(i) == '<') {
				// 괄호시작 표시
				open = true;
				// 스택에 단어들이 있을경우 pop
				if(!stack.empty()) {
					while(!stack.empty()) {
						bw.write(stack.pop());
					}
				}
				// < 입력
				bw.write('<');
			}
			// 괄호 닫기
			else if(str.charAt(i) == '>') {
				// > 입력
				bw.write('>');
				// 괄호 닫은 상태로 변경
				open = false;
			}
			else {
				// 괄호가 열린 경우
				if(open == true) {
					// 단어 그대로 입력
					bw.write(str.charAt(i));
				}else {
					// 괄호 안 단어가 아니고 공백이나 끝인 경우
					if(str.charAt(i) == ' ' || str.charAt(i) == '\n') {
						// 스택안의 단어 pop
						while(!stack.empty()) {
							bw.write(stack.pop());
						}
						//단어 사이 중간 공백 입력
						if(str.charAt(i) == ' ') {
							bw.write(' ');
						}
					}else {
						// 괄호 안 단어가 아닌 경우 스택에 넣어준다
						stack.push(str.charAt(i));
					}
				}
			}
		}
		bw.flush();
	}
}
