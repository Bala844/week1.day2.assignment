package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum =0;
		int secNum  =1;
		int sum;
		System.out.println(firstNum);
		for(int range = 1;range<=8;range++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			}
		
}
}
