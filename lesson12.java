package example;

import java.util.Scanner;
import java.util.Random;

public class Tester {
	public static void f1(int row, int col) {
		Random r = new Random();
		int[][] arr = new int[row][col];
		int i,j;
		for(i=0; i < arr.length; i++) {
			for(j=0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(0,101);
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		
	}
	
	public static void f2() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int i,j;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.println("Enter row "+(i+1)+" and col "+(j+1)+": ");
				arr[i][j] = sc.nextInt();
			}
		}
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void f3(int row, int col) {
		Random r = new Random();
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] arr3 = new int[row][col];
		
		int i,j;
		//arr1 placement
		for(i=0; i<arr1.length; i++) {
			for(j=0; j<arr1[i].length; j++) {
				arr1[i][j] = r.nextInt(0,101);
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//arr2 placement
		for(i=0; i<arr2.length; i++) {
			for(j=0; j<arr2[i].length; j++) { 
				arr2[i][j] = r.nextInt(0,101);
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//arr3 placement
		for(i=0; i<arr3.length; i++) {
			for(j=0; j<arr3.length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void f5(int[][] arr) {
		int i,j;
		int sum=0;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				if(j==i)
					sum += arr[i][j];
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,1,1},{1,1,1},{1,1,1}};
		f5(arr);
	}
}
