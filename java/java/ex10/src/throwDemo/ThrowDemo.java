package throwDemo;

public class ThrowDemo {
	static void math_div(int n1, int n2) {
		try {
		    if (n2 == 0)
		    throw new ArithmeticException("除數為零");  //自行抛出例外物件
		    int div = n1 / n2 ;
		    System.out.println(n1 + "/" + n2 + " = " + div);
		}
		catch(ArithmeticException e) {           //捕捉自行抛出的例外
		    System.out.println("例外內容：" + e.getMessage());
		}
	}

	public static void main(String[] args) {
	    int num1, num2;
	    num1 = 6; num2 = 3;
	    System.out.println("被除數 = " + num1 + ", 除數 = " + num2);
	    math_div(num1, num2);
	    num1 = 6; num2 = 0;
	    System.out.println("\n被除數 = " + num1 + ", 除數 = " + num2);
	    math_div(num1, num2);
	}

}
