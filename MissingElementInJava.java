package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int c = arr.length;
		for(int i=arr[0];i<c;i++) {
			if(i!=arr[i-1]) {
				System.out.println("missing element is "+i);
				break;
			}
		}

	}

}
