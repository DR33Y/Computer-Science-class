/תרגיל 1
  import java.util.Scanner; 

public class Tester {
	public static void f1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Hello "+name);
		}
  public static void main(String[] args) {
		f1();
	}
  
  /תרגיל 2
   import java.util.Scanner; 

public class Tester {
  public static void f2(int num) {
		System.out.println(num/5);
	}
  public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		f2(num);
  	}
  }


/תרגיל 3
   import java.util.Scanner; 

public class Tester {
  public static int f3(int num1, int num2) {
		return (num1 * num2);
		}
  public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(f3(num1, num2));
  	}
  }

  /תרגיל 4
import java.util.Scanner; 

public class Tester {
	public static int f4(int num1, int num2, int num3) {
		return ((num1+num2+num3)/3);
	}
	public static void main(String[] args) {
		System.out.println("Enter 3 number and get their average");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("The average of the number is: "+f4(num1, num2, num3));
	}
}

/תרגיל 5
import java.util.Scanner; 

public class Tester {
	public static void f5(int r) {
		double pai = 3.14;
		double p = pai*Math.pow(r,2);
		double s = 2*pai*r;
		System.out.println(s);
		System.out.println(p);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radios");
		int r = sc.nextInt();
		f5(r);
	}
}

/תרגיל 6
import java.util.Scanner; 

public class Tester {
	public static  double f6(int a, int b) {
		double c_pow = Math.pow(a,2)+Math.pow(b,2); 
		double c = Math.sqrt(c_pow);
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Enter a and b side");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("C is "+f6(a,b));
	}
}	

/תרגיל 7
import java.util.Scanner; 

public class Tester {
	public static void f7(String word) {
		char letter1 = word.charAt(0);
		char letter2 = word.charAt(1);
		char letter3 = word.charAt(2);
		System.out.println(letter3+""+letter2+""+letter1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 word string");
		String word = sc.next();
		f7(word);
	}
}

/תרגיל 8
import java.util.Scanner; 

public class Tester {
	public static int f8(int a1, int d, int n) {
		int an = a1 + d*(n-1);
		return an;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a1, n, d");
		int a1 = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();f8(a1,n,d);
		System.out.println("The main value is "+f8(a1,n,d));
	}
}

/תרגיל 9
import java.util.Scanner; 

public class Tester {
	public static String f9(String str) {
		Double str_len = Math.pow(str.length(),2);
		System.out.println(str_len);
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		f9(str);
	}
}

/תרגיל 10
import java.util.Scanner; 

public class Tester {
	public static String f10(String str1, String str2) {
		if (str1.length() > str2.length())
			return str1;
		else 
			return str2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 string");
		String str1 = sc.next(); 
		String str2 = sc.next(); 
		String long_str = f10(str1, str2);
		System.out.println(long_str);
	}
}

/תרגיל 11
import java.util.Scanner; 

public class Tester {
	public static boolean f11(String str, int num) {
		int str_len = str.length();
		if (str_len == num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string and number");
		String str = sc.next();
		int num = sc.nextInt();
		boolean ans = f11(str, num);
		System.out.println(ans);
	}
}

/תרגיל 12
import java.util.Random; 

public class Tester {
	public static boolean f12(int num1, int num2) {
		if (num1 == num2)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Random r = new Random();
		int num1 = r.nextInt(6)+1;
		int num2 = r.nextInt(6)+1;
		System.out.println("number1:"+num1+" number2:"+num2);
		boolean ans = f12(num1, num2);
		System.out.println(ans);
	}
}

/תרגיל 13
import java.util.Scanner; 

public class Tester {
	public static boolean f13(char letter, String word){
		int index = word.indexOf(letter);
		if (index >= 0){
			System.out.println("The char "+letter+" is in "+word);
			return true;
		}
		else {
			System.out.println("The char "+letter+" is in "+word);
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String word = sc.next();
		boolean ans = f13('d',word);
		System.out.println(ans);
	}
}
