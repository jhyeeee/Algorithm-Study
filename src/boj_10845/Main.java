package boj_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

			// push
			if(str.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
			// pop
			if(str.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(queue.poll() + "\n");
				}
			}
			// size
			if(str.equals("size")) {
				sb.append(queue.size() + "\n");
			}
			// empty
			if(str.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}
			// front
			if(str.equals("front")) {
				if(queue.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(queue.peek() + "\n");
				}
			}
			//back
			if(str.equals("back")) {
				if(queue.isEmpty()) {
					sb.append("-1\n");
				}else {
					// queue 사이즈를 구한뒤 n-1 만큼 for문 돌리기
					int n = queue.size();
					for(int j = 1; j <= n-1; j++) {
						// 맨 뒤 숫자 앞까지 빼주는 동시에 뒤로 다시 넣어주기
						queue.add(queue.remove());
					}
					// peek으로 맨 뒤 숫자 확인
					sb.append(queue.peek() + "\n");
					// 다시 뒤로 넣어주면서 큐 원래 모양으로 돌려놓기
					queue.add(queue.remove());
				}
			}
		}
		System.out.println(sb);
	}
}
