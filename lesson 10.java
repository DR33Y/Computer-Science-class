package example;

import java.util.Scanner;
import java.util.Random;

public class Tester {
	
	public static void f1(int[] arr, int index) {
		if(index <= arr.length) {
			if(arr[index]%2 != 0)
				arr[index]++;
		}
		else
			System.out.println("Error");
	}
	
	public static void f2(int[] grades) {
		int i, sum=0;
		
		for(i=0; i<grades.length-1; i++) {
			sum += grades[i];
		}
		System.out.println("Your average is "+(double)sum/i);
	}
	
	public static void f3(int[] grades) {
		int i, min=100, max=0;
		
		for(i=0; i<grades.length; i++) {
			if(grades[i] < min)
				min = grades[i];
			if(grades[i] > max)
				max = grades[i];
		}
		System.out.println("The minimum grade is "+min+"\nThe maximum grade is "+max);
	}
	
	public static void f4(int[] numbers) {
		int i;
		int index1=0, index2=1;
		
		for(i=0; i<numbers.length-1; i++) {
			int index_sum = numbers[index1]+numbers[index2];
			if(index_sum%2!=0) 
				System.out.println(numbers[index1]+" "+numbers[index2]);
			index1++;
			index2++;
		}
	}
	
	public static void f5(int num) {
		Random r = new Random();
		
		int i;
		int[] numbers = new int[10];
		boolean ans=true;
		
		for(i=0; i<numbers.length; i++) {
			numbers[i] = r.nextInt(0,101);
			System.out.print(numbers[i]+" ");
		}
		System.out.println();

		for(i=0; i<numbers.length; i++) {
			if(num == numbers[i]) {
				ans=true;
				break;
			}
			else
				ans=false;
		}
		System.out.println(ans);
	}
	
	public static void f6() {
		Random r = new Random();
		
		int i;
		int[] numbers = new int[10];
		int index1=0, index2=1;
		
		for(i=0; i<numbers.length; i++) { 
			numbers[i] = r.nextInt(0,101);
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		for(i=0; i<numbers.length-1; i++) {
			if(numbers[index1]%2==0 && numbers[index2]%2==0)
				System.out.println(numbers[index1]+" "+numbers[index2]);
			index1++;
			index2++;
		}
	}
	
	public static void f7() {
		Random r = new Random();
		
		int i, max=0;
		int[] numbers = new int[10];
		
		for(i=0; i<numbers.length; i++)
			numbers[i] = r.nextInt(0,101);
		
		for(i=0; i<numbers.length; i++) {
			if(numbers[i] > max)
				max = numbers[i];
		}
		numbers[numbers.length-1]=max;
		
		for(i=0; i<numbers.length; i++)
			System.out.print(numbers[i]+" ");
	}
	
	public static int f8(int[] arr) {
		int i;
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i] < 0)
				arr[i] *= -1;
			sum += arr[i];
			
			if(sum == arr[i+1])
				return arr[i+1];
		}
		return -1;
	}
	
	public static int f9(String[] arr, char letter) {
		int i, j;
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			int len = arr[i].length();
			for(j=0; j<len; j++) {
				if(letter == arr[i].charAt(j))
					sum++;
			}
		}
		return sum;
	}
	
	public static void f10(int[] arr, int num) {
		int i;
		for(i=0; i<arr.length; i++) {
			if(arr[i] > num)
				System.out.print(i+" ");
		}
	}
	
	
	public static int f11(int[] arr) {
		int i, pre_max=2147483646;
		int max=0, dif, second_i=0;
		for(i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		for(i=0; i<arr.length; i++) {
			dif = max - arr[i];
			
			if(arr[i] == max)
				continue;
				if(dif < pre_max) {
					pre_max = dif;
					second_i = i;
				}
		}
		return second_i;
	}
	
	public static void f12(int arr[], int num) {
		int i, j;
		
		System.out.println("before change:");
		for(i=0; i<arr.length; i++) 
			System.out.print(arr[i]+", ");
		System.out.println();
		
		for(i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				for(j=i; j<arr.length-1; j++)
					arr[j] = arr[j+1];
			}
		}
		
		System.out.println("after change:");
		for(i=0; i<arr.length; i++) 
			System.out.print(arr[i]+", ");
	}

	
	public static void main(String[] args) {
	}
}
