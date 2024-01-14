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
		int num_sum = f3(num1, num2);
		System.out.println(num_sum);
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
		int num_ave = f4(num1, num2, num3);
		System.out.println(num_ave);
	}
