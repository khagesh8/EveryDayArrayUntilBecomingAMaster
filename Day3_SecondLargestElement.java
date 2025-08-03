// Second Larrgest Element in an array.
class Day3_SecondLargestElement{
	public static void main(String[] args) {
		int [] arr = {1,3,3,5,1,4,3,1,9,3,7};
		int maxEle = Integer.MIN_VALUE;
		for(int ele : arr)
			if(ele > maxEle )
				maxEle = ele;
		int secMax = Integer.MIN_VALUE;
		for(int ele : arr){
			if(ele == maxEle) continue;
			else if(ele>secMax){
				secMax = ele;
			}
		}
		System.out.println(secMax);
	}
}