public class Tester {
	public static int f1(String[] arr, int num) {
		int i;
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			  if(num == arr[i].length())
				  sum++;
		}
		return sum   ;
	}
