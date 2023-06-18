
public class Sum<E extends Number> {
	
	private E num1, num2;

	public Sum(E num1, E num2) {
		// TODO Auto-generated constructor stub
		this.num1 = num1;
		this.num2 = num2;
	}
	public E getNum1() {
		return num1;
	}
	public E getNum2() {
		return num2;
	}
	public int getSum(Sum<? extends E> s) {
		this.num1 = s.getNum1();
		this.num2 = s.getNum2();
		
		return num1.intValue() + num2.intValue();
	}
}
