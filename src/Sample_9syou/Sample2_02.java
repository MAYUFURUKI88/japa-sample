package Sample_9syou;

public class Sample2_02 {

	public static void main(String args[]) {

        EmployeeModel modelTanaka = new EmployeeModel();
        modelTanaka.name = "タナカ";
        modelTanaka.age = 31;
        modelTanaka.height = 200;

        EmployeeModel modelKawabata = new EmployeeModel();
        modelKawabata.name = "カワバタ";
        modelKawabata.age = 29;
        modelKawabata.height = 180;

        System.out.println(modelTanaka.name);
        System.out.println(modelTanaka.age);
        System.out.println(modelKawabata.name);
        System.out.println(modelKawabata.age);
    }

}