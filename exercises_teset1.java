/תרגיל 1
public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car A time");
		double t1 = sc.nextDouble();
		System.out.println("Enter car A speed");
		int v1 = sc.nextInt();
		
		System.out.println("Enter car B time");
		double t2 = sc.nextDouble();
		System.out.println("Enter car B speed");
		int v2 = sc.nextInt();
		
		double x1 = t1 * v1;
		double x2 = t2 * v2;
		
		if (x1+x2 >= 60)
			System.out.println("True");
		else
			System.out.println("False");
	}
}

/תרגיל 2
import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100,999);
		System.out.println(num);
		
		int first_num = num/100;
		int last_num = num%10;
		System.out.println("first number: "+first_num);
		System.out.println("last number: "+last_num);
		
		if (first_num == last_num)
			System.out.println("True");
		else
			System.out.println("Flase");
	}
}

/תרגיל 3
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 subject name and is grade");
		
		String subject1 = sc.next();
		int grade1 = sc.nextInt();
		
		String subject2 = sc.next();
		int grade2 = sc.nextInt();
		
		if (grade1 > grade2)
			System.out.println(subject1+": "+grade1);
		else if(grade2 > grade1)
				System.out.println(subject2+": "+grade2);
		else
			System.out.println(subject1+": "+grade1+" equale to "+subject2+": "+grade2);
	}
}

/תרגיל 4
import java.util.Scanner;

public class Tester {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String over 3 letters");
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		if (str1.length() > str2.length())
			System.out.println(str1);
		else
			if (str2.length() > str1.length())
				System.out.println(str2);
			else
				System.out.println("The string are equael! "+str1);
		if (str1.charAt(0) == str2.charAt(0))
			System.out.println("True. str1 index 0: "+str1.charAt(0)+" str2 indx 0: "+str2.charAt(0));
		else
			System.out.println("False. str1 index 0: "+str1.charAt(0)+" str2 indx 0: "+str2.charAt(0));
		if (str2.indexOf(str1) >= 0)
			System.out.println("str1 in str2");
		else
			System.out.println("str1 isn't in str2");
	}
}
