public class TryCatch {
	@SuppressWarnings("null")
	public static void main(String[ ] args) {
		//Any number divided by zero.
		try {
			int result = 10/0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("Something went wrong.");
		} finally {
		      System.out.println("The 'try catch' is finished.");
		}
		
		//int a[]=null;a.length
		try {
			int a[] = null;
			System.out.println(a.length);
		} catch(NullPointerException e) {
			System.out.println("Something went wrong.");
		} finally {
		      System.out.println("The 'try catch' is finished.");
		}
		//ArrayIndexOutOfBounds example
		try {
			int arr[] = {1,2};
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong.");
		} finally {
		      System.out.println("The 'try catch' is finished.");
		}
	}
}
