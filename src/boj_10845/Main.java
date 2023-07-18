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
					// queue ����� ���ѵ� n-1 ��ŭ for�� ������
					int n = queue.size();
					for(int j = 1; j <= n-1; j++) {
						// �� �� ���� �ձ��� ���ִ� ���ÿ� �ڷ� �ٽ� �־��ֱ�
						queue.add(queue.remove());
					}
					// peek���� �� �� ���� Ȯ��
					sb.append(queue.peek() + "\n");
					// �ٽ� �ڷ� �־��ָ鼭 ť ���� ������� ��������
					queue.add(queue.remove());
				}
			}
		}
		System.out.println(sb);
	}
}
