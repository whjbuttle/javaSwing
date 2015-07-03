package stmt.flow;

public class OddEvenSum {
	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		
		int i = 1;
		while(i <=10){
			oddSum += i;
			i += 2;
		}
		
		i = 2;
		while(i<=10){
			evenSum += i;
			i += 2;
		}
		
		System.out.println("È¦¼ö ÇÕ : " + oddSum);
		System.out.println("Â¦¼ö ÇÕ : " + evenSum);
		
		//for¹®
		
		oddSum = 0;
		evenSum = 0;
		for(int j=1; j<11; j++){
			if(j%2==0){
				evenSum += j;
			}
			if(j%2==1){
				oddSum += j;
			}
		}
	}
}
