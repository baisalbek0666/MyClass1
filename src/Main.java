//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] courses1 = {"Java", "JavaScript"};
        MyClass myClass1 = new MyClass("Baisal", "Tolomushov", 18, courses1, "Плов");

        MyClass myClass = new MyClass();
        myClass.name = "Baisal";
        myClass.age = 18;
        myClass.courses = courses1;


        myClass1.myClass1();
        myClass.myClass1();

    }
}