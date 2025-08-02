// Ik the name of the file is not so meaningful, but it's just to keep track on my daily contributions and growth.
class Day1{
	public static void main(String[] args) {
		// Frequncy of elements in an array (no. of times an element is appearing in an array)
		int [] arr = {1,2,1,1,7};
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
			System.out.println(arr[i] +" : "+cnt);
		}
	}
}