import java.util.Scanner;

public class Tester {
	public static void f1() {
		int i, grade, num=0, ave, sum=0;
		Scanner sc = new Scanner(System.in);
		for (i=0;i<5;i++) {
			num++;
			System.out.println("Enter grade "+num);
			grade = sc.nextInt();
			sum = sum+grade;
		}
		ave = sum/5;
		System.out.println("The grades average is "+ave);
	}
	
	public static void f2() {
		String str; 
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		str = sc.next();
		while (!str.equals("enter")) {
			System.out.println("Enter String");
			str = sc.next();
			sum++;
		}
		System.out.println("finally!\nyou enter "+sum+" words");	
	}
	
	public static void f3(int secret_code) {
		int user_code, attemps = 0;
		Scanner sc = new Scanner(System.in);
		do {
			attemps++;
			System.out.println("Enter secret code (try "+attemps+")");
			user_code = sc.nextInt();
			if(user_code == secret_code) {
				System.out.println("How much money?");
				break;
			}
			else
				if(attemps == 3) {
					System.out.println("mother fucker! I call the police");
					break;
				}
		}while (user_code != secret_code);
	}
	
	public static void f4(String str) {
    	int len = str.length()-1, letter = 0, ans = 0;
    	char i_first = str.charAt(letter), i_last = str.charAt(len);
        
        while(len > -1){
            if(i_first == i_last){
                len--;
                letter++;
                ans++;
            }    
            else {
            	System.out.println(false);
            	break;
            }  
        }
        if(ans==str.length())
        	System.out.println(true);
    }
	
	public static void f5(int num) {
		for (int i=1; i<num+1; i++) {
            if (num%i==0) {
                System.out.print(i);
                if (i!=num)
                    System.out.print(", ");
            }
        }
	}
	
	public static void f6() {
	    int i, j, num1=0, num2=0, ans=0;
	    
	    for(i=0; i<10; i++) {
	        num1++;
	        for(j=0; j<10; j++) {
	            num2++;
	            ans = num1*num2;
	            System.out.println(num1+"*"+num2+"="+ans);
	        }
	        System.out.println();
	        num2 = 0;
	    }
	}	
	
	 public static void f7() {
		Scanner sc = new Scanner(System.in);
		int grade_num = 1, min_grade=100,max_grade=0;
		
		while(grade_num <= 7){
			System.out.println("Enter grade "+grade_num);
			int grade = sc.nextInt();
			
			if(min_grade>grade)
				min_grade = grade;
			
			else if(max_grade<grade)
				max_grade = grade;
			
			grade_num++;
		}
		System.out.println("min grade: "+min_grade+"");
		System.out.println("max grade: "+max_grade+"");
	}
	
	 public static boolean f8(int num) {
		 int i, num1=1, num2=0, num3;
		 boolean ans;
		 while(num1<num) {
			 num3 = num1;
			 num1 = num1 + num2;
			 num2 = num3;
		 }
		 if (num1 == num)
			 return true;
		 else
			 return false;
	 }
	
	 public static void f9(int num1, int num2) {
		 int i, ans=0;
		 for(i=0; i<num1; i++) {
			 ans = ans + num2;
		 }
		 System.out.println(ans);
		 
	 }
	 
	 public static void f10(int height) {
		 
	 }
	public static void main(String[] args) {
		f1();
		f2();
		f3(2367);
		f4("Daniel");
		f5(25);
		f6();
		f7();
		f8(144);
		f9(6,7);
	}
}
