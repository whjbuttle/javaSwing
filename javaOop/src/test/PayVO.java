package test;

public class PayVO {
	/* 
	 필드에 선언된 인스턴스 변수는 반드시 접근제한자들 중 
	 private 으로 선언하여 은닉화를 만들어야한다
	 */
	
	private String name;	//직원이름
	private int salary;
	public static final double TAX = 0.1;	// 세율 10%는 고정값
	double income;		// 실급여는 = 급여 - 세액(급여*세율)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = salary - (salary * TAX);
	}
	
}
