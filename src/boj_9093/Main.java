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
			// ���� �˷��ֱ� ���� �������� \n �߰�
            String str = br.readLine() + '\n';
            
            for(int j = 0; j < str.length(); j++ ) {
            	// �����̰ų� ���϶�
            	if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
            		while(!stack.empty()) { // ������ ������� ���� pop���� ������
            			bw.write(stack.pop());
            		}
            		// ���� ���ֱ�
            		bw.write(str.charAt(j));
            	// ������ �ƴ� ��� ���ÿ� �־��ֱ�
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
