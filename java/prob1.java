
public class prob1 {
	public static void main(String[] args){
		System.out.println(new prob1().calcSum(1000));
	}
	
	public String calcSum(int num) {
		int sum = 0;
		for(int i=0; i < num; i++){
			if(i%3==0 || i%5==0){
				sum += i;
			}
		}
		return Integer.toString(sum);
	}
}