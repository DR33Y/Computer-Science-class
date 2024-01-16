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
