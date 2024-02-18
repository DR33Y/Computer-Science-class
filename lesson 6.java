package example;

import java.util.Scanner;
import java.util.Random;

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
		do {
			System.out.println("Enter String");
			str = sc.nextLine();
			sum++;
		}
		while (!str.equals("enter"));
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
	
	public static void f4(int num) {
		
		int units=0;
		while(num>0) {
			num = num/10;
			units++;
		}
		System.out.println("The number has "+units+" units");
	}
	public static int f5(int num) {
		int i, num_units=0, sum=0;
		while(num > 0) {
			num_units = num%10; 
			sum += num_units;
			num /= 10;
		}
		return sum;
	}
	public static void f6(String str) {
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
	
	public static void f7(int num) {
		for (int i=1; i<num+1; i++) {
            if (num%i==0) {
                System.out.print(i);
                if (i!=num)
                    System.out.print(", ");
            }
        }
	}
	
	public static void f8() {
	    int i, j, numbers=0;
	    
	    for(i=0; i<10; i++) {
	        for(j=0; j<10; j++) {
	        	numbers++;
	            System.out.print(numbers+" ");
	        }
	        System.out.println(" ");
	    }
	}	
	
	 public static void f9() {
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
	
	 public static boolean f10(int num) {
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
	
	 public static void f11(int num1, int num2) {
		 int i, ans=0;
		 for(i=0; i<num1; i++) {
			 ans = ans + num2;
		 }
		 System.out.println(ans);
		 
	 }

	 public static void f12(int height) {
		 int i, j;
		 int fix = height-1;
		 int base = fix+height;
		 int x1 = base/2;
		 int x2 = base/2;
		 for(i=0; i<height; i++) {
			 for(j=0; j<base; j++) {
				 if(j >= x1 && j <= x2)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 x1--;
			 x2++;
			 System.out.println();
		 }
	 }
	public static void  f13(int a1, int d, int n) {
		int curr_n=1, i;
		 for(i=0; i<d; i++) {
			int an = a1+d*(curr_n-1);
			System.out.println("for n = "+curr_n+". an = "+an);
			curr_n++;
		 }
	}
	
	public static void f14(int i1, int i2) {
		int cnt=0, num1=1, num2=0, num3;
		do {
			num3 = num1;
			num1 = num1 + num2;
			num2 = num3;
			cnt++;
			if(cnt<i1)
				continue;
			System.out.print(num2);
			if(cnt<i2-1)
				System.out.print(",");
		}while(cnt<i2-1);
	}
	
	public static void f16(int a, int b) {
		int i, n=1;
		double ans=0;
		for(i=0; i<10; i++) {
			ans = a*Math.pow(b,n-1);
			System.out.println("series "+n+" member is: "+ans);
			n++;
		}
	}
	
	public static void f17(double month, double mortgage) {
		double sum=0, interest = 0.005, fund = mortgage/month, ave_month=0, curr_mortgage = mortgage;
		int cnt=0;
		while(cnt<month) {
			sum = fund+(curr_mortgage*interest);
			ave_month += sum; 
			curr_mortgage -= fund;
			cnt++;
		}
		System.out.println("monthly payment "+ave_month/month+"\ntotal payment: "+mortgage);
	}
	
	public static void f20() {
		Scanner sc = new Scanner(System.in);
		int i, math_grade=0, english_grade=0;
		double highest_ave=0;
		String math_name= " ", english_name = " ", ave_name = " ";
		
		for(i=1; i<=3; i++){
			System.out.print("Enter student "+i+" name: ");
			String student_name = sc.next();

			System.out.print("Enter math grade: ");
			int math = sc.nextInt();
			System.out.print("Enter english grade: ");
			int english = sc.nextInt();
			
			double ave = math+english/2;
			if(ave > highest_ave) {
				ave_name = student_name;
				highest_ave = ave;
			}
			
			if(math > math_grade) {
				math_name = student_name;
				math_grade = math;
			}
			
			if(english > english_grade) {
				english_name = student_name;
				english_grade = english;
			}
		}
		System.out.println("The student with the hieghest grade in math is "+math_name);
		System.out.println("The student with the hieghest grade in english is "+english_name);
		System.out.println("The student with the hieghest average is"+ave_name);
	}
	public static void main(String[] args) { 
	}
	
}
