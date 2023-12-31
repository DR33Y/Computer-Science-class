/תרגיל 1
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 students names from the class:");		
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		String name3 = sc.nextLine();
		
		if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0)
			if (name2.compareTo(name3) < 0)
				System.out.println(name1+" "+name2+" "+name3);
			else
				System.out.println(name1+" "+name3+" "+name2);
		
		else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0)
			if (name1.compareTo(name3) < 0)
				System.out.println(name2+" "+name1+" "+name3);
			else
				System.out.println(name2+" "+name3+" "+name1);
		
		else if (name3.compareTo(name1) < 0 && name3.compareTo(name2) < 0)
			if (name1.compareTo(name2) < 0)
				System.out.println(name3+" "+name1+" "+name2);
			else
				System.out.println(name3+" "+name2+" "+name1);
			
	}
}

/תרגיל 2
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 string word with space between the words:");
		String str1 = sc.nextLine();
		int size = str1.length();
		
		System.out.println("in the string there "+size);
	}
}

/תרגיל 3
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 string word:");
		String str1 = sc.nextLine();
		
		if (str1.charAt(0) == str1.charAt(2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}

/תרגיל 4
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 string word:");
		String str1 = sc.nextLine();
		
		char letter1 = str1.charAt(0);
		char letter2 = str1.charAt(1);
		char letter3 = str1.charAt(2);
		
		System.out.println(letter3+" "+letter2+" "+letter1);
	}
}

/תרגיל 5
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 string word");
		String word = sc.next();

		cahr letter0 = word.charAt(0);
		cahr letter1 = word.charAt(1);
		cahr letter2 = word.charAt(2);
		cahr letter3 = word.charAt(3);

		if (letter0 == 'a' || letter0 == 'e' || letter0 == 'i' || letter0 == 'o' || letter0 == 'u')
			letter0 = '*';
			if (letter1 == 'a' || letter1 == 'e' || letter1 == 'i' || letter1 == 'o' || letter1 == 'u')
			letter1 = '*';
				if (letter2 == 'a' || letter2 == 'e' || letter2 == 'i' || letter2 == 'o' || letter2 == 'u')
					letter2 = '*';
					if (letter3 == 'a' || letter3 == 'e' || letter3 == 'i' || letter3 == 'o' || letter3 == 'u')
						letter3 = '*';
		System.out.println(letter0+""+letter1+""+letter2+""+letter3);
	}
}

/תרגיל 6
import java.util.Random;

class Main{
	public static void main(String[] args){
		Random r = new Random();
		int num = r.nextInt(101);
		System.out.println(num);

		if (num>10)
			System.out.println("two digits number");
		else
			System.out.println("single digit number");
		if (num%2==0)
			System.out.println("the number is divisible by 2");
		else
			if (num%3==0)
				System.out.prntln("the number is divisble by 3");
			else
				System.ou.println("the number isn't divisble by 2 or 3");
	}
}

/תרגיל  7
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1");
		int x1 = sc.nextInt();
		System.out.println("Enter x2");
		int x2 = sc.nextInt();
		System.out.println("Enter y1");
		int y1 = sc.nextInt();
		System.out.println("Enter y2");
		int y2 = sc.nextInt();

		double d = Math.sqrt((x2-x1)+(y2-y1));
		System.out.println(d);

	}
}

/תרגיל 8
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radios");\
		int r = sc.nextInt();
		double pi = 3.14;

		double s = pi*(Math.pow(r,r));
		double p = pi*2*r;

		System.out.println("The area of the circle is "+s);
		System.out.println("The scope of the circle is "+p);\
	}
}

/תרגיל 9
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side a");
		int a = sc.nextInt();
		System.out.println("Enter side b");
		int b = sc.nextInt();

		double extras = Math.pow(a,2) + Math.pow(b,2);
		double remainder = Math.sqrt(extras);
		System.out.println(reaminder);
	}
}
