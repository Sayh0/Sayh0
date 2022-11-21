import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split("");
		int[] nums=new int[str.length];
		int max=0;
		for(int i=0;i<str.length;i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j] > nums[i]) {
					int tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;				
					}
			}
			System.out.print(nums[i]);
		}
		
	}
}