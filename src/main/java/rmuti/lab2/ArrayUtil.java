package rmuti.lab2;

public class ArrayUtil {
	private int[] data;
	
	public ArrayUtil(int[] arr) {
		
		data = arr;
		
		
	}
	
	public int sumArray() {
		int sum = 0;
		
		for(int i = 0;i<data.length;i++) {
			
			sum = sum + data[i];
			}
		return sum;
		
	}
	public int countOne() {
		
		int c = 0;
		for(int i = 0;i<data.length;i++) {
			int data2 =data[i]; 
			if(data2==1){
				c++;
				}
			}
		return c ;
	}
	
	public int[] findOne() {
		
		int v = countOne();
		
		int arr[] = new int[v];
		
		for(int i = 0; i<v; i++) {
			arr[i] = 1;
		}
		return arr;
	}
	public int[] doubleArray() {
		int n = data.length *2;
		
		int newA[] = new int[n];
		
		for(int i = 0; i<data.length; i++) {
			
			newA[i] = data[i];
		}
		return newA;
		
	}
 
	}