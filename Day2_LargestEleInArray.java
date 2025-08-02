// Largest Element in an unsorted Array
class Day2_LargestEleInArray{
	public static void main(String[] args) {
		int [] arr = {1,2,8,1,2,7,9,4,1};
		int maxEle = Integer.MIN_VALUE;

		for(int ele : arr)
			if(ele > maxEle)
				maxEle = ele;	

		System.out.println("Largest element in array is : "+ maxEle);
	}
}