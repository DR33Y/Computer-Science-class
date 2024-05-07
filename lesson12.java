import java.util.Random;
import java.util.Scanner;

public class Tester {
	public static void f1(int row, int col) {
		Random r = new Random();
		
		int[][] arr = new int[row][col];
		int i,j;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++)
				arr[i][j] = r.nextInt(0,101);
		}
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void f2() {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int i,j;
		int max=0;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.println("Enter row "+i+", col "+j+":");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(i=0; i<arr.length; i++) {   
			for(j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		for(i=0; i<arr.length; i++) {
			int sum=0;
			for(j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			if(sum > max)
				max = sum;
		}
		System.out.println("The biggest row sum is: "+max);
	}
	
	public static void f3(int row, int col) {
		Random r = new Random();
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		int i,j;
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				arr1[i][j] = r.nextInt(0,101);
				arr2[i][j] = r.nextInt(0,101); 
			}
		}
		
		int[][] arr3 = new int[row][col];
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void f4(int row, int col) {
		Random r = new Random();
		
		int[][] arr = new int[row][col];
		int i,j;
		
		System.out.println("Before change:");
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				arr[i][j] = r.nextInt(0,11);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After change:");
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void f5(int[][] arr) {
		int i;
		int sum1=0, sum2=0;
		
		for(i=0; i<arr.length; i++) 
			sum1 += arr[i][i];
		System.out.println("diagonal 1 sum: "+sum1);
		
		for(i=0; i<arr.length; i++) {
			sum2 += arr[(arr.length-1)-i][i];
		}
		System.out.println("diagonal 2 sum: "+sum2);
	}
	
	public static boolean f6(int[][] arr) {
		int i,j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int sum2=0;	
		for(i=0; i<arr.length; i++) {
			int sum1=0;
			for(j=0; j<arr[i].length; j++) {
				sum1 += arr[i][j];   
			}
			if(sum1 > sum2) 
				sum2 = sum1;
			else 
			    return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] arr = {{2,4,850},{1,7,8},{0,40,5}};
		System.out.println(f6(arr));
	}
}
