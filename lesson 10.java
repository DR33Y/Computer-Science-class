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
	
	public static boolean f5(int num) {
		Random r = new Random();
		
		int[] arr = new int[10];
		int i;
		for(i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(0,99)+1;
			if(arr[i] == num)
				return true;
		}
		return false;
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
		
		for(i=0; i<arr.length-1; i++) {
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
			for(j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == letter)
					sum++;
			}
		}
		return sum;
	}
	
	public static int f10(int[] arr, int num) {
		int i;
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i] > num)
				sum++;
		}
		return sum;
	}
	
	public static int f11(int[] arr) {
		int i;
		int first=0,diff=100;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i] > first)
				first = arr[i];
		}
		
		int second=0;
		for(i=0; i<arr.length; i++) {
			if(arr[i] != first) {
				if(first-arr[i] < diff) {
					diff = first-arr[i];
					second = arr[i];
				}
			}
		}
		return second;
	}
	
	
	public static void f12(int[] arr) {
		Random r = new Random();
		
		int i,j=0;
		int num = r.nextInt(0,101);
		System.out.println("Number: "+num);
		boolean change = true;
		
		System.out.println("Array before change:");
		for(i=0; i<arr.length; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		
		System.out.println("Array after change:");
		for(i=0; i<arr.length; i++) {
			if(arr[i] == num && j==0) {
				change = true;
				for(j=0; j<arr.length; j++) {
					if(arr[j] != num)
						System.out.print(arr[j]+" ");
				}
				break;
			}
			else 
				change = false;
		}
		if(change == false) {
			for(i=0; i<arr.length; i++)
				System.out.print(arr[i]+" ");
		}
		
	}
