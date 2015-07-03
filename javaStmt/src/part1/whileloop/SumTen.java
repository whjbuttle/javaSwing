package part1.whileloop;

public class SumTen {
	public static void main(String[] args) {
		//while문 10까지의 합
		int num = 0;
		int hap = 0;
		while(num<11){
			hap += num;
			num++;
		}
		System.out.println("While문 : 1부터 10까지의 합 = " + hap);
		
		//do-while문 10까지의 합
		int count = 1;
		int sum = 0;
		do{
			sum += count;
			count++;
		}while(count<11);
		System.out.println("Do-While문 : 1부터 10까지의 합 = " + sum);
		
		//for문 10까지의 합
		int total = 0;
		for(int i=0; i<=10; i++){
			total += i;
		}
		System.out.println("For문 : 1부터 10까지의 합 = " + total);
	}
}
