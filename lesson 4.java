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
