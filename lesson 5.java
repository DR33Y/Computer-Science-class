import java.util.Scanner; 
import java.util.Random;

public class Tester {
	public static void f1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Hello "+name);
	}
	public static void f2(int num) {
		System.out.println(num/5);
	}
	 public static int f3(int num1, int num2) {
		 return (num1 * num2);
	}
	 public static int f4(int num1, int num2, int num3) {
		 return ((num1+num2+num3)/3);
	}
	 public static void f5(int r) {
		double pai = 3.14;
		double p = pai*Math.pow(r,2);
		double s = 2*pai*r;
		System.out.println(s);
		System.out.println(p);
	}
	 public static  double f6(int a, int b) {
		double c_pow = Math.pow(a,2)+Math.pow(b,2); 
		double c = Math.sqrt(c_pow);
		return c;
	}	
	 public static void f7(String word) {
		char letter1 = word.charAt(0);
		char letter2 = word.charAt(1);
		char letter3 = word.charAt(2);
		System.out.println(letter3+""+letter2+""+letter1);
	}
	 public static int f8(int a1, int d, int n) {
		int an = a1 + d*(n-1);
		return an;
	}
	 public static String f9(String str) {
		Double str_len = Math.pow(str.length(),2);
		System.out.println(str_len);
		return str;
	}
	 public static String f10(String str1, String str2) {
		if (str1.length() > str2.length())
			return str1;
		else 
			return str2;
	}
	 public static boolean f11(String str, int num) {
		int str_len = str.length();
		if (str_len == num)
			return true;
		else
			return false;
	}
	 public static boolean f12() {
		Random r = new Random();
		int num1 = r.nextInt(6)+1;
		int num2 = r.nextInt(6)+1;
		if (num1 == num2)
			return true;
		else
			return false;
	}
	 public static boolean f13(char letter, String word){
		int index = word.indexOf(letter);
		if (index >= 0)
			return true;
		else 
			return false;
	 }
	public static void main(String[] args) {
		f1();
		f2(25);
		f3(5,2);
		f4(10,20,30);
		f5(5);
		f6(3,4);
		f7("abc");
		f8(2,2,4);
		f9("Daniel");
		f10("Daniel","Ross");
		f11("Daniel",5);
		f12();
		f13('a',"abc");
	}
}
