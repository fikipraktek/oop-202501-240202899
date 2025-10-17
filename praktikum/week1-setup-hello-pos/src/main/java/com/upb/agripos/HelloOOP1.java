package main.java.com.upb.agripos;


class Student {
    String nim;
    String name;
    Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP1 {
    public static void main(String[] args) {
        Student s = new Student("240202899", "Fiki Anto");
        s.introduce();
    }
}