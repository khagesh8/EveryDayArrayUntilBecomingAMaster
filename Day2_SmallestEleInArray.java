// Smallest element in an array
class Day2_SmallestEleInArray{
	public static void main(String[] args) {
		int [] arr = {1,-2,23,-13,11,-9,4,1};
		int minEle = Integer.MAX_VALUE;

		for(int ele : arr)
			if(minEle > ele)
				minEle = ele;
		System.out.println("Smallest element in array is : "+minEle);
	}
}