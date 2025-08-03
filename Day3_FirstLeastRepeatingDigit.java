// First least repeating digit in an array.
class Day3_FirstLeastRepeatingDigit{
	public static void main(String[] args) {
		int [] arr = {1,3,3,5,1,4,10,3,1,1,3,6};
		boolean [] b = new boolean[arr.length];
		int minCnt = Integer.MAX_VALUE;
		int leastEle = 0;
		for(int i=0;i<arr.length;i++){
			if(b[i]) continue;

			int cnt = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j] && !b[j]){
					cnt++;
					b[j]=true;
				}
			}
			if(cnt<minCnt){
				minCnt = cnt;
				leastEle = arr[i];
			}
		}
		System.out.println("least repeating digit is : "+leastEle+" with "+minCnt+" occurences");
	}
}