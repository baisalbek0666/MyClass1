public class MyClass {
    String name;
    String surname;
    int age;
    String[] courses;
    String favoriteFood;

    public MyClass() {

    }
    public MyClass(String name, String surname, int age, String[] courses, String favoriteFood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courses = courses;
        this.favoriteFood = favoriteFood;
    }
    public void myClass1(){
        System.out.println("Аты: " + name);
        System.out.println("Фамилиясы: " + surname);
        System.out.println("Жашы: " + age);
        System.out.print("Катышкан сабактары: ");
        for (String course : courses) {
            System.out.print(course + " ");
        }
        System.out.println();
        System.out.println("Жакшы көргөн тамагы: " + favoriteFood);
        System.out.println("----------------------------");

    }
}

