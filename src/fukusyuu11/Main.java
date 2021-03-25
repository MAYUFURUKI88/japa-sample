package fukusyuu11;

public class Main {

    public static void main(String args[]) {

        Student s = new Student("名前", 1, "学年");
        s.eat();
        s.sleep();
        s.study();
        System.out.println("名前："
            + s.getName()
            + "、年齢："
            + s.getAge()
            + "、学年："
            + s.getGrade());

        Worker w = new Worker();
        w.eat();
        w.sleep();
        w.work();
        System.out.println("名前："
            + w.getName()
            + "、年齢："
            + w.getAge()
            + "、職業："
            + w.getOccupation());
    }
}