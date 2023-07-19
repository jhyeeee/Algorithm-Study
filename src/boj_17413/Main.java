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
			// ��ȣ�ϰ��
			if(str.charAt(i) == '<') {
				// ��ȣ���� ǥ��
				open = true;
				// ���ÿ� �ܾ���� ������� pop
				if(!stack.empty()) {
					while(!stack.empty()) {
						bw.write(stack.pop());
					}
				}
				// < �Է�
				bw.write('<');
			}
			// ��ȣ �ݱ�
			else if(str.charAt(i) == '>') {
				// > �Է�
				bw.write('>');
				// ��ȣ ���� ���·� ����
				open = false;
			}
			else {
				// ��ȣ�� ���� ���
				if(open == true) {
					// �ܾ� �״�� �Է�
					bw.write(str.charAt(i));
				}else {
					// ��ȣ �� �ܾ �ƴϰ� �����̳� ���� ���
					if(str.charAt(i) == ' ' || str.charAt(i) == '\n') {
						// ���þ��� �ܾ� pop
						while(!stack.empty()) {
							bw.write(stack.pop());
						}
						//�ܾ� ���� �߰� ���� �Է�
						if(str.charAt(i) == ' ') {
							bw.write(' ');
						}
					}else {
						// ��ȣ �� �ܾ �ƴ� ��� ���ÿ� �־��ش�
						stack.push(str.charAt(i));
					}
				}
			}
		}
		bw.flush();
	}
}
