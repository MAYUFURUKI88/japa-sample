package Sample13;

public class Main {

	public static void main(String args[]) {

        Main main = new Main();

        main.proc(new Sub1());
        main.proc(new Sub2());
    }
	public void proc(MainAbstract subs){

		subs.outStartLog();
		subs.proc();
		subs.outEndLog();
	}

}
