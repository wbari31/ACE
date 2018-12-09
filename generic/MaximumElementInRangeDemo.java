package generic;

public class MaximumElementInRangeDemo {
	<T extends Number> T findMax(T[] arr, int start, int end){
		T ele = arr[start];
		for(int i=start+1;i<=end;i++){
			if(ele.doubleValue()<arr[i].doubleValue()){
				ele = arr[i];
			}
		}
		return ele;
	}

}
