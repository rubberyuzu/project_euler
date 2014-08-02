
public class prob2 {
	public static void main(String[] args){
		int index = new prob2().calcIndex(4000000,5000);
		String strInd = Integer.toString(index);
		System.out.println(strInd);
		String strFib = Integer.toString(new prob2().fibonacci(index));
		System.out.println(strFib);
		String answer = Integer.toString(new prob2().calcSum(index));
		System.out.println(answer);
	}
	
	public static int fibonacci(int num){
		int[] array;
		array = new int[num];
		for(int i=0; i<num; i++){
			if(i==0){
				array[i] = 1;
			}else if(i==1){
				array[i] = 2;
			}else{
				array[i] = array[i-1] + array[i-2];
			}
		}
		System.out.println(array[num-1]);
		return array[num-1];
	}
	public static int calcSum(int num){
		int sum = 0;
		for(int i=1; i<=num; i++){
			if(fibonacci(i)%2==0){
			sum += fibonacci(i);
			}
		}
		return sum;
	}
	
	public int calcIndex(int num, int max){
		for(int i=1; i<=max; i++){
			if(fibonacci(i)>=num){
				return i-1;
			}
		}
		return -1;
	}
}
