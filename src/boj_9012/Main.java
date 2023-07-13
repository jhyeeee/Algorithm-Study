package boj_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			Stack<Character> stack = new Stack();
			String str = sc.next();
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					stack.push('(');
				}else if(str.charAt(j) == ')') {
					if(stack.empty()) {
						stack.push('e');
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.empty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}