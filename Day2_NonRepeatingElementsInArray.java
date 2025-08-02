// Non-Repeating (Unique) elements in an array
class Day2_NonRepeatingElementsInArray{
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,7,3,4,1};
		boolean [] b = new boolean[arr.length];
		for(int i=0;i<arr.length;i++){
			if(b[i]) continue;

			int cnt = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j] && !b[j]){
					cnt++;
					b[j] = true;
				}
			}
			if(cnt==1)				// only added this condition in the frequency program to find unique ele.
				System.out.print(arr[i]+" ");
		}
	}
}