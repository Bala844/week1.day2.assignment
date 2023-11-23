package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3443;
		int temp = 0;
		int original;
		original = num;
		while (num!=0) {
			temp=temp*10+num%10;
			num=num/10;			
		}
if(original == temp) {
	System.out.println("The number is palindome");
}
else {
	System.out.println("The provided number is not palindorme");
}
	}

}
