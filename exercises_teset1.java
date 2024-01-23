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

/פונקציות
/תרגיל1
import java.util.Scanner;

class Main {
	public static void ages() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first child age");
		int first_child = sc.nextInt();
		int last_child = first_child - 10;
		int young_girl = last_child + 1;
		int old_girl = young_girl + 3;
		System.out.println("first child age "+first_child+" last child age "+last_child+" young girl age "+young_girl+" old girl age "+old_girl);
	}
	public static void main(String[] args) {
		ages();
	}
}

/תרגיל2
import java.util.Scanner;

class Main {
	public static void reverse_num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 units number");
		int num = sc.nextInt();
		int first_num = num/100;
		int middle_num = num%100/10;
		int last_num = num%10;
		System.out.println(last_num+""+middle_num+""+first_num);
	}
	public static void main(String[] args) {
		reverse_num();
	}
}

/תרגיל 3
import java.util.Random;

class Main {
	public static void average() {
		Random r = new Rnadom();
		int num1 = r.nextInt(40,101);
		int num2 = r.nextInt(40,101);
		int num3 = r.nextInt(40,101);
		if (num1 < num2 && num1 < num3)
		    System.out.println(num1);
		else 
		    if (num2 < num1 && num2 < num3)
		        System.out.println(num1);
		    else
		        System.out.println(num3);
	}
	public static void main(String[] args) {
		average();
	}
}

/תרגיל 4
import java.util.Scanner;

class Main {
    public static void str_check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.next();
        String str2 = sc.next();
        
        if (str1.length() < str2.length())
            System.out.println(str1);
        else
            System.out.println(str2);
        String str1_sub = str1.substring(0,3);
        String str2_sub = str2.substring(0,3);
        System.out.println(str1_sub+" "+str2_sub);
        if (str1_sub.compareTo(str2_sub) > 0)
            System.out.println(str1_sub);
        else
            System.out.println(str2_sub);
    }
    public static void main(String[] args){
        str_check();
    }
}
