package generic;

public class ExchangePosition {
	
	<T> void exchangePosition(T a, T b, T[] arr){
		int aPos = -1;
		int bPos = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(a)){
				aPos = i;
			}
			if(arr[i].equals(b)){
				bPos = i;
			}
			if(aPos>-1 && bPos>-1){
				break;
			}
		}
		arr[aPos] = b;
		arr[bPos] = a;
		
	}
	
	public static void main(String ...s){
		String[] strArr = new String[]{"A","B","C","D","E"};
		print(strArr);
		ExchangePosition obj = new ExchangePosition();
		obj.<String>exchangePosition("A","C",strArr);
		print(strArr);
		
		Integer intArr[] = new Integer[]{1,2,3,4,5};
		print(intArr);
		obj.<Integer>exchangePosition(1,3,intArr);
		print(intArr);
	}

	private static <T> void print(T[] arr) {
		for(T obt : arr){
			System.out.print(obt+",");
		}
		System.out.println();
		
	}

}
