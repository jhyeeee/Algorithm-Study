package boj_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		Stack<Integer> stack = new Stack<>();
//		int T = sc.nextInt();
//		for(int i = 0; i < T; i++) {
//			String str = sc.next();
//			
//			if(str.equals("push")) {
//				stack.push(sc.nextInt());
//			}
//			else if(str.equals("pop")) {
//				if(stack.empty()) {
//					System.out.println(-1);
//				}else {
//					System.out.println(stack.pop());
//				}
//			}
//			else if(str.equals("size")) {
//				System.out.println(stack.size());
//			}
//			else if(str.equals("empty")) {
//				if(stack.empty()) {
//					System.out.println(1);
//				}else {
//					System.out.println(0);
//				}
//			}
//			else if(str.equals("top")) {
//				if(stack.empty()) {
//					System.out.println(-1);
//				}else {
//					System.out.println(stack.peek());
//				}
//			}
//		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            
            // push일 경우 받은숫자 넣어주기
            if (str.equals("push")) stack.push(Integer.parseInt(st.nextToken()));
            
            // pop인 경우
            else if (str.equals("pop")) {
                if (stack.empty()) { //비어있으면 -1
                    sb.append(-1 + "\n");
                } else { // 숫자가 있는경우 출력
                    sb.append(stack.pop() + "\n");
                }
            }
            // size인 경우 숫자 개수 출력
            else if(str.equals("size")) {
            	sb.append(stack.size() + "\n");
			}
            
            // empty인 경우
			else if(str.equals("empty")) {
				if(stack.empty()) { // 비어있으면 1
					sb.append(1 + "\n");
				}else {// 있으면 1
					sb.append(0 + "\n");
				}
			}
			else if(str.equals("top")) {
				if(stack.empty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.peek() + "\n");
				}
			}
		} // for 끝
		System.out.print(sb);
	}
}
