package Sample_9syou;

public class Sample2_03 {

	public static void main(String[] args) {
		StaticMethod.staticMethod("hello");
		
		
		StaticMethod instance = new StaticMethod();
		instance.unStaticMethod("hello");
		
		

	}

}
