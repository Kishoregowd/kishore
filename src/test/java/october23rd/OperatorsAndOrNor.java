package october23rd;

public class OperatorsAndOrNor {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		if (a > 4 && b > 9) {
			System.out.println("AND Operator - Pass");
		} else {
			System.out.println("AND Operator - Fail");

		}
		int a1 = 5;
		int b1 = 10;
		if (a1 > 14 || b1 > 20) {
			System.out.println("OR Operator - Pass");

		} else {
			System.out.println("OR Operator - Fail");
		}
		
		int a2 = 5;
		int b2 = 10;
		if (! (a2>14 || b2>20)) {
			System.out.println("NOR Operator - Pass");
		} else {
			System.out.println("NOR Operator - Fail");
		}
	}

}
