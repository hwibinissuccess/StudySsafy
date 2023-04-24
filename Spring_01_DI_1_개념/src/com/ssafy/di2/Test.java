package Spring_01_DI_1_개념.src.com.ssafy.di2;

public class Test {
	public static void main(String[] args) {
		Desktop computer = new Desktop();
		Programmer p = new Programmer(computer);
		p.coding();
	}
}
