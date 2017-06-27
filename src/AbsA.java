/**
 * Created by me on 17/06/27.
 */
public abstract class AbsA implements IA {

	@Override public void doA() {

		doB();
	}

	public void doB() {
		System.out.printf("abstractA: doB");
	}
}
