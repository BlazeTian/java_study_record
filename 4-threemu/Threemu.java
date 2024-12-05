public class Threemu{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		int c = 300;

		int result = c > (a > b?a:b)?c:(a > b?a:b);
		System.out.println(result);
	}
}