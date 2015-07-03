package part1.array;
//1부터 10까지의 합
public class ForLoopAssign {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		int sum = 0;
		for(int i = 0; i < intArr.length; i++){
			
			//0대신 몇을 넣어야 값을 활용한 실제 값을 넣을 수 있나?
			intArr[i] = i+1; // 변수선언을 최소화
			sum += intArr[i];
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
