class Student {
    private String name;   // private variable
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahim");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}