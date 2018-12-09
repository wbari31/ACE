package generic;

public class MiddleElementTest {
	<T> T middleElement(T[] arr){
		return arr[arr.length/2];
	}
	
	public static void main(String ...s){
		MiddleElementTest test = new MiddleElementTest();
		
		String[] strArr = new String[]{"One","two","three","Four","Five","Six"};
		System.out.println(test.<String>middleElement(strArr));
		
		Integer[] intArr = new Integer[]{1,2,3,4,5};
		System.out.println(test.<Integer>middleElement(intArr));
	}

}
