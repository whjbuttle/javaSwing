package part1.whileloop;
/*
 do ~ while문은 while문과 거의 일치하나 처음한 번은 무조건 수행하고 나서 조건을 비교한다는 차이점이 있다
 
 (형식)
 do{
 	문장;
 }while(조건);
 
 */
public class DoWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		do{
			System.out.print(count + "\t");
			count++;
		}while(count<11);
		System.out.println();
	}
}
