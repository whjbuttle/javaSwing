package part1.operator;

public class ConditionDemo {
	public static void main(String[] args) {
		int val1 = 1, val2 = 2;
		if((val1==1) && (val2!=2)){	//val1이 1이면서 val2가 2인 경우 (교집합)
			System.out.println("val1이 1이면서 val2가 2인 경우입니다.");
		}else if((val1==1) || (val2!=2)){	//val1이 1이거나 val2가 2인 경우 (합집합)
			System.out.println("val1이 1이거나 val2가 2인 경우입니다.");
		}
	}
}
