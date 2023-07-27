package boj_1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[n + 1];
        
        // 0��1�� �Ҽ��� �ƴϴ�
        isPrime[0] = false;
        isPrime[1] = false;
        
        // 2���� n���� �ϴ� �Ҽ���� �ص�
        for(int i = 2; i <= n; i++) {
        	isPrime[i] = true;
        }
        
        // 2���� n���� ����
        for (int i = 2; i <= n; i++)
        {
        	// �Ҽ���� �ص� ����
            if (isPrime[i] == true)
            {
            	// ���ؼ� ����̸� �Ҽ� �ƴ����� �ٲ�
                for (int j = 2; i * j <= n; j++)
                    isPrime[i * j] = false;
            }
        }
        // m ���� n���� �Ҽ����
        for (int i = m; i <= n; i++)
        {
            if (isPrime[i] == true)
                bw.write(Integer.toString(i) + "\n");
        }
 
        br.close();
        bw.flush();
        bw.close();		
	}
}
