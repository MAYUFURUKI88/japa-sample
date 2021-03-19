package Sample15;

public class Parent {

	private Child childInstance = new Child();

	public void callChild() {

		childInstance.whoAreYou();
		childInstance.causeException();
	}

}
