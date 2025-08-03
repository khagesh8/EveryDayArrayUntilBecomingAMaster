// Second Smallest Element in an array.
class Day3_SecondSmallestElement{
	public static void main(String[] args) {
		int [] arr = {1,3,3,5,1,4,3,1,9,3,7};
		int minEle = Integer.MAX_VALUE;
		for(int ele : arr)
			if(ele < minEle )
				minEle = ele;
		int secMin = Integer.MAX_VALUE;
		for(int ele : arr){
			if(ele == minEle) continue;
			else if(ele < secMin){
				secMin = ele;
			}
		}
		System.out.println(secMin);
	}
}