public class Tester {
	public static void f1(int[] arr, int index) {
		if(index <= arr.length) {
			if(arr[index]%2 != 0)
				arr[index]++;
		}
		else
			System.out.println("Error");
	}
	public static void main(String[] args) {
		int i;
		int[] arr = {1,4,5,8,7};
		f1(arr, 2);
		for(i=0; i<arr.length; i++) 
			System.out.print(arr[i]+" ");
	}
}
