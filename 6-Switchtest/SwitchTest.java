import java.util.Scanner;

public class SwitchTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num){
			case 1:
				System.out.println("你输入的数字是'1' ");
				break;
			case 2:
				System.out.println("你输入的数字是'2' ");
				break;
			case 3:
				System.out.println("你输入的数字是'3' ");
				break;

			default:
				System.out.println("请重新输入！");
				break;

		}
	}
}