// Write a java program to create a subarray from an array.
import java.util.*;
class SubArrayFromArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you want to enter in the array :: ");
		int cnt = sc.nextInt();

		int [] arr = new int[cnt] ;
		System.out.print("Enter values to put in Array : ");

		for(int i=0;i<cnt;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.print("Enter the start index of the subArray : ");
		int startIndx = sc.nextInt();
		int start = startIndx;
		System.out.print("Enter the end index of the subArray : ");
		int endIndx = sc.nextInt();

		int [] subArray = new int[endIndx-startIndx];


		for(int i=0;i<subArray.length;i++){
			subArray[i] = arr[startIndx++];
		}	
		System.out.println("SubArray created starting from "+start+" to "+(endIndx-1) +" : "+Arrays.toString(subArray));
	}
}