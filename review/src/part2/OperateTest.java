package part2;

public class OperateTest {
	public static void main(String[] args) {
		OperatorClass op = new OperatorClass();
		op.setNum(10, 20);
		int result = op.sum();
		System.out.println(result);
	}
}
