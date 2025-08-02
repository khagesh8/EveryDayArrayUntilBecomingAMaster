class Day2{
	public static void main(String[] args) {
		// Distinct elements in an array
		int [] arr = {1,2,3,1,7};
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
			System.out.print(arr[i]+" ");
		}
	}
}