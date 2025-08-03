// 
// import java.util.Arrays;
class Day3_FirstHighestRepeatingDigit{
	public static void main(String[] args) {
		int [] arr = {1,2,3,3,5,1,4,3,1,1,3,6};
		boolean [] b = new boolean[arr.length];
		int maxCnt = Integer.MIN_VALUE;
		int highEle = 0;
		for(int i=0;i<arr.length;i++){
			if(b[i]) continue;

			int cnt = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j] && !b[j]){
					cnt++;
					b[j]=true;
				}
			}
			if(cnt>maxCnt){
				maxCnt = cnt;
				highEle = arr[i];
			}
		}
		System.out.println("highest repeating digit is : "+highEle+" with "+maxCnt+" occurences");
	}
}