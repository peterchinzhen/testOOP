/**
 * Created by me on 17/06/27.
 */
public class Test {

	public static void main(String[] args) {
		System.out.println();

		IA ia = new AImpl();

		ia.doA();

		ia = new BImpl();

		ia.doA();
	}

}
