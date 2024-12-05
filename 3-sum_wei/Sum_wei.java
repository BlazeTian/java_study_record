import java.util.Scanner;

public class Sum_wei{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();

		int sum_1 = sum % 10;
		int sum_2 = (sum/10) % 10;
		int sum_3 = (sum/100) % 10;

		int Sum = sum_1 + sum_2 + sum_3;

		System.out.println(Sum);
	}
}