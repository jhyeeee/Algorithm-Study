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
        
        // 0과1은 소수가 아니다
        isPrime[0] = false;
        isPrime[1] = false;
        
        // 2부터 n까지 일단 소수라고 해둠
        for(int i = 2; i <= n; i++) {
        	isPrime[i] = true;
        }
        
        // 2부터 n까지 돌림
        for (int i = 2; i <= n; i++)
        {
        	// 소수라고 해둔 수에
            if (isPrime[i] == true)
            {
            	// 곱해서 배수이면 소수 아님으로 바꿈
                for (int j = 2; i * j <= n; j++)
                    isPrime[i * j] = false;
            }
        }
        // m 부터 n까지 소수출력
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
