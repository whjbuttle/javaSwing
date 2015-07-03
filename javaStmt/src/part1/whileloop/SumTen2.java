package part1.whileloop;

public class SumTen2 {
	public static void main(String[] args) {
		//while문 1부터 10까지 합
		int num = 0, sum = 0;
		while (num < 11) {
			sum += num;
			// sum = sum + num;
			num++;
			// num = num + 1;
		}
		System.out.println(sum);
		
		//do-while문 1부터 10까지 합
		int num2 = 0, sum2 = 0;
		do{
			sum2 += num2;
			num2++;
		}while(num2<11);
		System.out.println(sum2);
		
		//for문 1부터 10까지 합
		int sum3 = 0;
		for(int num3 = 0; num3 < 11; num3++){
			sum3 += num3;
		}
		System.out.println(sum3);
	}
}
