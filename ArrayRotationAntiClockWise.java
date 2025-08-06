// Rotating an array in anti-clockwise direction based on "n" number of rotations
import java.util.*;
class ArrayRotationAntiClockWise{
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7,8};
		System.out.print("Enter the number of rotations : ");
		int rotations = new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(clockWiseRotation(arr, rotations)));
	}
	public static int [] clockWiseRotation(int [] arr, int rotations){
		for(int i =1;i<=rotations;i++){
			int temp = arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--){
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}
		return arr;
	}
}