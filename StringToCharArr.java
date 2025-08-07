//Write a java program to convert a string into char array.
import java.util.Arrays;
class StringToCharArr{
	public static void main(String[] args) {
		String str = "java";
		char [] ch = new char[str.length()];
		// using for loop
		for(int i=0;i<str.length();i++){
			ch[i] = str.charAt(i);
		}

		// using for each loop
		// int indx = 0;
		// for	(char ele : str.toCharArray()){
		// 	ch[indx++] = ele;
		// }	
		System.out.println(Arrays.toString(ch));
	}
}