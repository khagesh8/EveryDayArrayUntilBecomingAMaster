// Rotating an array in clockwise direction.
import java.util.*;
class ArrayRotationClockWise{
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7,8};
		System.out.print("Enter the number of rotations : ");
		int rotations = new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(clockWiseRotation(arr, rotations)));
	}
	public static int [] clockWiseRotation(int [] arr, int rotations){
		for(int i =1;i<=rotations;i++){
			int temp = arr[0];
			for(int j=1;j<arr.length;j++){
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
}