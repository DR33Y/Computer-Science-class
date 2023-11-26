package Study;

import java.util.Scanner;
// תרגיל 1
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num:");
		int num = sc.nextInt();
		
		if (num > 0)
		{
		System.out.println("The number is positive");	
		}
		
		else
		{
		System.out.println("The number is negative");	
		}
	}	
}
//תרגיל 2
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		if (num1 < num2)
		{
		System.out.println("number 1 smaller then number 2");
		}
		else
		{
		System.out.println("number 2 smaller then number1");	
		}
	}
}
// תרגיל 3
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rider 1 name: ");
		String name1 = sc.nextLine();
		System.out.println("nter rider 2 name: ");
		String name2 = sc.nextLine();
		System.out.println("nter rider 1 speed: ");
		int speed1 = sc.nextInt();
		System.out.println("Enter rider 2 speed: ");
		int speed2 = sc.nextInt();
		System.out.println("Enter rider distance: ");
		int distance1 = sc.nextInt();
		System.out.print("Enter rider 2 distance: ");
		int distance2 = sc.nextInt();
		int x1 = (speed1 * distance1);
		int x2 = (speed2 * distance2);
		if (x1 < x2)
		{
		System.out.println(name1+" arrived in less time");
		}
		else
		{
		System.out.println(name2+" arrived in less time");
		}
	}
}
// תרגיל 4 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter grade1: ");
		int grade1 = sc.nextInt();
		System.out.println("Enter grade2: ");
		int grade2 = sc.nextInt();
		System.out.println("Enter grade3: ");
		int grade3 = sc.nextInt();
		double average = (double)(grade1 + grade2 + grade3)/3;
		System.out.println("Your grades average is: "+average);
	}
}
// תרגיל 5
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter number 3: ");
		int num3 = sc.nextInt();
		if ((num1 < num2) && (num1 < num3))
		{
		System.out.println("number 1 is the lower number");
		}
		if ((num2 < num1) && (num2 < num3))
		{
		System.out.println("nuber 2 is the lower number");
		}
		if ((num3 < num1) && (num3 < num2))
		{
		System.out.print("Enter number 3 is lowr number");
		}
	}
}
// תרגיל 6
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1: ");
		int x1 = sc.nextInt();
		System.out.print("Enter x2: ");
		int x2 = sc.nextInt();
		System.out.println("Enter y1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter y2: ");
		int y2 = sc.nextInt();
		double distance = Math.sqrt((Math.pow(x1+x1,2)) + (Math.pow(y1+y2,2)));
		System.out.println(distance);
	}
}
// תרגיל 7
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a1: ");
		int a1 = sc.nextInt();
		System.out.println("Enter d: ");
		int d = sc.nextInt();
		int a5 = a1+d*(5-1);
		int a10 = a1+d*(10-1);
		System.out.println(a5+"\n"+a10);
	}
}
// תרגיל 8 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units: ");
		int units = sc.nextInt();
		int discount,regular;
		if (units > 0 && units < 10)
			System.out.print(units * 1.2);
		else if (units == 10)
		    	System.out.println(10);
			 else if (units > 10 && units < 54)
				  {
				  discount = units / 10;
				  regular = units % 10;
				  System.out.println((discount*10) + (regular*1.2));
				  }
		       	  else if(units == 54)
					    	System.out.println(54);
					    else if (units > 54 && units < 108)
						     {
						    	discount = (units - 54) / 10;
						    	regular = (units -54) % 10;	
						    	System.out.println(50 + (discount*10) + (regular*1.2)); 	
						     }
						     else if (units == 108)
							       	System.out.println(100);
							      else
							    	 System.out.println("Error");
		
	}
}
// תרגיל 9 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first ans last name: ");
		String name = sc.nextLine();
		System.out.println("Enter your school name: ");
		String school = sc.nextLine();
		System.out.println("Enter your subjects studying: ");
		String subjects = sc.nextLine();
		System.out.println("My name is "+name+" my school is "+school+" and the number of subjects stusy is "+subjects);
	}
}
// תרגיל 10
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int num1 = num / 100;
		int num2 = (num % 100) / 10;
		int num3 = num % 10;
		System.out.println(num1+"\n"+num2+"\n"+num3);
		System.out.println(num1+num2+num3);
	}
}
