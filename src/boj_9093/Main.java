package boj_9093;

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
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			// 끝을 알려주기 위해 마지막에 \n 추가
            String str = br.readLine() + '\n';
            
            for(int j = 0; j < str.length(); j++ ) {
            	// 공백이거나 끝일때
            	if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
            		while(!stack.empty()) { // 스택이 비어질때 까지 pop으로 꺼내기
            			bw.write(stack.pop());
            		}
            		// 띄어쓰기 해주기
            		bw.write(str.charAt(j));
            	// 공백이 아닐 경우 스택에 넣어주기
            	}else {
            		stack.push(str.charAt(j));
            	}
            }            
    		bw.flush();    	
		}
		br.close();
		bw.close();
	}
}
