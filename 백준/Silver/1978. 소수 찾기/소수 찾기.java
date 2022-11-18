import java.io.*;
import java.util.*;

public class Main {
	
	//prime X = true, prime O = false 
	public static boolean[] primeNumber(int num) {
		boolean[] prime=new boolean[num + 1];
		prime[0]=true;
		prime[1]=true;
		// sqrt() 메서드는 인자에 대한 제곱근 return.
		for(int i=2;i<=Math.sqrt(num);i++) {
			// 이미 체크한 숫자는 넘긴다.
			if(prime[i]==true) {
				continue;
			}
			// 원래는 j=i*2부터 시작이지만, 2의 배수가 이미 걸러졌기 때문에
			// i의 제곱부터 시작 가능
			
			for(int j=i*i;j<num+1;j=j+i) {
				prime[j]=true;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		
		int PrimeCnt=0;
		int[] numbers=new int[N];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=Integer.parseInt(st.nextToken());
			boolean[] chk=primeNumber(numbers[i]);
			if (chk[numbers[i]]==false) {
				PrimeCnt++;
			}
		}
		System.out.println(PrimeCnt);
	}
}